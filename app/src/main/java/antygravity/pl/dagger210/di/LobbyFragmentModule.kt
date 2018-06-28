package antygravity.pl.dagger210.di

import antygravity.pl.dagger210.lobby.LobbyFragment
import antygravity.pl.dagger210.service.LobbyFragmentHelloService
import dagger.Module
import dagger.Provides

@Module
class LobbyFragmentModule {

    @Provides
    fun provideLobbyFragmentHelloService () = LobbyFragmentHelloService()
}