package com.android.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        // TODO Have only one class to handle the questions
        Button logoButton = (Button) findViewById(R.id.next_button);
        logoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logoInt = new Intent(LogoActivity.this, StartActivity.class);
                startActivity(logoInt);
            }
        });
    }
}

