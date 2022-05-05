package rs.strba.veleprodaja.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import rs.strba.veleprodaja.data.db.entities.Buyer
import rs.strba.veleprodaja.data.db.entities.User
import rs.strba.veleprodaja.data.db.entities.Worker
@Dao
interface VelProDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveBuyerId(buyer: Buyer )

    @Query(value="SELECT * FROM velProBuyer")
    suspend fun getBuyer():List<Buyer>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveWorkerId(worker: Worker )

    @Query(value="SELECT * FROM velProWorker")
    suspend fun getWorker():List<Worker>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveUserId(user: User )

    @Query(value="SELECT * FROM User")
    suspend fun getUser():List<User>
}