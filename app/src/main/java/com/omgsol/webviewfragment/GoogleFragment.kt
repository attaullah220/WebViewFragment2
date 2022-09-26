package com.omgsol.webviewfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView

class GoogleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView: View = View.inflate(context, R.layout.fragment_google, null)

        val googleWebView = rootView.findViewById<WebView>(R.id.googleWebView)
        googleWebView.loadUrl("https://www.google.com/")
        return rootView
    }
}