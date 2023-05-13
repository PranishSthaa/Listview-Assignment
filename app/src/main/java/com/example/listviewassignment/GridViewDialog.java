package com.example.listviewassignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import android.widget.TextView;

public class GridViewDialog extends Dialog {
    private TextView title;
    private GridView gridView;
    private Button btnOK;

    String gridItems[] = {
            "First Grid Item",
            "Second Grid Item",
            "Third Grid Item",
            "Fourth Grid Item",
            "Fifth Grid Item",
            "Sixth Grid Item",
    };

    public GridViewDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.activity_grid_view_dialog);
        title = findViewById(R.id.titleGridViewDialog);
        gridView = findViewById(R.id.gridView);
        btnOK = findViewById(R.id.btnDialogOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, gridItems);
        gridView.setAdapter(arrayAdapter);

    }
}