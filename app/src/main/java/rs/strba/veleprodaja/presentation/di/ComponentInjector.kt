package rs.strba.veleprodaja.presentation.di
import rs.strba.veleprodaja.presentation.di.velProModule.VelProSubComponent
import rs.strba.veleprodaja.presentation.di.velProModule.main.VelProSubComponentRegistrationFragment
import rs.strba.veleprodaja.presentation.di.velProModule.main.VelProSubComponentLoginFragment

interface ComponentInjector {
    fun createIdSubComponent(): VelProSubComponent
    fun createIdInputSubComponent(): VelProSubComponentRegistrationFragment
    fun createIdSearchSubComponent(): VelProSubComponentLoginFragment
}