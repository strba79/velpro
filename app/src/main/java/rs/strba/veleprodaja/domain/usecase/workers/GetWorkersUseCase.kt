package rs.strba.veleprodaja.domain.usecase.workers

import rs.strba.veleprodaja.data.db.entities.Buyer
import rs.strba.veleprodaja.data.db.entities.Worker
import rs.strba.veleprodaja.domain.repository.VelProRepository
import javax.inject.Inject

class GetWorkersUseCase @Inject constructor(private val velProRepository: VelProRepository) {
    suspend fun getWorkers():List<Worker>{
        return velProRepository.getWorker()
    }
}