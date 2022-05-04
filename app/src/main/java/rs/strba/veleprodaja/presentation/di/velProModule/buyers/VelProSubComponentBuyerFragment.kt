package rs.strba.veleprodaja.presentation.di.velProModule.buyers

import dagger.Subcomponent
import rs.strba.veleprodaja.presentation.di.velProModule.VelProModule
import rs.strba.veleprodaja.presentation.fragments.buyers.BuyerFragment
@Subcomponent(modules = [VelProModule::class])
interface VelProSubComponentBuyerFragment {
    fun injectBuyer(buyerFragment: BuyerFragment)
    @Subcomponent.Factory
    interface FactoryBuyer{
        fun create(): VelProSubComponentBuyerFragment
    }
}