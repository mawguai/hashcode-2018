package fr.xebia.hashcode.model;

import java.util.List;

public class Vehicle {
    private Position position;
    private boolean onRide;
    private int remainingStep;
    private List<Ride> rides;

    public Vehicle(Position position, boolean onRide, int remainingStep, List<Ride> rides) {
        this.position = position;
        this.onRide = onRide;
        this.remainingStep = remainingStep;
        this.rides = rides;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isOnRide() {
        return onRide;
    }

    public void setOnRide(boolean onRide) {
        this.onRide = onRide;
    }

    public int getRemainingStep() {
        return remainingStep;
    }

    public void setRemainingStep(int remainingStep) {
        this.remainingStep = remainingStep;
    }

    public List<Ride> getRides() {
        return rides;
    }

    public void setRides(List<Ride> rides) {
        this.rides = rides;
    }
}
