package fr.xebia.hashcode.utils;

import fr.xebia.hashcode.model.Position;
import fr.xebia.hashcode.model.Ride;

import java.util.List;

public class Utils {

    public static int getDistance(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }

    public static Integer getDistance(Position p1, Position p2) {
        return Math.abs(p1.getX() - p2.getX()) + Math.abs(p1.getY() - p2.getY());
    }

}
