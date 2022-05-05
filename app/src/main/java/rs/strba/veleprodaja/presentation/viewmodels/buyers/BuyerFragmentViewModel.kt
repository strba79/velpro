package rs.strba.veleprodaja.presentation.viewmodels.buyers

import androidx.lifecycle.ViewModel
import rs.strba.veleprodaja.domain.usecase.buyers.GetBuyersUseCase


class BuyerFragmentViewModel(private val getBuyers: GetBuyersUseCase): ViewModel() {
}