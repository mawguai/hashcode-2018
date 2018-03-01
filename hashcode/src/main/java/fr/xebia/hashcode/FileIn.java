package fr.xebia.hashcode;

import fr.xebia.hashcode.model.Position;
import fr.xebia.hashcode.model.Ride;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe permettant de lire un ficher d'entrée
public class FileIn {

    private String filename;
    private int rows = 0;
    private int columns = 0;
    private int vehicles = 0;
    private int rides = 0;
    private int bonus = 0;
    private int maxSteps = 0;

    List<Ride> rideList = new ArrayList<>();

    public FileIn(String filename) {
        this.filename = filename;
        try {
            File file = new File(filename);
            try (Scanner sc = new Scanner(file)) {
                this.rows = sc.nextInt();
                this.columns = sc.nextInt();
                this.vehicles = sc.nextInt();
                this.rides = sc.nextInt();
                this.bonus = sc.nextInt();
                this.maxSteps = sc.nextInt();

                int j = 0;
                while (sc.hasNext()) {

                    Position startPosition = new Position(sc.nextInt(), sc.nextInt());
                    Position stopPosition = new Position(sc.nextInt(), sc.nextInt());
                    int earliestStart = sc.nextInt();
                    int latestFinish = sc.nextInt();
                    Ride ride = new Ride(startPosition, stopPosition, earliestStart, latestFinish);
                    rideList.add(ride);
                }

            }
        } catch(Exception e) {}
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getVehicles() {
        return vehicles;
    }

    public void setVehicles(int vehicles) {
        this.vehicles = vehicles;
    }

    public int getRides() {
        return rides;
    }

    public void setRides(int rides) {
        this.rides = rides;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getMaxSteps() {
        return maxSteps;
    }

    public void setMaxSteps(int maxSteps) {
        this.maxSteps = maxSteps;
    }

    public List<Ride> getRideList() {
        return rideList;
    }

    public void setRideList(List<Ride> rideList) {
        this.rideList = rideList;
    }

    public void debug() {
        System.out.println("Nombre de lignes : " + this.rows);
        System.out.println("Nombre de colonnes : " + this.columns);

    }
}