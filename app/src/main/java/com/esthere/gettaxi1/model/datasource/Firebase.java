package com.esthere.gettaxi1.model.datasource;

import com.esthere.gettaxi1.model.backend.IBackend;
import com.esthere.gettaxi1.model.entities.Driver;
import com.esthere.gettaxi1.model.entities.Ride;
import com.esthere.gettaxi1.model.entities.User;

import java.util.ArrayList;

public class Firebase implements IBackend {
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

    }
}
