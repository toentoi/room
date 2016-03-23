package com.example.insung.room;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by insung on 2016-01-07.
 */
public class callActivity extends Activity implements OnClickListener {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call);

        Button touch1 = (Button) findViewById(R.id.touch1);
        touch1.setOnClickListener(this);

        Button touch2 = (Button) findViewById(R.id.touch2);
        touch2.setOnClickListener(this);

        Button touch3 = (Button) findViewById(R.id.touch3);
        touch3.setOnClickListener(this);

        Button touch4 = (Button) findViewById(R.id.touch4);
        touch4.setOnClickListener(this);

        Button touch5 = (Button) findViewById(R.id.touch5);
        touch5.setOnClickListener(this);

        Button finder = (Button) findViewById(R.id.finder);
        finder.setOnClickListener(this);

        Button kakao = (Button) findViewById(R.id.kakao);
        kakao.setOnClickListener(this);

        Button line = (Button) findViewById(R.id.line);
        line.setOnClickListener(this);

    }

    public void onClick(View arg0) {

        switch (arg0.getId()) {
            case R.id.touch1:
                startActivity(new Intent("android.intent.action.CALL",
                        Uri.parse("tel:010-6401-3947")));
                break;

            case R.id.touch2:
                startActivity(new Intent("android.intent.action.CALL",
                        Uri.parse("tel:010-9154-3947")));
                break;

            case R.id.touch3:
                startActivity(new Intent("android.intent.action.CALL",
                        Uri.parse("tel:010-9077-3947")));
                break;

            case R.id.touch4:
                startActivity(new Intent("android.intent.action.CALL",
                        Uri.parse("tel:010-4669-3948")));
                break;

            case R.id.touch5:
                startActivity(new Intent("android.intent.action.CALL",
                        Uri.parse("tel:043-232-0111")));
                break;

            case R.id.kakao:
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.kakao.talk");
                startActivity(intent);
                break;

            case R.id.line:
                Intent intent1 = getPackageManager().getLaunchIntentForPackage("jp.naver.line.android");
                startActivity(intent1);
        }

        if (arg0.getId() == R.id.finder) {
            Intent intent = new Intent(this, finder.class);
            startActivity(intent);
        }

    }

}
