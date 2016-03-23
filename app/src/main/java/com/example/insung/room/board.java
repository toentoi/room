package com.example.insung.room;

/**
 * Created by insung on 2016-01-13.
 */
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class board extends Activity {
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.board);

        WebView board = (WebView) findViewById(R.id.board);
        board.setWebViewClient(new WebViewClient());
        WebSettings set = board.getSettings();
        set.setJavaScriptEnabled(true);
        set.setBuiltInZoomControls(true);
        board.loadUrl("http://toentoi2.tistory.com");
    }
}



