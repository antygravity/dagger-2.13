package antygravity.pl.dagger210.di

import antygravity.pl.dagger210.lobby.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Binds all sub-components within the app.
 */
@Module
abstract class BuildersModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity():  MainActivity
}