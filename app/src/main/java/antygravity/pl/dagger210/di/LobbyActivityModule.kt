package antygravity.pl.dagger210.di

import antygravity.pl.dagger210.service.LobbyHelloService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LobbyActivityModule {

    @Provides
    fun provideLobbyHelloService() = LobbyHelloService();
}