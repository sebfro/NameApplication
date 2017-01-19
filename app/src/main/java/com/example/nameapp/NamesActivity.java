package com.example.nameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NamesActivity extends AppCompatActivity {
    String[] names = {"Sebastian", "Daniel", "Fedme"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.names_layout, names);

        ListView listView = (ListView) findViewById(R.id.nameList);
        listView.setAdapter(adapter);
    }
}
