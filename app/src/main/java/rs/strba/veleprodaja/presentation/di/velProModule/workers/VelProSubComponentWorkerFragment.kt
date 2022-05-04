package rs.strba.veleprodaja.presentation.di.velProModule.workers

import dagger.Subcomponent
import rs.strba.veleprodaja.presentation.di.velProModule.VelProModule
import rs.strba.veleprodaja.presentation.fragments.workers.ViewWorkersFragment

@Subcomponent(modules = [VelProModule::class])
interface VelProSubComponentWorkerFragment {
    fun injectWorker(workersFragment: ViewWorkersFragment)
    @Subcomponent.Factory
    interface FactoryWorker{
        fun create(): VelProSubComponentViewWorkersFragment
    }
}