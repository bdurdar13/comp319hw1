package com.android.geoquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;

public class QuizActivity extends AppCompatActivity {

    private Question mQuestion = new Question();
    private Button mAButton;
    private Button mBButton;
    private Button mCButton;
    private Button mDButton;
    private Button mNextButton;
    private TextView mQuestionTextView;
    private TextView mScoreView;
    private TextView mTimerView;
    public int counter = 1000;
    private boolean running;
    private boolean isRunning;



    private String mAnswer;
    private int mScore;
    private int mCurrentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        mScoreView =(TextView) findViewById(R.id.score);
        mQuestionTextView = (TextView) findViewById(R.id.question_text_view);
        mTimerView = (TextView) findViewById(R.id.timer);

            Thread t = new Thread(){
                public void run(){
                    while (!isInterrupted()){
                        try {
                            Thread.sleep(100); // 1 sec
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    if (counter > 0){
                                    counter--;
                                        //int seconds = ((counter / 1000));
                                        //mTimerView.setText(seconds + "s " + counter / 1000);

                                   mTimerView.setText(String.valueOf(counter));
                                }else{
                                     updateQuestion();
                                      counter=100;
                                    }

                                }
                            });

                        } catch (InterruptedException e){

                            e.printStackTrace();
                        }
                    }
                }

            };
           t.start();

        if(savedInstanceState !=null) {
            mScoreView =(TextView) savedInstanceState.getCharSequence("mScoreView");
            mQuestionTextView = (TextView) savedInstanceState.getCharSequence("mQuestionTextView");
            mTimerView = (TextView) savedInstanceState.getCharSequence("mTimerView");
            running = savedInstanceState.getBoolean("running");
            isRunning = savedInstanceState.getBoolean("isRunning");
        }
        if(isRunning){
            running = true;
        }

        mAButton = (Button) findViewById(R.id.a_button);
        mAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAButton.getText() == mAnswer) {
                    mScore = mScore + 100;
                    updateScore();
                    Toast.makeText(QuizActivity.this, "CORRECT!", Toast.LENGTH_LONG)
                            .show();
                    if (mCurrentIndex < 10) {

                        updateQuestion();
                        counter=100;
                    } else {
                        Intent quizInt = new Intent(QuizActivity.this, ScoreActivity.class);
                        quizInt.putExtra("Score", mScore);
                        startActivity(quizInt);

                    }



                } else {
                    mScore = mScore - 20;
                    Toast.makeText(QuizActivity.this, "INCORRECT!", Toast.LENGTH_LONG)
                            .show();
                    updateScore();
                    if (mCurrentIndex < 10) {

                        updateQuestion();
                        counter=100;
                    } else {
                        Intent quizInt = new Intent(QuizActivity.this, ScoreActivity.class);
                        quizInt.putExtra("Score", mScore);
                        startActivity(quizInt);

                    }




                }
            }
        });


        mBButton = (Button) findViewById(R.id.b_button);
        mBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mBButton.getText() == mAnswer) {
                    mScore = mScore + 100;
                    updateScore();
                    Toast.makeText(QuizActivity.this, "CORRECT!", Toast.LENGTH_LONG)
                            .show();
                    if (mCurrentIndex < 10) {

                        updateQuestion();
                        counter=100;
                    } else {
                        Intent quizInt = new Intent(QuizActivity.this, ScoreActivity.class);
                        quizInt.putExtra("Score", mScore);
                        startActivity(quizInt);

                    }


                } else {
                    mScore = mScore - 20;
                    Toast.makeText(QuizActivity.this, "INCORRECT!", Toast.LENGTH_LONG)
                            .show();
                    updateScore();
                    if (mCurrentIndex < 10) {

                        updateQuestion();
                        counter=100;
                    } else {
                        Intent quizInt = new Intent(QuizActivity.this, ScoreActivity.class);
                        quizInt.putExtra("Score", mScore);
                        startActivity(quizInt);

                    }


                }
            }
        });


        mCButton = (Button) findViewById(R.id.c_button);
        mCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCButton.getText() == mAnswer) {
                    mScore = mScore + 100;
                    updateScore();
                    Toast.makeText(QuizActivity.this, "CORRECT!", Toast.LENGTH_LONG)
                            .show();
                    if (mCurrentIndex < 10) {

                        updateQuestion();
                        counter=100;
                    } else {
                        Intent quizInt = new Intent(QuizActivity.this, ScoreActivity.class);
                        quizInt.putExtra("Score", mScore);
                        startActivity(quizInt);

                    }



                } else {
                    mScore = mScore - 20;
                    Toast.makeText(QuizActivity.this, "INCORRECT!", Toast.LENGTH_LONG)
                            .show();
                    updateScore();
                    if (mCurrentIndex < 10) {

                        updateQuestion();
                        counter=100;
                    } else {
                        Intent quizInt = new Intent(QuizActivity.this, ScoreActivity.class);
                        quizInt.putExtra("Score", mScore);
                        startActivity(quizInt);

                    }


                }
            }
        });

        mDButton = (Button) findViewById(R.id.d_button);
        mDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mDButton.getText() == mAnswer) {
                    mScore = mScore + 100;
                    updateScore();
                    Toast.makeText(QuizActivity.this, "CORRECT!", Toast.LENGTH_LONG)
                            .show();
                    if (mCurrentIndex < 10) {
                        updateQuestion();
                        counter=100;
                    } else {
                        Intent quizInt = new Intent(QuizActivity.this, ScoreActivity.class);
                        quizInt.putExtra("Score", mScore);
                        startActivity(quizInt);

                    }



                } else {
                    mScore = mScore - 20;
                    Toast.makeText(QuizActivity.this, "INCORRECT!", Toast.LENGTH_LONG)
                            .show();
                    updateScore();
                    if (mCurrentIndex < 10) {

                        updateQuestion();
                        counter=100;
                    } else {
                        Intent quizInt = new Intent(QuizActivity.this, ScoreActivity.class);
                        quizInt.putExtra("Score", mScore);
                        startActivity(quizInt);

                    }


                }
            }
        });



            mNextButton = (Button) findViewById(R.id.next_button);
            mNextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mCurrentIndex < 10) {
                        updateQuestion();
                        counter=100;
                    } else {
                        Intent quizInt = new Intent(QuizActivity.this, ScoreActivity.class);
                        quizInt.putExtra("Score", mScore);
                        startActivity(quizInt);

                    }
                }
            });



    }

    private void updateScore(){
        mScoreView.setText("" + mScore);


    }

    public void onClickStart(View view){
        running = true;
    }

    public void onClickStop(View view){
        running = false;
    }

    public void onClickReset(View view){
        running = false;
        counter = 1000;
    }


    public void onClickPause(View view){
        running = false;
        counter = this.counter;
    }

    public void onClickRestart(View view){
        running = true;
        mQuestionTextView = (TextView) this.mQuestionTextView;
        mTimerView = (TextView ) this.mTimerView;
        mScoreView = (TextView) this.mScoreView;
    }

    public void onClickResume(View view){
        running = true;
        counter = this.counter;
        mQuestionTextView = (TextView) this.mQuestionTextView;
        mTimerView = (TextView ) this.mTimerView;
        mScoreView = (TextView) this.mScoreView;
    }


    private void updateQuestion() {

        mQuestionTextView.setText(mQuestion.getQuestions(mCurrentIndex));
        mAButton.setText(mQuestion.getChoicea(mCurrentIndex));
        mBButton.setText(mQuestion.getChoiceb(mCurrentIndex));
        mCButton.setText(mQuestion.getChoicec(mCurrentIndex));
        mDButton.setText(mQuestion.getChoiced(mCurrentIndex));

        mAnswer = mQuestion.getTrueAnswer(mCurrentIndex);
        mCurrentIndex++;


    }

    protected void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("counter", counter);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("isRunning", isRunning);

    }

    protected void onStop(){
        super.onStop();
        isRunning = running;
        running = false;

    }

    protected void onStart(){
        super.onStart();
        if(isRunning){
            running = true;
        }

    }

    protected void onReset(){
        super.onReset();
        isRunning = running;
        running = false;

    }

    protected void onPause(){
        super.onPause();
        isRunning = running;
        running = false;

    }

    protected void onRestart(){
        super.onRestart();
        isRunning = running;
        running = true;

    }

}
