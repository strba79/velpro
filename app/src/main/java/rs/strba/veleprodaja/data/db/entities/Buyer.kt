package rs.strba.veleprodaja.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName="velProBuyer")
data class Buyer(
    @PrimaryKey
    val id:Int,
    val name:String,
    val pib:Int,
    //val managedBy:Worker
)
