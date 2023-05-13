package com.example.listviewassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<ListData> {
    public ListAdapter(@NonNull Context context, ArrayList<ListData> arrayList) {
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_image_list_view_dialog, parent, false);
        }
        View view = LayoutInflater.from(getContext()).inflate(R.layout.activity_image_list_view_dialog, parent, false);
        ListData getDataPosition = getItem(position);

        // !!LOGCAT shows error in line 29!!
        return super.getView(position, convertView, parent);
    }
}
