package antygravity.pl.dagger210.lobby

import android.app.Fragment
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import antygravity.pl.dagger210.R
import antygravity.pl.dagger210.service.CommonHelloService
import antygravity.pl.dagger210.service.LobbyHelloService
import butterknife.BindView
import butterknife.ButterKnife
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasFragmentInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasFragmentInjector {

    @Inject
    lateinit var dispachAndroidInjector: DispatchingAndroidInjector<Fragment>

    @BindView(R.id.text_hello)
    lateinit var textHello: TextView

    @BindView(R.id.text_hello_lobby)
    lateinit var textHelloLobby: TextView

    @Inject
    lateinit var helloService: CommonHelloService

    @Inject
    lateinit var lobbyService: LobbyHelloService

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        sayCommonHello()
        sayLobbyHello()
    }

    override fun fragmentInjector(): AndroidInjector<Fragment> = dispachAndroidInjector

    private fun sayLobbyHello() {
        textHelloLobby.text = lobbyService.sayHello()
    }

    private fun sayCommonHello() {
        textHello.text = helloService.sayHello()
    }
}
