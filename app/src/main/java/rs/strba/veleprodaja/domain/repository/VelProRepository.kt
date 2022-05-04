package rs.strba.veleprodaja.domain.repository

import rs.strba.veleprodaja.data.db.enitetets.Buyer
import rs.strba.veleprodaja.data.db.enitetets.User
import rs.strba.veleprodaja.data.db.enitetets.Worker

interface VelProRepository {
    suspend fun getWorker(): List<Worker>
    suspend fun saveWorker(worker: Worker)
    suspend fun getBuyer(): List<Buyer>
    suspend fun saveBuyer(buyer: Buyer)
    suspend fun getUser(): List<User>
    suspend fun saveUser(user: User)
}