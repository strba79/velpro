package rs.strba.veleprodaja.domain.usecase.workers

import rs.strba.veleprodaja.data.db.entities.Worker
import rs.strba.veleprodaja.domain.repository.VelProRepository
import javax.inject.Inject

class SaveEditWorker @Inject constructor(private val velProRepository: VelProRepository) {
    suspend fun saveWorker(worker: Worker)=velProRepository.saveWorker(worker)
}