package rs.strba.veleprodaja.presentation.viewmodels.main

import androidx.lifecycle.ViewModel
import rs.strba.veleprodaja.data.db.entities.User
import rs.strba.veleprodaja.domain.usecase.users.CreateUserUseCase
import rs.strba.veleprodaja.domain.usecase.users.LogInUseCase

class RegistrationFragmentViewModel(private val saveUser: CreateUserUseCase): ViewModel() {
    suspend fun createUser(name:String,username:String,password:String) {
        saveUser.createUser(User(0,name,username,password))
    }
}