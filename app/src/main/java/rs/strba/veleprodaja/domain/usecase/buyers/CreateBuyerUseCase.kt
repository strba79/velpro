package rs.strba.veleprodaja.domain.usecase.buyers

import rs.strba.veleprodaja.data.db.entities.Buyer
import rs.strba.veleprodaja.domain.repository.VelProRepository
import javax.inject.Inject

class CreateBuyerUseCase @Inject constructor(private val velProRepository: VelProRepository) {
    suspend fun createBuyer(buyer: Buyer)=velProRepository.saveBuyer(buyer)
}