package com.example.mylocation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    public static String url;
    TextView textView;
    ArrayList<locations> locationsArrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = (ListView)findViewById(R.id.list1);
        locationsArrayList = new ArrayList<locations>();
        final MyListAdapter MyListAdapter = new MyListAdapter(this,locationsArrayList);
        listView.setAdapter(MyListAdapter);
    }
}
