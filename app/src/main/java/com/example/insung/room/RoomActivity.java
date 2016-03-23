package com.example.insung.room;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by insung on 2016-01-06.
 */
public class RoomActivity extends Activity {

    private ListView lv;
    ArrayAdapter<String> adapter;
    EditText inputSearch;
    ArrayList<HashMap<String, String>> productList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_search);


        String products[] = {
                "애듀빌------------>5972#",
                "메이플빌------------>8283#",
                "화이트빌------------>2664#",
                "어울림빌------------>#3698#",
                "다솜빌------------>1357#",
                "한마음빌------------>#1004#",
                "둥지빌라------------>3527#",
                "승방빌------------>2468#",
                "대성빌------------>*1234*",
                "새터빌------------>#1234#",
                "파인빌------------>9424#",
                "성균관빌------------>2346#",
                "보광빌(교원빌라A동)--->5972#",
                "부광빌(청람드림빌옆)--->0000#",
                "교원빌라101--------->4679#",
                "교원빌라102--------->1234#",
                "교원빌라103--------->4679#",
                "교원빌라108--------->1234#",
                "교원빌라109--------->5813#",
                "교원빌라113--------->1235#",
                "울트라하우스--------->6672#",
                "대원빌라------------>1234#",
                "신성뒤 신축빌라------>#6735",
                "자연빌------------->2345#",
                "초록빌------------->2345#",
                "쌍용빌라----------->#5152#",
                "지훈빌(충청대후문)---->6394#",
                "연송빌라(교원빌라끝)--->5250#",
                "캔디하우스(탑연)------>4154#",
                "국보빌------------->#5350#",
                "쌍용101(1~2)------->*1178",
                "쌍용101(3~4)------->*1168",
                "쌍용102(1~2)------->*1158",
                "쌍용102(3~4)------->*1148",
                "쌍용103(1~2)------->*1148",
                "로하스빌------------>#6735#",
                "엘리트빌------------>#3058#",
                "하늘채-------------->#3377#",
                "반석빌-------------->#3567#",
                "에코빌--------------->7890#",
                "교원학사------------->2468#",
                "초록빌--------------->2345#",
                "더베이스------------->0000#"


        };

        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);


        adapter = new ArrayAdapter<String>(this, R.layout.text, R.id.newtext, products);
        lv.setAdapter(adapter);


        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {

                RoomActivity.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {

            }

            @Override
            public void afterTextChanged(Editable arg0) {

            }
        });
    }
}
