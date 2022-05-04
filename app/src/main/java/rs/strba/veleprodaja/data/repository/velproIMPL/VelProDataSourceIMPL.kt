package rs.strba.veleprodaja.data.repository.velproIMPL

import rs.strba.veleprodaja.data.db.VelProDao
import rs.strba.veleprodaja.data.db.enitetets.Buyer
import rs.strba.veleprodaja.data.db.enitetets.User
import rs.strba.veleprodaja.data.db.enitetets.Worker
import rs.strba.veleprodaja.data.repository.localdatasource.VelProLocalDataSource

class VelProDataSourceIMPL(private val velProDao: VelProDao) : VelProLocalDataSource {
    override suspend fun getBuyersFromDB(): List<Buyer> {
        return velProDao.getBuyer()
    }

    override suspend fun saveBuyerToDb(buyer: Buyer) {
        velProDao.saveBuyerId(buyer)
    }

    override suspend fun getWorkersFromDB(): List<Worker> {
        return velProDao.getWorker()
    }

    override suspend fun saveWorkerToDb(worker: Worker) {
        velProDao.saveWorkerId(worker)
    }

    override suspend fun getUsersFromDB(): List<User> {
        return velProDao.getUser()
    }

    override suspend fun saveUserToDb(user: User) {
        velProDao.saveUserId(user)
    }

}