package rs.strba.veleprodaja.presentation.di.velProModule.workers

import dagger.Subcomponent
import rs.strba.veleprodaja.presentation.di.velProModule.VelProModule
import rs.strba.veleprodaja.presentation.fragments.workers.CreateWorkerFragment

@Subcomponent(modules = [VelProModule::class])
interface VelProSubComponentCreateWorkerFragment {
    fun injectCreateWorker(createWorkerFragment: CreateWorkerFragment)
    @Subcomponent.Factory
    interface FactoryCreateWorker{
        fun create(): VelProSubComponentCreateWorkerFragment
    }
}