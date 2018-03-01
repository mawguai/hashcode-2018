package fr.xebia.hashcode.model;

import fr.xebia.hashcode.utils.Utils;

public class Ride {
    private Position start;
    private Position stop;
    private int earliestStart;
    private int latestFinish;
    private Integer distance;

    public Ride(Position start, Position stop, int earliestStart, int latestFinish) {
        this.start = start;
        this.stop = stop;
        this.earliestStart = earliestStart;
        this.latestFinish = latestFinish;
        this.computeDistance();
    }

    public Integer getDistance() {
        return distance;
    }

    private void computeDistance() {
        distance = Utils.getDistance(start, stop);
    }

    public Position getStart() {
        return start;
    }

    public void setStart(Position start) {
        this.start = start;
        this.computeDistance();
    }

    public Position getStop() {
        return stop;
    }

    public void setStop(Position stop) {
        this.stop = stop;
        this.computeDistance();
    }

    public int getEarliestStart() {
        return earliestStart;
    }

    public void setEarliestStart(int earliestStart) {
        this.earliestStart = earliestStart;
    }

    public int getLatestFinish() {
        return latestFinish;
    }

    public void setLatestFinish(int latestFinish) {
        this.latestFinish = latestFinish;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "start=" + start +
                ", stop=" + stop +
                ", earliestStart=" + earliestStart +
                ", latestFinish=" + latestFinish +
                '}';
    }
}
