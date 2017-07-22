package com.android.geoquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Question mQuestion = new Question();
    private Button mAButton;
    private Button mBButton;
    private Button mCButton;
    private Button mDButton;
    private Button mNextButton;
    private TextView mQuestionTextView;
    private TextView mScoreView;

    private String mAnswer;
    private int mScore = 0;
    private int mCurrentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        // mScoreView =(TextView) findViewById(R.id.score);
        mQuestionTextView = (TextView) findViewById(R.id.question_text_view);


        mAButton = (Button) findViewById(R.id.a_button);
        mAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAButton.getText() == mAnswer) {
                    mScore = mScore + 100;
                    updateScore();
                    Toast.makeText(QuizActivity.this, "CORRECT!", Toast.LENGTH_LONG)
                            .show();
                } else {
                    mScore = mScore - 20;
                    Toast.makeText(QuizActivity.this, "INCORRECT!", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });


        mBButton = (Button) findViewById(R.id.b_button);
        mBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mBButton.getText() == mAnswer) {
                    mScore = mScore + 100;
                    //  updateScore(mScore);
                    Toast.makeText(QuizActivity.this, "CORRECT!", Toast.LENGTH_LONG)
                            .show();
                } else {
                    mScore = mScore - 20;
                    Toast.makeText(QuizActivity.this, "INCORRECT!", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });


        mCButton = (Button) findViewById(R.id.c_button);
        mCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCButton.getText() == mAnswer) {
                    mScore = mScore + 100;
                    //  updateScore(mScore);
                    Toast.makeText(QuizActivity.this, "CORRECT!", Toast.LENGTH_LONG)
                            .show();
                } else {
                    mScore = mScore - 20;
                    Toast.makeText(QuizActivity.this, "INCORRECT!", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });

        mDButton = (Button) findViewById(R.id.d_button);
        mDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mDButton.getText() == mAnswer) {
                    mScore = mScore + 100;
                    //  updateScore(mScore);
                    Toast.makeText(QuizActivity.this, "CORRECT!", Toast.LENGTH_LONG)
                            .show();
                } else {
                    mScore = mScore - 20;
                    Toast.makeText(QuizActivity.this, "INCORRECT!", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });


        mNextButton = (Button) findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               updateQuestion();

           }
        });
    }

    private void updateScore(){
        mScoreView.setText("" + mScore);


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

}
