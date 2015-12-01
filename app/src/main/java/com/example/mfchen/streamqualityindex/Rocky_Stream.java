package com.example.mfchen.streamqualityindex;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Rocky_Stream extends AppCompatActivity {

    int [] quantity = new int[19];

    double metric1, metric2, metric3, metric4, metric5, metric6;

    int condition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocky__stream);
    }

    public void increment(View view) {

        String tag = view.getTag().toString();
        int index = Integer.parseInt(tag);

        quantity[index]++;
        displayQuantity(index);
    }

    public void decrement(View view) {

        String tag = view.getTag().toString();
        int index = Integer.parseInt(tag);

        quantity[index]--;

        if (quantity[index] < 0) {
            Context context = getApplicationContext();
            CharSequence text = "Can't have fewer than 0 macroinvertebrates";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            quantity[index]++;
        }
        displayQuantity(index);
    }

    public void displayQuantity(int numBugsIndex) {

        TextView quantityTextView = (TextView) findViewById(R.id.worm);

        switch (numBugsIndex) {
            case 0:
                quantityTextView = (TextView) findViewById(R.id.worm);
                break;
            case 1:
                quantityTextView = (TextView) findViewById(R.id.flatworm);
                break;
            case 2:
                quantityTextView = (TextView) findViewById(R.id.leech);
                break;
            case 3:
                quantityTextView = (TextView) findViewById(R.id.crayfish);
                break;
            case 4:
                quantityTextView = (TextView) findViewById(R.id.sowbug);
                break;
            case 5:
                quantityTextView = (TextView) findViewById(R.id.scud);
                break;
            case 6:
                quantityTextView = (TextView) findViewById(R.id.stonefly);
                break;
            case 7:
                quantityTextView = (TextView) findViewById(R.id.mayfly);
                break;
            case 8:
                quantityTextView = (TextView) findViewById(R.id.dragonflydamselfly);
                break;
            case 9:
                quantityTextView = (TextView) findViewById(R.id.hellgrammite);
                break;
            case 10:
                quantityTextView = (TextView) findViewById(R.id.netspinner);
                break;
            case 11:
                quantityTextView = (TextView) findViewById(R.id.caddisfly);
                break;
            case 12:
                quantityTextView = (TextView) findViewById(R.id.beetle);
                break;
            case 13:
                quantityTextView = (TextView) findViewById(R.id.midge);
                break;
            case 14:
                quantityTextView = (TextView) findViewById(R.id.blackfly);
                break;
            case 15:
                quantityTextView = (TextView) findViewById(R.id.truefly);
                break;
            case 16:
                quantityTextView = (TextView) findViewById(R.id.gilledsnail);
                break;
            case 17:
                quantityTextView = (TextView) findViewById(R.id.lungedsnail);
                break;
            case 18:
                quantityTextView = (TextView) findViewById(R.id.clam);
                break;

        }
        quantityTextView.setText("" + quantity[numBugsIndex]);
    }

    private int getSum() {

        int sum = 0;

        for (int i = 0; i < quantity.length; i++) {
            sum += quantity[i];
        }

        return sum;
    }


    private void setMetric1() {
        metric1 = (((double) (quantity[7] + quantity[6] + quantity[11])) / this.getSum())*100;
    }

    private void setMetric2() {
        metric2 = (((double) quantity[10]) / this.getSum())*100;
    }

    private void setMetric3() {
        metric3 = (((double) quantity[17]) / this.getSum())*100;
    }

    private void setMetric4() {
        metric4 = (((double) quantity[12]) / this.getSum())*100;
    }

    private void setMetric5() {
        metric5 = (((double) (quantity[0] + quantity[1] + quantity[2] + quantity[4] + quantity[5] + quantity[8] + quantity[13] + quantity[14] + quantity[17] + quantity[18])) / this.getSum())*100;
    }

    private void setMetric6() {
        metric6 = (((double) (quantity[0] + quantity[1] + quantity[2] + quantity[3] + quantity[4] + quantity[5] + quantity[16] + quantity[17] + quantity[18])) / this.getSum())*100;
    }

    private void setCondition() {

        condition = 0;
        setMetric1();
        setMetric2();
        setMetric3();
        setMetric4();
        setMetric5();
        setMetric6();
        Log.v("Muddy Stream", "" + metric1);
        Log.v("Muddy Stream", "" + metric2);
        Log.v("Muddy Stream", "" + metric3);
        Log.v("Muddy Stream", "" + metric4);
        Log.v("Muddy Stream", "" + metric5);
        Log.v("Muddy Stream", "" + metric6);

        if(metric1 > 32.2) {
            condition += 2;
        }
        else if(metric1 >= 16.1) {
            condition += 1;
        }

        if(metric2 < 19.7) {
            condition += 2;
        }
        else if(metric2 <= 34.5) {
            condition += 1;
        }

        if(metric3 < 0.3) {
            condition += 2;
        }
        else if(metric3 <= 1.5) {
            condition += 1;
        }

        if(metric4 > 6.4) {
            condition += 2;
        }
        else if(metric4 >= 3.2) {
            condition += 1;
        }

        if(metric5 < 46.7) {
            condition += 2;
        }
        else if(metric5 <= 61.5) {
            condition += 1;
        }

        if(metric6 < 5.4) {
            condition += 2;
        }
        else if(metric6 <= 20.8) {
            condition += 1;
        }

    }

    public void displayScoreRocky(View view) {
        setCondition();

        Intent intent = new Intent(this, displayScoreRocky.class);

        intent.putExtra("Index", condition);
        startActivity(intent);

       // TextView textView = (TextView) findViewById(R.id.calculation);
       // textView.setText("" + condition);
    }

}
