package com.example.mfchen.streamqualityindex;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class RockyMuddy extends AppCompatActivity {

    TextView mainTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocky_muddy);

        mainTextView = (TextView) findViewById(R.id.type);
        mainTextView.setText("What type of stream are you monitoring?");
        mainTextView.setTextSize(36);
        //mainTextView.setTextColor();

        mainTextView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rocky_muddy, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void gotoRocky(View view) {

        Intent intent = new Intent(this, Rocky_Stream.class);
        startActivity(intent);
    }

    public void gotoMuddy(View view) {

        Intent intent = new Intent(this, Muddy_Stream.class);
        startActivity(intent);
    }
}
