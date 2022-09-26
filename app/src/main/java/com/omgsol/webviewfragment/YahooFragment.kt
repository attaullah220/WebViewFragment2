package com.omgsol.webviewfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Button

class YahooFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView: View = View.inflate(context, R.layout.fragment_yahoo, null)

        val yahooWebView = rootView.findViewById<WebView>(R.id.yahooWebView)
        yahooWebView.loadUrl("https://www.yahoo.com/")
        return rootView
    }
}
