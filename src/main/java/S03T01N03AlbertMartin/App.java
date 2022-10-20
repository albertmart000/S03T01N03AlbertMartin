package S03T01N03AlbertMartin;

import S03T01N03AlbertMartin.model.Parking;
import S03T01N03AlbertMartin.model.Vehicle;
import S03T01N03AlbertMartin.tasks.TaskAccelerateVehicle;
import S03T01N03AlbertMartin.tasks.TaskBrakeVehicle;
import S03T01N03AlbertMartin.tasks.TaskStartVehicle;

public class App {

    private static final String CAR = "cotxe";
    private static final String BIKE = "bicicleta";
    private static final String PLANE = "avió";
    private static final String SHIP = "vaixell";

    public static void main(String[] args) {

        // Creem el parking que volem gestionar.
        Parking parking = new Parking();

        // Afegim les tasques a fer i els vehicles
        parking.addTask(new TaskStartVehicle());
        parking.addTask(new TaskAccelerateVehicle());
        parking.addTask(new TaskBrakeVehicle());

        parking.addVehicle(new Vehicle(CAR));
        parking.addVehicle(new Vehicle(BIKE));
        parking.addVehicle(new Vehicle(PLANE));
        parking.addVehicle(new Vehicle(SHIP));

        //Executem les tasques
        TaskManager taskManager = new TaskManager();
        for (Vehicle vehicle : parking.getVehicleList()) {
            System.out.println();
            taskManager.run(parking, vehicle);
        }
    }
}