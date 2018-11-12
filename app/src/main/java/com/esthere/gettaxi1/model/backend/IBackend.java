package com.esthere.gettaxi1.model.backend;

import java.util.ArrayList;
import com.esthere.gettaxi1.model.entities.*;

public interface IBackend {
    public ArrayList<Driver> getDrivers();
    public void addDriver(Driver driver);
    public Boolean Login(User user);

    void addRide(Ride ride);
}
