package com.android.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogoActivity extends AppCompatActivity {

    String mUserName;
    private EditText mUserView;
    private TextView mUserTextView;

    private Button nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        mUserView =(EditText) findViewById(R.id.userText);
        mUserTextView =(TextView) findViewById(R.id.userTextView);

        nextButton = (Button) findViewById(R.id.next_button);



        // TODO Have only one class to handle the questions
        Button logoButton = (Button) findViewById(R.id.next_button);
        logoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logoInt = new Intent(LogoActivity.this, StartActivity.class);
                Intent nameInt = new Intent(LogoActivity.this, ScoreActivity.class);
                nameInt.putExtra("name", mUserName);
                startActivity(nameInt);
                startActivity(logoInt);
            }
        });
    }



}

