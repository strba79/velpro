package rs.strba.veleprodaja.domain.usecase.buyers

import rs.strba.veleprodaja.data.db.entities.Buyer
import rs.strba.veleprodaja.domain.repository.VelProRepository
import javax.inject.Inject

class SaveEditBuyer @Inject constructor(private val velProRepository: VelProRepository) {
    suspend fun saveBuyer(buyer: Buyer)=velProRepository.saveBuyer(buyer)
}