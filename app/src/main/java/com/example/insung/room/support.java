package com.example.insung.room;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

/**
 * Created by insung on 2016-01-11.
 */

public class support extends Activity {
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.support);

        WebView yj = (WebView) findViewById(R.id.yj);
        yj.setWebViewClient(new WebViewClient());
        WebSettings set = yj.getSettings();
        set.setJavaScriptEnabled(true);
        set.setBuiltInZoomControls(true);
        yj.loadUrl("http://toentoi.tistory.com");

    }
}