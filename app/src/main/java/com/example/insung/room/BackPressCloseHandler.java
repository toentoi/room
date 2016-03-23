package com.example.insung.room;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by insung on 2016-01-08.
 */
public class BackPressCloseHandler {

    private long backkeyPressedTime = 0;
    private Toast toast;

    private Activity activity;

    public BackPressCloseHandler(Activity context) {
        this.activity = context;
    }

    public void onBackPressed() {
        if (System.currentTimeMillis() > backkeyPressedTime + 2000) {
            backkeyPressedTime = System.currentTimeMillis();
            showGuide();
            return;
        }
        if (System.currentTimeMillis() <= backkeyPressedTime + 2000) {
            activity.finish();
            toast.cancel();
        }
    }

    public void showGuide() {
        toast = Toast.makeText(activity, "'뒤로'버튼 눌러봐유",
                Toast.LENGTH_SHORT);
        toast.show();
    }
}
