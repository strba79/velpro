package rs.strba.veleprodaja.domain.repository

import kotlinx.coroutines.flow.Flow
import rs.strba.veleprodaja.data.db.entities.Buyer
import rs.strba.veleprodaja.data.db.entities.User
import rs.strba.veleprodaja.data.db.entities.Worker

interface VelProRepository {
    suspend fun getWorker(): List<Worker>
    suspend fun saveWorker(worker: Worker)
    suspend fun getBuyer(): List<Buyer>
    suspend fun saveBuyer(buyer: Buyer)
    suspend fun getUser(username: String, password: String): User
    suspend fun saveUser(user: User)
}