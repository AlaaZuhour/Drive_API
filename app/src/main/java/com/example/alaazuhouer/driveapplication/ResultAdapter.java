package com.example.alaazuhouer.driveapplication;



import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.widget.DataBufferAdapter;

import java.util.ArrayList;


public class ResultAdapter extends ArrayAdapter<String> {
ArrayList<String> arrayList;
    Context context;
    public ResultAdapter(Context context, ArrayList<String> arr) {
        super(context, R.layout.list_item);
        this.arrayList=arr;
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(getContext(), R.layout.list_item, null);
        }
        String current = getItem(position);
        Log.d("current1",current);
        TextView file = (TextView) convertView.findViewById(R.id.textView2);
        file.setText(current);
        return convertView;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }
}