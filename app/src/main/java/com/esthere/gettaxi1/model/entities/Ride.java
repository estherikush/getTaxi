package com.esthere.gettaxi1.model.entities;

public class Ride {
    public enum  Status {
        AVAILABLE,
        BUSY,
        FINISHED
    }
    private String targetLocation;
    private String sourceLocation;
    private Status status;
//constructors
    public Ride(String targetLocation, String sourceLocation, Status status) {
        this.targetLocation = targetLocation;
        this.sourceLocation = sourceLocation;
        this.status = status;
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
}
