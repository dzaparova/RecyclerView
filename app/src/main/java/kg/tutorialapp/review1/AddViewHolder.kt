package kg.tutorialapp.review1

import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView




class AddViewHolder(itemView: View):BaseViewHolder<Any>(itemView){

   override fun bind(item: Any){
     var tv_url=itemView.findViewById<TextView>(R.id.tv_url)
       item as String
       tv_url.text=item
    }
    companion object{
        fun create(parent: ViewGroup,listener: MyAdapter.OnClickListener): AddViewHolder {
            val view=LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_add_viewholder,parent,false)
            return AddViewHolder(view).apply {
                itemView.setOnClickListener {
                    listener.OnAddClick(absoluteAdapterPosition)
                }
            }
        }
    }




}

