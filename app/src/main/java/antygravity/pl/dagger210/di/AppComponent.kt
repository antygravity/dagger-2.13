package antygravity.pl.dagger210.di

import antygravity.pl.dagger210.LobbyApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        BuildersModule::class
))
interface AppComponent {
    fun inject(app: LobbyApplication)
}