package com.esthere.gettaxi1.controller;

import android.app.Activity;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TimePicker;

import com.esthere.gettaxi1.R;
import com.esthere.gettaxi1.model.datasource.Globals;
import com.esthere.gettaxi1.model.entities.Ride;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Time;
import java.util.HashMap;

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
        Ride ride = new Ride(null, null, !((RadioButton) findViewById(R.id.rbLeaving)).isChecked(), time, name.getText().toString(), phone.getText().toString(), email.getText().toString());
        Globals.backend.addRide(ride);

        // Write a message to the database https://gett-9a48c.firebaseio.com/
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//
//        myRef.setValue("Hello, World!");

//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//        HashMap<String,Object> hashMap = new HashMap();
//        hashMap.put("key-1","value 1 ");
//        hashMap.put("key-2","value 2 ");
//        hashMap.put("key-3","value 3 ");
//        myRef.setValue(hashMap);

    }
}
