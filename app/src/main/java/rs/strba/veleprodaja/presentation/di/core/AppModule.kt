package rs.strba.veleprodaja.presentation.di.core

import android.content.Context
import rs.strba.veleprodaja.presentation.di.velProModule.VelProSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module(subcomponents = [VelProSubComponent::class])
class AppModule(private val context: Context) {
    //@Singleton
    @Provides
    fun provideApplicationContext(): Context {
        return context.applicationContext
    }
}