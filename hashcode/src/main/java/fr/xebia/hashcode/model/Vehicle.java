package fr.xebia.hashcode.model;

import fr.xebia.hashcode.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vehicle {
    private int id;
    private Position position;
    private boolean onRide;
    private int remainingStep;
    private Ride currentRide;
    private List<Ride> treatedRides = new ArrayList<>();
    private List<Ride> nextRides = new ArrayList<>();


    public Vehicle(int id, Position position, boolean onRide, int remainingStep) {
        this.id = id;
        this.position = position;
        this.onRide = onRide;
        this.remainingStep = remainingStep;
    }

    public void switchToNextRide() {
        treatedRides.add(currentRide);
        currentRide = null;
        onRide = false;
        if (!nextRides.isEmpty()) {
            setCurrentRide(nextRides.get(0));
            nextRides.remove(0);
        }
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

    public List<Ride> getTreatedRides() {
        return treatedRides;
    }

    public void setTreatedRides(List<Ride> treatedRides) {
        this.treatedRides = treatedRides;
    }

    public List<Ride> getNextRides() {
        return nextRides;
    }

    public void setNextRides(List<Ride> nextRides) {
        this.nextRides = nextRides;
    }

    public Ride getCurrentRide() {
        return currentRide;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void decrementRemainingStep() {
        if (remainingStep > 0) {
            this.remainingStep--;
            if (remainingStep == 0 && currentRide != null) {
                switchToNextRide();
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public void setCurrentRide(Ride currentRide) {
        this.currentRide = currentRide;
        this.setRemainingStep(currentRide.getDistance() + Utils.getDistance(this.position, currentRide.getStart()));
        this.setOnRide(true);
        this.position = currentRide.getStop();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "position=" + position +
                ", onRide=" + onRide +
                ", remainingStep=" + remainingStep +
                ", currentRide=" + currentRide +
                ", treatedRides=" + treatedRides +
                ", nextRides=" + nextRides +
                '}';
    }

    public String resultString(){
        String result = id + "";
        for(Ride ride : treatedRides){
            result += " " + ride.getId();
        }
        return result;
    }
}
