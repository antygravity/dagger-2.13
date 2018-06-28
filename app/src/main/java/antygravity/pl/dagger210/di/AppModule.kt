package antygravity.pl.dagger210.di

import android.app.Application
import antygravity.pl.dagger210.LobbyApplication
import antygravity.pl.dagger210.service.CommonHelloService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideService() = CommonHelloService()

    @Provides
    @Singleton
    fun provideContext(app: Application) = app.applicationContext
}