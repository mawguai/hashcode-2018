package fr.xebia.hashcode;

import fr.xebia.hashcode.model.Position;
import fr.xebia.hashcode.model.Ride;
import fr.xebia.hashcode.model.Vehicle;
import fr.xebia.hashcode.utils.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class VehicleController {

    private List<Vehicle> vehicles = new ArrayList<>();

    public VehicleController(int vehicleNumber) {
        for(int i = 1; i <= vehicleNumber; i++){
            vehicles.add(new Vehicle(i, new Position(0,0), false, 0));
        }
    }

    public List<Vehicle> orchestrator(List<Ride> rides, int nbSteps) {
        for (int i = 1; i <= nbSteps; i++) {
            if (i % 1000 == 0) System.out.println(i);
            vehicles.stream()
                    .filter(Vehicle::isOnRide)
                    .forEach(Vehicle::decrementRemainingStep);

            Iterator<Ride> iterator = rides.iterator();
            while (iterator.hasNext()) {
                Ride ride = iterator.next();
                ride.decrementTurn();
                if (ride.getDistance() > ride.getLatestFinish()) {
                    iterator.remove();
                    continue;
                }
                Vehicle vehicle = determineClosestFreeVehicle(ride, vehicles);
                if (vehicle != null) {
                    vehicle.setCurrentRide(ride);
                    iterator.remove();
                }
            }
        }

        return vehicles;
    }

    private Vehicle determineClosestFreeVehicle(Ride ride, List<Vehicle> vehicles) {
        return vehicles.stream()
                .filter(vh -> !vh.isOnRide()).min(Comparator.comparing(vh2 -> Utils.getDistanceFromRide(vh2.getPosition(), ride)))
                .orElse(null);
    }
}
