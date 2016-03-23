package com.example.insung.room;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity2 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView nv_map = (WebView) findViewById(R.id.wv2);
        nv_map.setWebViewClient(new WebViewClient());
        WebSettings set = nv_map.getSettings();
        set.setJavaScriptEnabled(true);
        set.setBuiltInZoomControls(true);
        nv_map.loadUrl("http://map.naver.com");
    }
}


