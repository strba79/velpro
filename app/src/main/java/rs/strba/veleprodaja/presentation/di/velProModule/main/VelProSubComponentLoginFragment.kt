package rs.strba.veleprodaja.presentation.di.velProModule.main

import dagger.Subcomponent
import rs.strba.veleprodaja.presentation.di.velProModule.VelProModule
import rs.strba.veleprodaja.presentation.fragments.main.LoginFragment

@Subcomponent(modules = [VelProModule::class])
interface VelProSubComponentLoginFragment {
    fun injectLogin(loginFragment: LoginFragment)
    @Subcomponent.Factory
    interface FactoryLogin{
        fun create(): VelProSubComponentLoginFragment
    }
}