package kg.tutorialapp.review1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.replace
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kg.tutorialapp.rev.FragmentItemDetails

class MainActivity : AppCompatActivity(),FragmentItemsListener{
//    private lateinit var myAdapter:MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }
//    private fun setup(){
//        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
////        recyclerView.layoutManager=LinearLayoutManager(this)
////        recyclerView.layoutManager=GridLayoutManager(this,3)
//        myAdapter= MyAdapter()
//        recyclerView.adapter=myAdapter
//        myAdapter.setItems(Data.getLongListOfItems())
//    }
    private fun setup(){
    supportFragmentManager.beginTransaction()
            .add(R.id.container,FragmentItems())
            .addToBackStack(null)
            .commit()
   }

    override fun openFragmentItemDetails(id: Long) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container,FragmentItemDetails.newInstance(id))
            .addToBackStack(null)
            .commit()
    }

    override fun openBrowser(url: String) {
        val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}