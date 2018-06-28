package antygravity.pl.dagger210.lobby

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import antygravity.pl.dagger210.R
import antygravity.pl.dagger210.service.LobbyFragmentHelloService
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder
import dagger.android.AndroidInjection
import javax.inject.Inject

private lateinit var unbinder: Unbinder;

class LobbyFragment : Fragment() {

    @BindView(R.id.text_lobby_fragment_hello)
    lateinit var textView: TextView;

    @Inject
    lateinit var lobbyFragmentService: LobbyFragmentHelloService

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_lobby, container, false)
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.setText(lobbyFragmentService.sayHello())
    }


    override fun onAttach(context: Context) {
        AndroidInjection.inject(this);
        super.onAttach(context)

    }

    override fun onDestroy() {
        super.onDestroy()
        unbinder.unbind()
    }

    override fun onDetach() {
        super.onDetach()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LobbyFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
                LobbyFragment().apply {
                }
    }
}
