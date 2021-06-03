package kg.tutorialapp.review1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }
    private fun setup(){
//        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
//        recyclerView.layoutManager=LinearLayoutManager(this)
    }
}