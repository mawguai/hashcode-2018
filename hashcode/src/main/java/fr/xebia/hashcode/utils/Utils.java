package fr.xebia.hashcode.utils;

import fr.xebia.hashcode.model.Position;
import fr.xebia.hashcode.model.Ride;

import java.util.List;

public class Utils {

    public static Integer getDistance(Position p1, Position p2) {
        return Math.abs(p1.getX() - p2.getX()) + Math.abs(p1.getY() - p2.getY());
    }

    public static Integer getDistanceFromRide(Position p1, Ride ride) {
        Integer distanceFromStart = getDistance(p1, ride.getStart());
        if (distanceFromStart < ride.getEarliestStart()) {
            return ride.getEarliestStart();
        } else {
            return distanceFromStart;
        }
    }

}
