package fr.xebia.hashcode;

public class Ride {
    private Position start;
    private Position stop;
    private int earliestStart;
    private int latestFinish;

    public Ride() {
    }

    public Ride(Position start, Position stop, int earliestStart, int latestFinish) {
        this.start = start;
        this.stop = stop;
        this.earliestStart = earliestStart;
        this.latestFinish = latestFinish;
    }

    public Position getStart() {
        return start;
    }

    public void setStart(Position start) {
        this.start = start;
    }

    public Position getStop() {
        return stop;
    }

    public void setStop(Position stop) {
        this.stop = stop;
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
