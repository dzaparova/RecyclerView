package kg.tutorialapp.review1

import android.accounts.AuthenticatorDescription
import android.os.Parcel
import android.os.Parcelable

object Data {
    val items= listOf<Item>(
        Item(1,"Java",R.drawable.ic_baseline_anchor_24),
        Item(2,"KotlinKotlinKotlin",R.drawable.ic_baseline_android_24),
        Item(3,"Dark",R.drawable.ic_baseline_airplanemode_active_24)
    )

    val itemDetails=listOf<ItemDetails>(
        ItemDetails(1,"Java",R.drawable.ic_baseline_anchor_24,"Sun Macrosystem","One of the most"),
        ItemDetails(2,"Kotlin",R.drawable.ic_baseline_android_24,"JetBrain","Basicly"),
        ItemDetails(3,"Dark",R.drawable.ic_baseline_airplanemode_active_24,"Google","One language")
    )
    fun getLongListOfItems():MutableList<Any>{
        val list= mutableListOf<Any>()
            for(i in 1..100){
                val addAll = list.addAll(items)
                if (i % 3== 0)
                list.add("https://dart.dev/tutorials")

        }

        return list

    }

}






