package com.example.nameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class ListActivity extends AppCompatActivity {

    private ListView lv;
    ArrayAdapter<String> adapter;
    ArrayList<HashMap<String,String>> nameList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //NameList
        String names[] = {"Sebastian","fedme","andreas"};

        lv = (ListView)findViewById(R.id.list_view);

        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.people_name, names);
    }
}
