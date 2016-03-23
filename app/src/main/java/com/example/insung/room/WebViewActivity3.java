package com.example.insung.room;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by insung on 2016-01-07.
 */
public class WebViewActivity3 extends Activity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        WebView dm_map = (WebView) findViewById(R.id.wv3);
        dm_map.setWebViewClient(new WebViewClient());
        WebSettings set = dm_map.getSettings();
        set.setJavaScriptEnabled(true);
        set.setBuiltInZoomControls(true);
        dm_map.loadUrl("http://map.daum.net");
    }
}
