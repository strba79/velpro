package rs.strba.veleprodaja.domain.usecase.users


import rs.strba.veleprodaja.data.db.entities.User
import rs.strba.veleprodaja.domain.repository.VelProRepository
import javax.inject.Inject

class GetUser @Inject constructor(private val velProRepository: VelProRepository) {
    suspend fun getUser():User{
        return velProRepository.getUser()
    }
}