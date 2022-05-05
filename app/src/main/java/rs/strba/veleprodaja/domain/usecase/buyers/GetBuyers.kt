package rs.strba.veleprodaja.domain.usecase.buyers

import rs.strba.veleprodaja.data.db.entities.Buyer
import rs.strba.veleprodaja.domain.repository.VelProRepository
import javax.inject.Inject

class GetBuyers @Inject constructor(private val velProRepository: VelProRepository) {
    suspend fun getBuyers():List<Buyer>{
        return velProRepository.getBuyer()
    }
}