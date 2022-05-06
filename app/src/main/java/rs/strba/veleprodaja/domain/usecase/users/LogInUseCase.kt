package rs.strba.veleprodaja.domain.usecase.users


import kotlinx.coroutines.flow.Flow
import rs.strba.veleprodaja.data.db.entities.User
import rs.strba.veleprodaja.domain.repository.VelProRepository
import javax.inject.Inject

class LogInUseCase @Inject constructor(private val velProRepository: VelProRepository) {
    suspend fun getUser(username: String, password: String): User {
        return velProRepository.getUser(username,password)
    }


}