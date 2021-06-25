package kg.tutorialapp.review1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var myAdapter:MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setup()
    }
    private fun setup(){
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
//        recyclerView.layoutManager=LinearLayoutManager(this)
//        recyclerView.layoutManager=GridLayoutManager(this,3)
        myAdapter= MyAdapter()
        recyclerView.adapter=myAdapter
        myAdapter.setItems(Data.getLongListOfItems())


    }


}