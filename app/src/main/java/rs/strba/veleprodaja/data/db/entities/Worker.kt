package rs.strba.veleprodaja.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "velProWorker")
data class Worker(
    @PrimaryKey
    val id: Int,
    val name: String,
    val familyName: String,
    val code: Int,
    val city: String,
    //val storage: List<Int>
)
