package rs.strba.veleprodaja.presentation.viewmodels.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import rs.strba.veleprodaja.domain.usecase.users.LogInUseCase
import javax.inject.Inject

class RegistrationFragmentViewModelFactory @Inject constructor(private val saveUser: LogInUseCase) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RegistrationFragmentViewModel(saveUser) as T
    }
}