package com.example.insung.room;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class finder extends Activity {
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.finder);

        WebView finder = (WebView) findViewById(R.id.finder);
        finder.setWebViewClient(new WebViewClient());
        WebSettings set = finder.getSettings();
        set.setJavaScriptEnabled(true);
        set.setBuiltInZoomControls(true);
        finder.loadUrl("http://my.yjteam.co.kr/finder.html");
    }
}
