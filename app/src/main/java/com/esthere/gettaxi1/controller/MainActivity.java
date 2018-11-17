package com.esthere.gettaxi1.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.esthere.gettaxi1.R;
import com.esthere.gettaxi1.model.entities.Ride;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


//****************************


//************************************************


import java.util.HashMap;

import static android.content.ContentValues.TAG;
import static android.widget.Toast.*;

public class MainActivity extends Activity {

    Button btnShowLocation;

    // GPSTracker class
    GPSTracker gps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        PlaceAutocompleteFragment autocompleteFragment = (PlaceAutocompleteFragment)
//                getFragmentManager().findFragmentById(R.id.place_autocomplete_fragment);
//
//        autocompleteFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() {
//            @Override
//            public void onPlaceSelected(Place place) {
//                // TODO: Get info about the selected place.
//                Log.i(TAG, "Place: " + place.getName());
//            }
//
//            @Override
//            public void onError(Status status) {
//                // TODO: Handle the error.
//                Log.i(TAG, "An error occurred: " + status);
//            }
//        });


        btnShowLocation = (Button) findViewById(R.id.btnShowLocation);

        // show location button click event
        btnShowLocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // create class object
                gps = new GPSTracker(MainActivity.this);

                // check if GPS enabled
                if(gps.canGetLocation()){

                    double latitude = gps.getLatitude();
                    double longitude = gps.getLongitude();

                    // \n is for new line
                    Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();
                }else{
                    // can't get location
                    // GPS or Network is not enabled
                    // Ask user to enable GPS/network in settings
                    gps.showSettingsAlert();
                }

            }
        });
//*************************fill fragment*********************************8
        PlaceAutocompleteFragment autocompleteFragment = (PlaceAutocompleteFragment)
                getFragmentManager().findFragmentById(R.id.place_autocomplete_fragment);

        autocompleteFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(Place place) {
                // TODO: Get info about the selected place.
                Log.i(TAG, "Place: " + place.getName());
            }

            @Override
            public void onError(Status status) {
                // TODO: Handle the error.
                Log.i(TAG, "An error occurred: " + status);
            }
        });


    }

    public void gotoLogin(View view) {
        Intent intent=new Intent(MainActivity.this,LoginActivity2.class);
        startActivity(intent);
    }

    public void gotoride(View view) {
        Intent intent=new Intent(MainActivity.this,RideActivity.class);
        startActivity(intent);
    }

    public void addToFirebase(View view) {
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//        HashMap<String,Object> hashMap = new HashMap();
//        hashMap.put("key-1","value 6 ");
//        hashMap.put("key-2","value 2 ");
//        hashMap.put("key-3","value 3 ");
//        myRef.setValue(hashMap);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message2");
        Task<Void> task = myRef.push().setValue("Hello, World!");
        //Toast toast=new Toast(task.isComplete());

        Ride ride1 =new Ride();
        ride1.setEmail("lll@jk");
        ride1.setStatus(Ride.Status.AVAILABLE);
        ride1.setPhone("090788778");
        ride1.setName("lll");
        DatabaseReference newRef = myRef.child("Person").push();
        newRef.setValue(ride1);


        //myRef.push().setValue(ride1);


        Toast.makeText(this, ""+task.isComplete(), LENGTH_SHORT).show();
    }


}
