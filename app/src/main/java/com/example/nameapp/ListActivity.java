package com.example.nameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private final String nameList[] = {"Sebastian","fedme","andreas"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(getApplicationContext(),1);
        recyclerView.setLayoutManager(layoutManager);

        //NameList
        ArrayList<String> names = new ArrayList<String>();
        names.add("Seb");
        names.add("fre");
        names.add("ben");
        //for (int i = 0; i < 3; i++)
        //    names.add(nameList[i]);


        adapter = new listAdapter(getApplicationContext(), names);
        recyclerView.setAdapter(adapter);
    }
}
