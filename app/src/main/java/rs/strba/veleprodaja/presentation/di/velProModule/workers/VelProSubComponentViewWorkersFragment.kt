package rs.strba.veleprodaja.presentation.di.velProModule.workers

import dagger.Subcomponent
import rs.strba.veleprodaja.presentation.di.velProModule.VelProModule
import rs.strba.veleprodaja.presentation.fragments.workers.ViewWorkersFragment

@Subcomponent(modules = [VelProModule::class])
interface VelProSubComponentViewWorkersFragment {
    fun injectViewWorkers(viewWorkersFragment: ViewWorkersFragment)
    @Subcomponent.Factory
    interface FactoryViewWorkers{
        fun create(): VelProSubComponentViewWorkersFragment
    }
}