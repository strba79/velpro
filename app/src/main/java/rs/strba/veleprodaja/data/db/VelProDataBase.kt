package rs.strba.veleprodaja.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import rs.strba.veleprodaja.data.db.enitetets.Buyer
import rs.strba.veleprodaja.data.db.enitetets.User
import rs.strba.veleprodaja.data.db.enitetets.Worker

@Database(entities = [Buyer::class,User::class,Worker::class], version = 1, exportSchema = false)
abstract class VelProDataBase:RoomDatabase() {
    abstract fun velProDao(): VelProDao
}