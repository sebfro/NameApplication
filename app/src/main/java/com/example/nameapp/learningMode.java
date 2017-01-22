package com.example.nameapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class learningMode extends AppCompatActivity {

    public final static String MESSAGE = "Du fylte ikke inn!";
    public int score = 0;
    String right_ans = "";
    public int num = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_mode);

        setImage();

    }

    public void setImage() {
        Random rand = new Random();
        num = rand.nextInt(3) + 1;

        ImageView image = (ImageView) findViewById(R.id.imageView2);

        if (num == 1) {
            image.setImageResource(R.drawable.img1);
            right_ans = "sebastian";
        } else if (num == 2) {
            image.setImageResource(R.drawable.img2);
            right_ans = "daniel";
        } else {
            image.setImageResource(R.drawable.img3);
            right_ans = "tiger";
        }
    }


    public void mainMenu(View v) {

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "";

        TextView tw = (TextView)findViewById(R.id.score);
        text = tw.getText();

        Intent i = getIntent();
        finish();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void guess (View v) {
        ImageView i = (ImageView) findViewById(R.id.imageView2);
        String check = i.getDrawable().toString().toLowerCase();
        EditText editText = (EditText) findViewById(R.id.guessText);
        String answer = editText.getText().toString();
        answer.toLowerCase();


        //Til Toast svar
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "";

        if(answer.equals(right_ans)) {
            text = "Du gjettet riktig!";
            score++;
            updateScore(score);
            setImage();
        } else {
            text = "Du gjettet feil. Prøv igjen!";

        }

        Toast.makeText(context, text, duration).show();
    }

    public void updateScore(int score) {
        TextView tw = (TextView)findViewById(R.id.score);
        tw.setText("Score: " + score);
    }

    public void restart(View v) {
        setImage();
    }



}
