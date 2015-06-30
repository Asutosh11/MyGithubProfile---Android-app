package com.example.asu.mygithubprofile;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends Activity {

    private WebView MySite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MySite = (WebView) findViewById(R.id.MySite);
        MySite.getSettings().setJavaScriptEnabled(true);
        MySite.setWebViewClient(new WebViewClient());
        MySite.loadUrl("https://www.github.com/asutosh11");

    }

}
