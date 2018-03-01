package fr.xebia.hashcode;

import fr.xebia.hashcode.model.Vehicle;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class HashCodeApp {

    public static void main(String[] args) {
        URL path = HashCodeApp.class.getResource("/a_example.in");
        FileIn fileIn = new FileIn(path.getPath());
        //fileIn.getRideList().forEach(System.out::println);

        VehicleController vehicleController = new VehicleController(fileIn.getVehicles());

        List<Vehicle> vehicleList = vehicleController.orchestrator(fileIn.getRideList(), fileIn.getMaxSteps());
        vehicleList.forEach(vehicle -> System.out.println(vehicle.resultString()));

    }

}
