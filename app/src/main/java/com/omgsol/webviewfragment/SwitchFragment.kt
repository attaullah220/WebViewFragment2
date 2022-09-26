package com.omgsol.webviewfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class SwitchFragment : Fragment() {
    private lateinit var communicator: MainActivity

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView: View = View.inflate(context, R.layout.switch_fragment, null)

        communicator = activity as MainActivity

        rootView.findViewById<Button>(R.id.googleBtn).setOnClickListener {
            communicator.replaceGoogleFragment()
        }

        rootView.findViewById<Button>(R.id.facebookBtn).setOnClickListener {
            communicator.replaceFacebookFragment()
        }

        rootView.findViewById<Button>(R.id.yahooBtn).setOnClickListener {
            communicator.replaceYahooFragment()
        }

        return rootView
    }
}