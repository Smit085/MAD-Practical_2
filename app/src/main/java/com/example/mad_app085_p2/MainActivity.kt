package com.example.mad_app085_p2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()
        displayMsg("Onstart Method called")
    }
    override fun onResume() {
        super.onResume()
        displayMsg("OnResume Method called")
    }
    override fun onPause() {
        super.onPause()
        displayMsg("onPause Method called")
    }
    override fun onStop() {
        super.onStop()
        displayMsg("onStop Method called")
    }
    override fun onDestroy() {
        super.onDestroy()
        displayMsg("onDestroy Method called")
    }
    fun displayMsg(msg:String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.mycl), msg,Snackbar.LENGTH_SHORT).show()
        Log.i("MainActivity", msg)
    }
}