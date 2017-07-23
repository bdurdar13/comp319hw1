package com.android.geoquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {



    private TextView mScoreDisplay;
    private TextView mUserDisplay;
    private TextView mplayTimeDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        mScoreDisplay=(TextView) findViewById(R.id.finalscore);
        mUserDisplay=(TextView) findViewById(R.id.projectuserName);
        mplayTimeDisplay=(TextView) findViewById(R.id.playTime);


        int name =getIntent().getIntExtra("Name", 0);
       // mUserDisplay.setText(" Congratulations! " + name);
        mUserDisplay.setText(" Congratulations! ");


        int score =getIntent().getIntExtra("Score", 0);
            mScoreDisplay.setText("Your Score : " + score);

        int playTime =getIntent().getIntExtra("PlayTime", 0);
        mplayTimeDisplay.setText("Your total play time is : " + playTime);

        ImageButton retryButton = (ImageButton) findViewById(R.id.retryButton);
        retryButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent startInt = new Intent(ScoreActivity.this, LogoActivity.class);
                startActivity(startInt);
            }
        });
    }



}