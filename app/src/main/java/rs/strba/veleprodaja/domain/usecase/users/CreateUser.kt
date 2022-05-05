package rs.strba.veleprodaja.domain.usecase.users


import rs.strba.veleprodaja.data.db.entities.User
import rs.strba.veleprodaja.domain.repository.VelProRepository
import javax.inject.Inject

class CreateUser @Inject constructor(private val velProRepository: VelProRepository){
    suspend fun createUser(user: User)=velProRepository.saveUser(user)
}

