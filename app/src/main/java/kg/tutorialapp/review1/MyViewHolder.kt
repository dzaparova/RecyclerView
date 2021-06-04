package kg.tutorialapp.review1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    fun bind(item: Item){

        itemView.run {
            val iv_icon=findViewById<ImageView>(R.id.iv_icon)
            val tv_name =findViewById<TextView>(R.id.tv_name)

            iv_icon.setImageResource(item.icon)
            tv_name.text=item.name
        }

    }
    companion object{
        fun create(parent: ViewGroup):MyViewHolder{
            val view =LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_view_holder,parent,false)
            return MyViewHolder(view)
        }
    }


}