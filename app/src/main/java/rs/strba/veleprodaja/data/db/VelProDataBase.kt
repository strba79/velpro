package rs.strba.veleprodaja.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import rs.strba.veleprodaja.data.db.entities.Buyer
import rs.strba.veleprodaja.data.db.entities.User
import rs.strba.veleprodaja.data.db.entities.Worker

@Database(entities = [Buyer::class,User::class,Worker::class], version = 1, exportSchema = false)
abstract class VelProDataBase:RoomDatabase() {
    abstract fun velProDao(): VelProDao
}