package com.esthere.gettaxi1.model.datasource;
import java.util.ArrayList;

import com.esthere.gettaxi1.model.backend.IBackend;
import com.esthere.gettaxi1.model.entities.Driver;
import com.esthere.gettaxi1.model.entities.Ride;
import com.esthere.gettaxi1.model.entities.User;

public class Lists implements IBackend {

    private ArrayList<Driver> drivers = new ArrayList<>();
    private ArrayList<Ride> rides = new ArrayList<>();
    @Override
    public ArrayList<Driver> getDrivers() {
        return this.drivers;
    }

    @Override
    public void addDriver(Driver driver) {
        this.drivers.add(driver);
    }

    @Override
    public Boolean Login(User user) {
        return (user.getEmail().equals("a") && user.getPassword().equals("1234"));
    }

//    @Override
//    public ArrayList<Ride> getRides() {
//        return this.rides;
//    }

    @Override
    public void addRide(Ride ride) {
        this.rides.add(ride);
    }

}
