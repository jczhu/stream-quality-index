package com.example.mfchen.streamqualityindex;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class displayScoreRocky extends AppCompatActivity {

    TextView mTextView;
    TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_score_rocky);

        int score = getIntent().getExtras().getInt("Index", 0);

        mTextView = (TextView) findViewById(R.id.conditionrocky);
        mTextView.setText("The multimetric index is " + score + ":");

        //setContentView(mTextView);

        status = (TextView) findViewById(R.id.statusrocky);

        if (score <= 12 && score >= 9) {
            status.setText("Acceptable ecological condition");
        }
        else if (score == 8) {
            status.setText("Ecological conditions cannot be determined at this time");
        }
        else if (score <= 7){
            status.setText("Unacceptable ecological condition");
        }

    }

}
