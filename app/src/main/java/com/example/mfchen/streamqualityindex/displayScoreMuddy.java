package com.example.mfchen.streamqualityindex;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class displayScoreMuddy extends AppCompatActivity {

    TextView mTextView;
    TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_display_score_muddy);

        int score = getIntent().getExtras().getInt("Index", 0);

        mTextView = (TextView) findViewById(R.id.conditionmuddy);
        mTextView.setText("The multimetric index is " + score + ":");

        status = (TextView) findViewById(R.id.statusmuddy);

        if (score > 14) {
            status.setText("Acceptable ecological condition");
        }
        else if (score >= 8) {
            status.setText("Ecological conditions cannot be determined at this time");
        }
        else if (score < 8){
            status.setText("Unacceptable ecological condition");
        }


    }

}
