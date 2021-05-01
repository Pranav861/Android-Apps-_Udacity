package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String list[] = {"ABC", "XYZ", "PQR"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ListView listView = findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.activity_main, list);

        listView.setAdapter(adapter);
    }
}
