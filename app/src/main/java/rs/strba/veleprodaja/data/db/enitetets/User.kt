package rs.strba.veleprodaja.data.db.enitetets

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey
    val id:Int,
    val name:String,
    val userName:String,
    val password:String,
)
