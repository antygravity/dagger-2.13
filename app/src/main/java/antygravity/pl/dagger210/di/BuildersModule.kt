package antygravity.pl.dagger210.di

import antygravity.pl.dagger210.lobby.LobbyFragment
import antygravity.pl.dagger210.lobby.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Binds all sub-components within the app.
 */
@Module
abstract class BuildersModule {

    @ContributesAndroidInjector(modules = arrayOf(LobbyActivityModule::class))
    abstract fun bindMainActivity():  MainActivity

    @ContributesAndroidInjector(modules = arrayOf(LobbyFragmentModule::class))
    abstract fun bindLobbyFragment():  LobbyFragment
}