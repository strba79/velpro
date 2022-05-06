package rs.strba.veleprodaja.presentation.viewmodels.main

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow
import rs.strba.veleprodaja.data.db.entities.User
import rs.strba.veleprodaja.domain.usecase.users.LogInUseCase

class LoginFragmentViewModel(private val getUser: LogInUseCase): ViewModel() {

    suspend fun getUser(username:String,password:String): User? {
        return getUser.getUser(username,password)
    }


}