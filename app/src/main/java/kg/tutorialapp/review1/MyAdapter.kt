package kg.tutorialapp.review1

import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.tutorialapp.review1.MyAdapter.Type.ADVERTISMENT
import kg.tutorialapp.review1.MyAdapter.Type.ITEM

class MyAdapter:RecyclerView.Adapter<BaseViewHolder<Any>> (){
    private val items= arrayListOf<Any>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):BaseViewHolder<Any>{
//        Log.i(MyAdapter.tag,"onCreateViewHolder")
       return when(viewType){
          ITEM-> MyViewHolder.create(parent)
          else->AddViewHolder.create(parent)
       }
    }


    override fun getItemCount(): Int {
        return items.count()
    }

    override fun getItemViewType(position: Int): Int {
        return when(items[position]){
            is String->ADVERTISMENT
            is Item-> ITEM
            else-> -1
        }
    }


    override fun onBindViewHolder(holder:BaseViewHolder<Any>, position: Int) {
        Log.i(MyAdapter.tag,"onBindViewHolder")
       holder.bind(items[position])
    }

    fun setItems(newItems: List<Any>){
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()

    }

    object Type{
        const val ITEM=0
        const val ADVERTISMENT=1
    }
    companion object{
        const val tag="ADAPTER"
    }
}