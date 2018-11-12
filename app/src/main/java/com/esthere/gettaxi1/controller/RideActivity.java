package com.esthere.gettaxi1.controller;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TimePicker;

import com.esthere.gettaxi1.R;
import com.esthere.gettaxi1.model.datasource.Globals;
import com.esthere.gettaxi1.model.entities.Ride;

import java.sql.Time;

public class RideActivity extends Activity {

    EditText name, email, phone, sourceL, destinationL;//, leaveT,destinationT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride);
        email = (EditText) findViewById(R.id.emailCostumer);
        name = (EditText) findViewById(R.id.nameCostumer);
        phone = (EditText) findViewById(R.id.phoneCostumer);
        sourceL = (EditText) findViewById(R.id.sourceLocation);
        destinationL = (EditText) findViewById(R.id.targetLocation);
        //leaveT= (EditText) findViewById(R.id.leaveTime);
        //destinationT = (EditText) findViewById(R.id.arriveTime);
    }

    public void addRideClicked(View view) {
        int hour=((TimePicker) findViewById(R.id.timeRide)).getHour();
        int minute=((TimePicker) findViewById(R.id.timeRide)).getMinute();
        Time time=new Time(hour,minute,0);
        Ride ride = new Ride(destinationL.toString(), sourceL.toString(), ((RadioButton) findViewById(R.id.rbLeaving)).isChecked(), time, name.toString(), phone.toString(), email.toString());
        Globals.backend.addRide(ride);

    }
}
