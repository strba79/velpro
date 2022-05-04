package rs.strba.veleprodaja.data.repository.localdatasource

import rs.strba.veleprodaja.data.db.enitetets.Buyer
import rs.strba.veleprodaja.data.db.enitetets.User
import rs.strba.veleprodaja.data.db.enitetets.Worker

interface VelProLocalDataSource {
    suspend fun getBuyersFromDB():List<Buyer>
    suspend fun saveBuyerToDb(buyer: Buyer)

    suspend fun getWorkersFromDB():List<Worker>
    suspend fun saveWorkerToDb(worker: Worker)

    suspend fun getUsersFromDB():List<User>
    suspend fun saveUserToDb(user: User)

}