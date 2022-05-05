package rs.strba.veleprodaja.presentation.viewmodels.buyers

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import rs.strba.veleprodaja.domain.usecase.buyers.GetBuyersUseCase
import javax.inject.Inject

class ViewBuyersFragmentViewModelFactory @Inject constructor(private val getBuyers: GetBuyersUseCase) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ViewBuyersFragmentViewModel(getBuyers) as T
    }
}