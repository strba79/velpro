package rs.strba.veleprodaja.presentation.viewmodels.main

import androidx.lifecycle.ViewModel
import rs.strba.veleprodaja.domain.usecase.users.GetUserUseCase

class RegistrationFragmentViewModel(private val saveUser: GetUserUseCase): ViewModel() {
}