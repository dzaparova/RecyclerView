package kg.tutorialapp.review1

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class FragmentItems:Fragment(R.layout.fragment_items),MyAdapter.OnClickListener {
    private lateinit var myAdapter:MyAdapter
    private lateinit var recyclerView:RecyclerView
    private lateinit var listener: FragmentItemsListener

    private lateinit var list:List<Any>


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentItemsListener) listener=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        setup()
    }
    private fun setup(){
        list=Data.getLongListOfItems()
        recyclerView= view?.findViewById<RecyclerView>(R.id.recyclerView)!!

        myAdapter= MyAdapter(this)
        recyclerView.adapter=myAdapter
        myAdapter.setItems(list)
    }

    override fun OnItenClick(position: Int) {
        val item=list[position] as Item
        listener.openFragmentItemDetails(item.id)

    }

    override fun OnAddClick(position: Int) {
        val url=list[position] as String
        listener.openBrowser(url)

    }

    override fun OnButtonClick(position: Int) {
        val item=list[position] as Item
        Toast.makeText(context,item.name,Toast.LENGTH_SHORT).show()
    }
}