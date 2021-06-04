package kg.tutorialapp.review1

import android.accounts.AuthenticatorDescription
import android.os.Parcelable

data class Item(
         val id:Long,
         val name:String,
         val icon:Int
 )
data class ItemDetails(
 val id:Long,
 val name:String,
 val icon:Int,
 val creator: String,
 val description: String
)






