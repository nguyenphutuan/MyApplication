package com.example.nguyenphutuan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> arraylist=new ArrayList<>();
    ListView lv;
    customscroll scr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listview);
        scr=(customscroll)findViewById(R.id.scrollView);

        for(int i=0;i<20;i++){
            arraylist.add("anh tuan "+i);
        }
        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arraylist);
        lv.setAdapter(adapter);
        scr.setScrollViewListener(new customscroll.ScrollViewListener() {
            @Override
            public void onScrollChanged(customscroll customscroll, int x, int y, int oldx, int oldy) {
                View view = customscroll.findViewById(R.id.img);

                if(view!=null){
                    view.setTranslationY(customscroll.getScrollY() / 3);
                }
            }
        });





    }
}
