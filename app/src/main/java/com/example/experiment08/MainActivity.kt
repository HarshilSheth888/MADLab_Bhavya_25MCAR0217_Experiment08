package com.example.experiment08

import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var etUrl: EditText
    private lateinit var webView: WebView
    private lateinit var btnLoad: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.title = "Experiment 8"

        // Make the toolbar overflow menu dots white
        toolbar.overflowIcon?.setColorFilter(
            Color.WHITE,
            PorterDuff.Mode.SRC_IN
        )

        etUrl = findViewById(R.id.etUrl)
        webView = findViewById(R.id.webView)
        btnLoad = findViewById(R.id.btnLoad)

        webView.webViewClient = WebViewClient()

        btnLoad.setOnClickListener {
            loadWebsite()
        }

        etUrl.setText("https://www.google.com")
        webView.loadUrl("https://www.google.com")
    }

    private fun loadWebsite() {
        var url = etUrl.text.toString().trim()

        if (url.isEmpty()) {
            Toast.makeText(
                this,
                "Please enter a website URL",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        if (!url.startsWith("http://") &&
            !url.startsWith("https://")
        ) {
            url = "https://$url"
        }

        etUrl.setText(url)
        webView.loadUrl(url)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add(Menu.NONE, 1, Menu.NONE, "Home")
        menu.add(Menu.NONE, 2, Menu.NONE, "Reload")
        menu.add(Menu.NONE, 3, Menu.NONE, "Clear URL")
        menu.add(Menu.NONE, 4, Menu.NONE, "About")

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            1 -> {
                etUrl.setText("https://www.google.com")
                webView.loadUrl("https://www.google.com")
                return true
            }

            2 -> {
                webView.reload()
                return true
            }

            3 -> {
                etUrl.text.clear()
                return true
            }

            4 -> {
                Toast.makeText(
                    this,
                    "Bhavya Khatri\nUSN: 25MCAR0217",
                    Toast.LENGTH_LONG
                ).show()
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        webView.destroy()
        super.onDestroy()
    }
}