package com.esthere.gettaxi1.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.esthere.gettaxi1.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoLogin(View view) {
        Intent intent=new Intent(MainActivity.this,LoginActivity2.class);
        startActivity(intent);
    }

    public void gotoride(View view) {
        Intent intent=new Intent(MainActivity.this,RideActivity.class);
        startActivity(intent);
    }
}
