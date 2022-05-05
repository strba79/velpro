package rs.strba.veleprodaja.presentation.viewmodels.workers

import androidx.lifecycle.ViewModel
import rs.strba.veleprodaja.domain.usecase.workers.GetWorkersUseCase

class ViewWorkersFragmentViewModel(private val viewWorkersUseCase: GetWorkersUseCase): ViewModel() {
}