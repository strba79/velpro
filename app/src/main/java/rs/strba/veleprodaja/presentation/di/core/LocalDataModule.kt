package rs.strba.veleprodaja.presentation.di.core

import dagger.Module
import dagger.Provides
import rs.strba.veleprodaja.data.db.VelProDao
import rs.strba.veleprodaja.data.repository.localdatasource.VelProLocalDataSource
import rs.strba.veleprodaja.data.repository.velproIMPL.VelProDataSourceIMPL
import javax.inject.Singleton

@Module
class LocalDataModule {
    @Singleton
    @Provides
    fun provideVelProLocalDataSource(velProDao: VelProDao): VelProLocalDataSource {
        return VelProDataSourceIMPL(velProDao)
    }
}