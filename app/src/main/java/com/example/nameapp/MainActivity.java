package com.example.nameapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playGame(View view){
        Intent i = getIntent();
        finish();
        Intent intent = new Intent(this, learningMode.class);
        startActivity(intent);
    }

    public void addImage(View view){

    }


    public void showList(View view){
        Intent i = new Intent(this, NamesActivity.class);
        startActivity(i);
    }

    public void quitApp(View view){

    }

    public void openGallery(View view){
        Intent i = new Intent(this, GalleryActivity.class);
        startActivity(i);
    }

}
