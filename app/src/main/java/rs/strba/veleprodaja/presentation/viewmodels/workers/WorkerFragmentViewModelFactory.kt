package rs.strba.veleprodaja.presentation.viewmodels.workers

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import rs.strba.veleprodaja.domain.usecase.workers.GetWorkersUseCase
import javax.inject.Inject

class WorkerFragmentViewModelFactory @Inject constructor(private val viewWorkersUseCase: GetWorkersUseCase):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
       return WorkerFragmentViewModel(viewWorkersUseCase)as T
    }
}