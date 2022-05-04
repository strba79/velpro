package rs.strba.veleprodaja.presentation.di.core

import dagger.Component
import rs.strba.veleprodaja.presentation.di.velProModule.VelProSubComponent
import rs.strba.veleprodaja.presentation.di.velProModule.buyers.VelProSubComponentBuyerFragment
import rs.strba.veleprodaja.presentation.di.velProModule.buyers.VelProSubComponentCreateBuyerFragment
import rs.strba.veleprodaja.presentation.di.velProModule.buyers.VelProSubComponentViewBuyersFragment
import rs.strba.veleprodaja.presentation.di.velProModule.main.VelProSubComponentRegistrationFragment
import rs.strba.veleprodaja.presentation.di.velProModule.main.VelProSubComponentLoginFragment
import rs.strba.veleprodaja.presentation.di.velProModule.workers.VelProSubComponentCreateWorkerFragment
import rs.strba.veleprodaja.presentation.di.velProModule.workers.VelProSubComponentViewWorkersFragment
import rs.strba.veleprodaja.presentation.di.velProModule.workers.VelProSubComponentWorkerFragment
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, DatabaseModule::class, RepositoryModule::class, LocalDataModule::class])
interface AppComponent {
    fun idSubComponent(): VelProSubComponent.Factory
    fun idSubComponentRegistration(): VelProSubComponentRegistrationFragment.FactoryRegistration
    fun idSubComponentLogin(): VelProSubComponentLoginFragment.FactoryLogin

    fun idSubComponentCreateWorker(): VelProSubComponentCreateWorkerFragment.FactoryCreateWorker
    fun idSubComponentViewWorkers(): VelProSubComponentViewWorkersFragment.FactoryViewWorkers
    fun idSubComponentWorker(): VelProSubComponentWorkerFragment.FactoryWorker

    fun idSubComponentCreateBuyer(): VelProSubComponentCreateBuyerFragment.FactoryCreateBuyer
    fun idSubComponentViewBuyers(): VelProSubComponentViewBuyersFragment.FactoryViewBuyer
    fun idSubComponentBuyer(): VelProSubComponentBuyerFragment.FactoryBuyer


}