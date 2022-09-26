package com.omgsol.webviewfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchFragment = SwitchFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container_view, switchFragment).commit()
    }
    fun replaceGoogleFragment() {

        val transaction = this.supportFragmentManager.beginTransaction()
        val googleFragment = GoogleFragment()

        transaction.replace(R.id.fragment_container_view, googleFragment)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun replaceFacebookFragment() {

        val transaction = this.supportFragmentManager.beginTransaction()
        val facebookFragment = FacebookFragment()

        transaction.replace(R.id.fragment_container_view, facebookFragment)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun replaceYahooFragment() {

        val transaction = this.supportFragmentManager.beginTransaction()
        val yahooFragment = YahooFragment()

        transaction.replace(R.id.fragment_container_view, yahooFragment)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}