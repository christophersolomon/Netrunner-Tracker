package com.modernanachronism.netrunnertracker;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void clickUp(View v) {
        TextView tv = (TextView) findViewById(R.id.clicks);
        int num = Integer.parseInt((String) tv.getText());
        num++;
        if (num >4){
            num = 0;
        }
        tv.setText(Integer.toString(num));
    }



    public void clickDown(View v) {
        TextView tv = (TextView) findViewById(R.id.clicks);
        int num = Integer.parseInt((String) tv.getText());
        num--;
        if (num <0){
            num = 0;
            }
        tv.setText(Integer.toString(num));
    }

    public void credUp(View v) {
        TextView tv = (TextView) findViewById(R.id.creds);
        int num = Integer.parseInt((String) tv.getText());
        num++;
        tv.setText(Integer.toString(num));
    }

    public void credDown(View v) {
        TextView tv = (TextView) findViewById(R.id.creds);
        int num = Integer.parseInt((String) tv.getText());
        num--;
        if (num <0){
            num = 0;
        }
        tv.setText(Integer.toString(num));
    }

    public void brainUp(View v) {
        TextView tv = (TextView) findViewById(R.id.brains);
        int num = Integer.parseInt((String) tv.getText());
        num++;
        if (num > 5){
            num = 5;
        }
        tv.setText(Integer.toString(num));
    }

    public void brainDown(View v) {
        TextView tv = (TextView) findViewById(R.id.brains);
        int num = Integer.parseInt((String) tv.getText());
        num--;
        if (num <0){
            num = 0;
        }
        tv.setText(Integer.toString(num));
    }

    public void tagUp(View v) {
        TextView tv = (TextView) findViewById(R.id.tags);
        int num = Integer.parseInt((String) tv.getText());
        num++;
        tv.setText(Integer.toString(num));
    }

    public void tagDown(View v) {
        TextView tv = (TextView) findViewById(R.id.tags);
        int num = Integer.parseInt((String) tv.getText());
        num--;
        if (num <0){
            num = 0;
        }
        tv.setText(Integer.toString(num));
    }


}
