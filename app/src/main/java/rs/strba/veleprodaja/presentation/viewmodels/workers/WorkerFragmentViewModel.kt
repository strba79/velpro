package rs.strba.veleprodaja.presentation.viewmodels.workers

import androidx.lifecycle.ViewModel
import rs.strba.veleprodaja.domain.usecase.workers.GetWorkersUseCase

class WorkerFragmentViewModel(private val viewWorkersUseCase: GetWorkersUseCase):ViewModel() {
}