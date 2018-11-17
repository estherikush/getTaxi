package com.esthere.gettaxi1.model.datasource;

import com.esthere.gettaxi1.model.backend.IBackend;
import com.esthere.gettaxi1.model.entities.Driver;
import com.esthere.gettaxi1.model.entities.Ride;
import com.esthere.gettaxi1.model.entities.User;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;

public class Firebase implements IBackend {
    static FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("rides");
    @Override
    public ArrayList<Driver> getDrivers() {
        return null;
    }

    @Override
    public void addDriver(Driver driver) {

    }

    @Override
    public Boolean Login(User user) {
        return null;
    }

    @Override
    public void addRide(Ride ride) {
//        HashMap<String,Object> hashMap = new HashMap();
//        hashMap.put("key-1","value 1 ");
//        hashMap.put("key-2","value 2 ");
//        hashMap.put("key-3","value 3 ");
        //myRef1.push().setValue("student message 1"); myRef1.push().setValue("student message 2"); myRef1.push().setValue("student message 3");
        //myRef.push().setValue(ride);
//myRef.child("ride1").setValue(ride);
        //DatabaseReference myRef1=myRef.child("ride1");
        //myRef1.push().setValue(ride);
        Ride ride1 =new Ride();
        ride.setEmail("lll@jk");
        ride.setStatus(Ride.Status.AVAILABLE);
        ride.setPhone("090788778");
        ride.setName("lll");
        myRef.push().setValue(ride1);
        //myRef1.setValue(ride);
    }
}
