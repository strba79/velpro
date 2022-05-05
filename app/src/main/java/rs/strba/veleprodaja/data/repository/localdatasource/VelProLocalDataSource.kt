package rs.strba.veleprodaja.data.repository.localdatasource

import rs.strba.veleprodaja.data.db.entities.Buyer
import rs.strba.veleprodaja.data.db.entities.User
import rs.strba.veleprodaja.data.db.entities.Worker

interface VelProLocalDataSource {
    suspend fun getBuyersFromDB():List<Buyer>
    suspend fun saveBuyerToDb(buyer: Buyer)

    suspend fun getWorkersFromDB():List<Worker>
    suspend fun saveWorkerToDb(worker: Worker)

    suspend fun getUsersFromDB():User
    suspend fun saveUserToDb(user: User)

}