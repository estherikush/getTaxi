package com.esthere.gettaxi1.model.entities;

import java.sql.Time;

public class Ride {
    public enum  Status {
        AVAILABLE,
        BUSY,
        FINISHED
    }
    private String targetLocation;
    private String sourceLocation;
    private Status status;
    private Time timeRide;
    private boolean arrivingOrLeaving;
    private String name;
    private String phone;
    private String email;
//constructors
    public Ride(String targetLocation, String sourceLocation, Status status) {
        this.targetLocation = targetLocation;
        this.sourceLocation = sourceLocation;
        this.status = status;
    }

    public Ride(String targetLocation, String sourceLocation,boolean arrivingOrLeaving, Time timeRide, String name, String phone, String email) {
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
    public String getTargetLocation() {
        return targetLocation;
    }

    public void setTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
    }

    public String getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(String sourceLocation) {
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
