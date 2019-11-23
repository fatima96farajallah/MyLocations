package com.example.mylocation;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class locationviwe extends AppCompatActivity {
    ListView list;
    String[] maintitle =
            {
                    "Location 1", "Location 2"
                    , "Location 3", "Location 4",
                    "Location 5",
            };
    String[] subtitle =
            {
                    "sub1", "sub2", "sub3",
                    "sub4", "sub5",
            };
    Integer[] imgid = {
            R.drawable.location, R.drawable.userlocation,
    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviwe);
        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code", Toast.LENGTH_SHORT).show();
                }
                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
