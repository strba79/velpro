package rs.strba.veleprodaja.presentation.di.velProModule.main

import dagger.Subcomponent
import rs.strba.veleprodaja.presentation.di.velProModule.VelProModule
import rs.strba.veleprodaja.presentation.fragments.main.RegistrationFragment

@Subcomponent(modules = [VelProModule::class])
interface VelProSubComponentRegistrationFragment {
    fun injectRegistration(registrationFragment: RegistrationFragment)
    @Subcomponent.Factory
    interface FactoryRegistration{
        fun create(): VelProSubComponentRegistrationFragment
    }
}