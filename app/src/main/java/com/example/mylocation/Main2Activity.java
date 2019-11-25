package com.example.mylocation;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2Activity extends AppCompatActivity {
    public static String url;
    TextView textView;
    ArrayList<locations> locationsArrayList;
    ListView listView;
    private DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = (ListView) findViewById(R.id.list1);
        locationsArrayList = new ArrayList<locations>();
        db = new DBHelper(this);
        final MyListAdapter MyListAdapter = new MyListAdapter(this, locationsArrayList);
        listView.setAdapter(MyListAdapter);
    }

    private ArrayList<locations> getData(double longitude, double latitude) {
        ArrayList<locations> data = new ArrayList<locations>();
        Cursor cursor = db.getAllData();
        if (cursor.getCount() == 0) {
            Toast.makeText(Main2Activity.this, "No Location saved", Toast.LENGTH_SHORT).show();
        } else {
            while (cursor.moveToNext()) {

            }
        }
        return data;
    }
}
