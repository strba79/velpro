package rs.strba.veleprodaja.presentation.viewmodels.workers

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import rs.strba.veleprodaja.domain.usecase.workers.CreateWorkerUseCase
import javax.inject.Inject

class CreateWorkerFragmentViewModelFactory @Inject constructor(private val createWorkerUseCase: CreateWorkerUseCase):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
       return CreateWorkerFragmentViewModel(createWorkerUseCase)as T
    }
}