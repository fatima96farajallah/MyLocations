package com.example.mylocation;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends ArrayAdapter<locations> {

    ArrayList<locations> location;

    public MyListAdapter(Context context, ArrayList<locations> location) {
        super(context, 0, location);
        this.location = location;
    }

    public View getView(int position, View view, ViewGroup parent) {
        locations locations = getItem(position);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.mylist, parent, false);
        }
            TextView Latitude = (TextView) view.findViewById(R.id.Longitude);
            TextView Longitude = (TextView) view.findViewById(R.id.Longitude);
            Latitude.setText("Longitude" + locations.getLatitude());
            Longitude.setText("Longitude" + locations.getLongitude());
            return view;
    }
}