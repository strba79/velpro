package rs.strba.veleprodaja

import android.app.Application
import rs.strba.veleprodaja.presentation.di.ComponentInjector
import rs.strba.veleprodaja.presentation.di.core.AppComponent
import rs.strba.veleprodaja.presentation.di.core.AppModule
import rs.strba.veleprodaja.presentation.di.core.DaggerAppComponent
import rs.strba.veleprodaja.presentation.di.velProModule.VelProSubComponent
import rs.strba.veleprodaja.presentation.di.velProModule.buyers.VelProSubComponentBuyerFragment
import rs.strba.veleprodaja.presentation.di.velProModule.buyers.VelProSubComponentCreateBuyerFragment
import rs.strba.veleprodaja.presentation.di.velProModule.buyers.VelProSubComponentViewBuyersFragment
import rs.strba.veleprodaja.presentation.di.velProModule.main.VelProSubComponentLoginFragment
import rs.strba.veleprodaja.presentation.di.velProModule.main.VelProSubComponentRegistrationFragment
import rs.strba.veleprodaja.presentation.di.velProModule.workers.VelProSubComponentCreateWorkerFragment
import rs.strba.veleprodaja.presentation.di.velProModule.workers.VelProSubComponentViewWorkersFragment
import rs.strba.veleprodaja.presentation.di.velProModule.workers.VelProSubComponentWorkerFragment

class MyApplication: Application(), ComponentInjector{

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .build()
    }

    override fun createVelProSubComponent(): VelProSubComponent {
        TODO("Not yet implemented")
    }

    override fun createVelProSubComponentRegistration(): VelProSubComponentRegistrationFragment {
        TODO("Not yet implemented")
    }

    override fun createVelProSubComponentLogin(): VelProSubComponentLoginFragment {
        TODO("Not yet implemented")
    }

    override fun createVelProSubComponentCreateWorker(): VelProSubComponentCreateWorkerFragment {
        TODO("Not yet implemented")
    }

    override fun createVelProSubComponentViewWorkers(): VelProSubComponentViewWorkersFragment {
        TODO("Not yet implemented")
    }

    override fun createVelProSubComponentWorker(): VelProSubComponentWorkerFragment {
        TODO("Not yet implemented")
    }

    override fun createVelProSubComponentCreateBuyer(): VelProSubComponentCreateBuyerFragment {
        TODO("Not yet implemented")
    }

    override fun createVelProSubComponentViewBuyers(): VelProSubComponentViewBuyersFragment {
        TODO("Not yet implemented")
    }

    override fun createVelProSubComponentBuyer(): VelProSubComponentBuyerFragment {
        TODO("Not yet implemented")
    }
}