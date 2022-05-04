package rs.strba.veleprodaja.data.repository

import rs.strba.veleprodaja.data.db.enitetets.Buyer
import rs.strba.veleprodaja.data.db.enitetets.User
import rs.strba.veleprodaja.data.db.enitetets.Worker
import rs.strba.veleprodaja.data.repository.localdatasource.VelProLocalDataSource
import rs.strba.veleprodaja.domain.repository.VelProRepository

class VelProRepositoryIMPL(private val velProLocalDataSource: VelProLocalDataSource):VelProRepository {
    override suspend fun getWorker(): List<Worker> {
       return velProLocalDataSource.getWorkersFromDB()
    }

    override suspend fun saveWorker(worker: Worker) {
        velProLocalDataSource.saveWorkerToDb(worker)
    }

    override suspend fun getBuyer(): List<Buyer> {
       return velProLocalDataSource.getBuyersFromDB()
    }

    override suspend fun saveBuyer(buyer: Buyer) {
        velProLocalDataSource.saveBuyerToDb(buyer)
    }

    override suspend fun getUser(): List<User> {
        return velProLocalDataSource.getUsersFromDB()
    }

    override suspend fun saveUser(user: User) {
        velProLocalDataSource.saveUserToDb(user)
    }
}