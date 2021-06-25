package kg.tutorialapp.review1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView


class MyViewHolder(itemView: View):BaseViewHolder<Any>(itemView) {

    override fun bind(item: Any){
        item as Item
        itemView.run {
            val iv_icon=findViewById<ImageView>(R.id.iv_icon)
            val tv_name =findViewById<TextView>(R.id.tv_name)
            iv_icon.setImageResource(item.icon)
            tv_name.text=item.name
        }

    }

    companion object{
        fun create(parent: ViewGroup,listener: MyAdapter.OnClickListener):MyViewHolder{


            val view =LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_view_holder,parent,false)
            val holder= MyViewHolder(view)
            holder.itemView.setOnClickListener{
                listener.OnItenClick(holder.absoluteAdapterPosition)
            }

            holder.itemView.run{
                val button=view.findViewById<Button>(R.id.button)
                button.setOnClickListener {
                    listener.OnButtonClick( holder.absoluteAdapterPosition)
                }
            }
            return holder
        }
    }




}