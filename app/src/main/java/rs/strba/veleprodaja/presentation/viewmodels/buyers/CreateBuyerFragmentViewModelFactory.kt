package rs.strba.veleprodaja.presentation.viewmodels.buyers

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import rs.strba.veleprodaja.domain.usecase.buyers.CreateBuyerUseCase
import javax.inject.Inject

class CreateBuyerFragmentViewModelFactory @Inject constructor(private val createBuyer: CreateBuyerUseCase): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
       return CreateBuyerFragmentViewModel(createBuyer) as T
    }
}