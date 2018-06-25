package antygravity.pl.dagger210.lobby

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import antygravity.pl.dagger210.R
import antygravity.pl.dagger210.service.CommonHelloService
import butterknife.BindView
import butterknife.ButterKnife
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @BindView(R.id.text_hello)
    lateinit var  textHello: TextView

    @Inject
    lateinit var helloService: CommonHelloService;

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        textHello.setText(helloService.sayHello())
    }
}
