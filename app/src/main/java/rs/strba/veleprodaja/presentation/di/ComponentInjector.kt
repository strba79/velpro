package rs.strba.veleprodaja.presentation.di
import rs.strba.veleprodaja.presentation.di.velProModule.VelProSubComponent
import rs.strba.veleprodaja.presentation.di.velProModule.buyers.VelProSubComponentBuyerFragment
import rs.strba.veleprodaja.presentation.di.velProModule.buyers.VelProSubComponentCreateBuyerFragment
import rs.strba.veleprodaja.presentation.di.velProModule.buyers.VelProSubComponentViewBuyersFragment
import rs.strba.veleprodaja.presentation.di.velProModule.main.VelProSubComponentRegistrationFragment
import rs.strba.veleprodaja.presentation.di.velProModule.main.VelProSubComponentLoginFragment
import rs.strba.veleprodaja.presentation.di.velProModule.workers.VelProSubComponentCreateWorkerFragment
import rs.strba.veleprodaja.presentation.di.velProModule.workers.VelProSubComponentViewWorkersFragment
import rs.strba.veleprodaja.presentation.di.velProModule.workers.VelProSubComponentWorkerFragment

interface ComponentInjector {

    fun createVelProSubComponent(): VelProSubComponent
    fun createVelProSubComponentRegistration(): VelProSubComponentRegistrationFragment
    fun createVelProSubComponentLogin(): VelProSubComponentLoginFragment

    fun createVelProSubComponentCreateWorker(): VelProSubComponentCreateWorkerFragment
    fun createVelProSubComponentViewWorkers(): VelProSubComponentViewWorkersFragment
    fun createVelProSubComponentWorker(): VelProSubComponentWorkerFragment

    fun createVelProSubComponentCreateBuyer(): VelProSubComponentCreateBuyerFragment
    fun createVelProSubComponentViewBuyers(): VelProSubComponentViewBuyersFragment
    fun createVelProSubComponentBuyer(): VelProSubComponentBuyerFragment
}