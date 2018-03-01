package fr.xebia.hashcode;

import fr.xebia.hashcode.model.Position;
import fr.xebia.hashcode.model.Ride;
import fr.xebia.hashcode.model.Vehicle;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashCodeApp {

    public static void main(String[] args) {
        URL path = HashCodeApp.class.getResource("/a_example.in");
        FileIn fileIn = new FileIn(path.getPath());
        fileIn.getRideList().forEach(System.out::println);

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Vehicle(new Position(0, 0), false, 0);
        Ride ride1 = new Ride(0, new Position(0, 0), new Position(0, 0), 0, 0);
        Ride ride2 = new Ride(1, new Position(0, 0), new Position(0, 0), 0, 0);
        List<Ride> rides1 = new ArrayList<>();
        rides1.add(ride1);
        vehicle1.setTreatedRides(rides1);

        Vehicle vehicle2 = new Vehicle(new Position(0, 0), false, 0);
        Ride ride3 = new Ride(2, new Position(0, 0), new Position(0, 0), 0, 0);
        Ride ride4 = new Ride(3, new Position(0, 0), new Position(0, 0), 0, 0);
        List<Ride> rides2 = new ArrayList<>();
        rides2.add(ride3);
        rides2.add(ride2);
        rides2.add(ride4);
        vehicle2.setTreatedRides(rides2);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        FileOut.generateFileOut(vehicles, "/home/antho/Workspace/hashcode/hashcode-2018/hashcode/src/main/resources/out.txt");
    }

}
