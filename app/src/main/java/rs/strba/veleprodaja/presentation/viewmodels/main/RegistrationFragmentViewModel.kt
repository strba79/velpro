package rs.strba.veleprodaja.presentation.viewmodels.main

import androidx.lifecycle.ViewModel
import rs.strba.veleprodaja.domain.usecase.users.GetUser

class RegistrationFragmentViewModel(private val saveUser: GetUser): ViewModel() {
}