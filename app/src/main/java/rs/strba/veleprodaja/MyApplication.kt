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
        return appComponent.velProSubComponent().create()
    }

    override fun createVelProSubComponentRegistration(): VelProSubComponentRegistrationFragment {
        return appComponent.velProSubComponentRegistration().create()
    }

    override fun createVelProSubComponentLogin(): VelProSubComponentLoginFragment {
        return appComponent.velProSubComponentLogin().create()
    }

    override fun createVelProSubComponentCreateWorker(): VelProSubComponentCreateWorkerFragment {
        return appComponent.velProSubComponentCreateWorker().create()
    }

    override fun createVelProSubComponentViewWorkers(): VelProSubComponentViewWorkersFragment {
        return appComponent.velProSubComponentViewWorkers().create()
    }

    override fun createVelProSubComponentWorker(): VelProSubComponentWorkerFragment {
        return appComponent.velProSubComponentWorker().create()
    }

    override fun createVelProSubComponentCreateBuyer(): VelProSubComponentCreateBuyerFragment {
        return appComponent.velProSubComponentCreateBuyer().create()
    }

    override fun createVelProSubComponentViewBuyers(): VelProSubComponentViewBuyersFragment {
        return appComponent.velProSubComponentViewBuyers().create()
    }

    override fun createVelProSubComponentBuyer(): VelProSubComponentBuyerFragment {
        return appComponent.velProSubComponentBuyer().create()
    }
}