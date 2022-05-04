package rs.strba.veleprodaja.presentation.di.core

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import rs.strba.veleprodaja.data.db.VelProDao
import rs.strba.veleprodaja.data.db.VelProDataBase
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun database(context: Context): VelProDataBase =
        Room.databaseBuilder(context, VelProDataBase::class.java, "velpro's")
            .build()

    @Singleton
    @Provides
    fun velProDao(velProDataBase: VelProDataBase): VelProDao {
        return velProDataBase.velProDao()
    }

}