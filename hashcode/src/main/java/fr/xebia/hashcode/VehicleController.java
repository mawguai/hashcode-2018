package fr.xebia.hashcode;

import fr.xebia.hashcode.model.Ride;
import fr.xebia.hashcode.model.Vehicle;
import fr.xebia.hashcode.utils.Utils;

import java.util.List;

public class VehicleController {

    public void orchestrator() {

    }

    private Vehicle determineClosestFreeVehicle(Ride ride, List<Vehicle> vehicles) {
        return vehicles.stream()
                .filter(vh -> !vh.isOnRide())
                .sorted((vh1, vh2) ->
                        Utils.getDistance(vh1.getPosition(), ride.getStart())
                                .compareTo(Utils.getDistance(vh2.getPosition(), ride.getStart())))
                .findFirst()
                .orElse(null);
    }



}
