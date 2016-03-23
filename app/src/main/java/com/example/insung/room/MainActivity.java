package com.example.insung.room;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity implements OnClickListener {
    ImageButton touch;
    ImageButton touch2;
    ImageButton touch3;
    ImageButton touch4;
    ImageButton touch5;
    ImageButton touch6;

    private BackPressCloseHandler backPressCloseHandler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gate);

        //splash 이미지
        startActivity(new Intent(this, SplashActivity.class));

        backPressCloseHandler = new BackPressCloseHandler(this);

        touch = (ImageButton) findViewById(R.id.touch);
        touch.setOnClickListener(this);

        touch3 = (ImageButton) findViewById(R.id.touch3);
        touch3.setOnClickListener(this);

        touch4 = (ImageButton) findViewById(R.id.touch4);
        touch4.setOnClickListener(this);

        touch5 = (ImageButton) findViewById(R.id.touch5);
        touch5.setOnClickListener(this);

        touch6 = (ImageButton) findViewById(R.id.touch6);
        touch6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.touch) {
            Intent intent = new Intent(this, RoomActivity.class);
            startActivity(intent);


        } else if (v.getId() == R.id.touch3) {
            Intent intent = new Intent(this, callActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.touch4) {
            Intent intent = new Intent(this, WebViewActivity3.class);
            startActivity(intent);

        } else if (v.getId() == R.id.touch5) {
            Intent intent = new Intent(this, support.class);
            startActivity(intent);

        } else if (v.getId() == R.id.touch6) {
            Intent intent = new Intent(this, board.class);
            startActivity(intent);

        }
    }

    public void onBackPressed() {
        backPressCloseHandler.onBackPressed();
    }

}

