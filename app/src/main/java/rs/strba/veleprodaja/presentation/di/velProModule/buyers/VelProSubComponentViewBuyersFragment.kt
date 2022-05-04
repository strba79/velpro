package rs.strba.veleprodaja.presentation.di.velProModule.buyers

import dagger.Subcomponent
import rs.strba.veleprodaja.presentation.di.velProModule.VelProModule
import rs.strba.veleprodaja.presentation.fragments.buyers.ViewBuyersFragment

@Subcomponent(modules = [VelProModule::class])
interface VelProSubComponentViewBuyersFragment {
    fun injectViewBuyers(viewBuyersFragment: ViewBuyersFragment)
    @Subcomponent.Factory
    interface FactoryViewBuyer{
        fun create(): VelProSubComponentViewBuyersFragment
    }

}