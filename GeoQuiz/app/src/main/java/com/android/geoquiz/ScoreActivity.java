package com.android.geoquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {


    private QuizActivity mQuiz = new QuizActivity();
    private LogoActivity mLogo = new LogoActivity();

    private TextView mScoreDisplay;
    private TextView mUserDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        mScoreDisplay=(TextView) findViewById(R.id.finalscore);
        mUserDisplay=(TextView) findViewById(R.id.projectuserName);

       // displayUserName();

            int score =getIntent().getIntExtra("Score", 0);
            mScoreDisplay.setText("Your Score : " + score);


        ImageButton startButton = (ImageButton) findViewById(R.id.retryButton);
        startButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent startInt = new Intent(ScoreActivity.this, LogoActivity.class);
                startActivity(startInt);
            }
        });
    }




    private void displayUserName(){
        mUserDisplay.setText("Congratulations " + mLogo.mUserName);
    }


}