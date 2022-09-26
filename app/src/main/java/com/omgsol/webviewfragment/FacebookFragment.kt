package com.omgsol.webviewfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Button

class FacebookFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView: View = View.inflate(context, R.layout.fragment_facebook, null)

        val facebookWebView = rootView.findViewById<WebView>(R.id.facebookWebView)
        facebookWebView.loadUrl("https://www.facebook.com/")
        return rootView
    }
}