package rs.strba.veleprodaja.presentation.di.velProModule.buyers

import dagger.Subcomponent
import rs.strba.veleprodaja.presentation.di.velProModule.VelProModule
import rs.strba.veleprodaja.presentation.fragments.buyers.CreateBuyerFragment

@Subcomponent(modules = [VelProModule::class])
interface VelProSubComponentCreateBuyerFragment {
    fun injectCreateBuyer(createBuyerFragment: CreateBuyerFragment)
    @Subcomponent.Factory
    interface FactoryCreateBuyer{
        fun create(): VelProSubComponentCreateBuyerFragment
    }
}