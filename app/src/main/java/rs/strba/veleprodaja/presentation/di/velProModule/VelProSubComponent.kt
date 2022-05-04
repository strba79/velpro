package rs.strba.veleprodaja.presentation.di.velProModule

import dagger.Subcomponent
import rs.strba.veleprodaja.presentation.activities.MainActivity

@VelProScope
@Subcomponent(modules = [VelProModule::class])
interface VelProSubComponent {
    fun inject(mainActivity: MainActivity)
    @Subcomponent.Factory
    interface Factory{
        fun create(): VelProSubComponent
    }
}