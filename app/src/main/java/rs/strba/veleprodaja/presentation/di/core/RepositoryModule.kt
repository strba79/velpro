package rs.strba.veleprodaja.presentation.di.core

import dagger.Module
import dagger.Provides
import rs.strba.veleprodaja.data.repository.VelProRepositoryIMPL
import rs.strba.veleprodaja.data.repository.localdatasource.VelProLocalDataSource
import rs.strba.veleprodaja.domain.repository.VelProRepository
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideVeProRepository(
        velProLocalDataSource: VelProLocalDataSource
    ): VelProRepository {
        return VelProRepositoryIMPL(velProLocalDataSource)
    }
}