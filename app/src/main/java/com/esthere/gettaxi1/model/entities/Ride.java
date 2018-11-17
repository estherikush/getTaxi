package com.esthere.gettaxi1.model.entities;

import android.location.Location;

import java.sql.Time;

public class Ride {
    public enum  Status {
        AVAILABLE,
        BUSY,
        FINISHED
    }
    private Location targetLocation;
    private Location sourceLocation;
    private Status status;
    private Time timeRide;
    private boolean arrivingOrLeaving;
    private String name;
    private String phone;
    private String email;
//constructors
    public Ride(){}
    public Ride(Location targetLocation, Location sourceLocation, Status status) {
        this.targetLocation = targetLocation;
        this.sourceLocation = sourceLocation;
        this.status = status;
    }

    public Ride(Location targetLocation, Location sourceLocation,boolean arrivingOrLeaving, Time timeRide, String name, String phone, String email) {
        this.targetLocation = targetLocation;
        this.sourceLocation = sourceLocation;
        this.status = Status.AVAILABLE;
        this.arrivingOrLeaving=arrivingOrLeaving;
        this.timeRide=timeRide;
        //this.arrivingTime = arrivingTime;
        //this.leavingTime = leavingTime;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    //getters &setters
    public Location getTargetLocation() {
        return targetLocation;
    }

    public void setTargetLocation(Location targetLocation) {
        this.targetLocation = targetLocation;
    }

    public Location getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(Location sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Time getTimeRide() {
        return timeRide;
    }

    public void setTimeRide(Time timeRide) {
        this.timeRide = timeRide;
    }

    public boolean isArrivingOrLeaving() {
        return arrivingOrLeaving;
    }

    public void setArrivingOrLeaving(boolean arrivingOrLeaving) {
        this.arrivingOrLeaving = arrivingOrLeaving;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
