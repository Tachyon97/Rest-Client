package com.sya.simple;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterRecycler extends ArrayAdapter<Booking> {
    public AdapterRecycler(Context context, ArrayList<Booking> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Booking user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.items, parent, false);
        }
        // Lookup view for data population
        TextView tvName = convertView.findViewById(R.id.mainName);
        TextView tvHome = convertView.findViewById(R.id.mainDate);
        // Populate the data into the template view using the data object
        tvName.setText(user.getName());
        tvHome.setText(user.getDate());
        // Return the completed view to render on screen
        return convertView;
    }
}

