package kg.tutorialapp. rev

import kg.tutorialapp.review1.Data
import kg.tutorialapp.review1.R



import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentItemDetails:Fragment(R.layout.fragmentitem_details) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }
    private fun setup(){
        val iv_detail_icon= view?.findViewById<ImageView>(R.id.iv_detail_icon)
        val tv_detail_name=view?.findViewById<TextView>(R.id.tv_detail_name)
        val tv_details_creator=view?.findViewById<TextView>(R.id.tv_details_creator)
        val tv_detail_description=view?.findViewById<TextView>(R.id.tv_detail_description)
        val idFromArgs=arguments?.getLong(Long::class.java.canonicalName)
        idFromArgs?.let{id->
            val details= Data.itemDetails.find { it.id==id}
            details?.let{
                iv_detail_icon?.setImageResource(details.icon)
                tv_detail_name?.text =details.name
                tv_details_creator?.text =details.creator
                tv_detail_description?.text=details.description
            }

        }
    }
    companion object{
        fun newInstance(id:Long):FragmentItemDetails{
            val bundle=Bundle().apply {
                putLong(Long::class.java.canonicalName,id)
            }
            return FragmentItemDetails().apply { arguments=bundle }
        }

    }
}