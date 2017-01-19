package com.example.nameapp;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private final String image_titles[] = {
            "Sebastian","daniel","fedme",
    };
    private final Integer image_ids[] = {
            R.drawable.sample1, R.drawable.sample2, R.drawable.sample3,
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        //Use this if changes in content do not change the alyout size of the recyclerview
        mRecyclerView.setHasFixedSize(true);

        //Use a linear layout manager
        mLayoutManager = new GridLayoutManager(getApplicationContext(),1);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<CreateList> createLists = prepareData();

        //specify an adapter
        mAdapter = new MyAdapter(getApplicationContext(), createLists);
        mRecyclerView.setAdapter(mAdapter);

    }

    private ArrayList<CreateList> prepareData(){
        ArrayList<CreateList> images = new ArrayList<>();
        for(int i = 0; i < image_titles.length; i++){
            CreateList createList = new CreateList();
            createList.setImage_title(image_titles[i]);
            createList.setImage_ID(image_ids[i]);
            images.add(createList);
        }
        return images;
    }
    }

