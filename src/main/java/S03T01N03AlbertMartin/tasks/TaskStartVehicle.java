package S03T01N03AlbertMartin.tasks;

import S03T01N03AlbertMartin.interfaces.VehicleTask;
import S03T01N03AlbertMartin.model.Vehicle;

public class TaskStartVehicle implements VehicleTask {

    @Override
    public void runTask(Vehicle vehicle) {
        System.out.println("Estic posant en marxa un vehicle tipus " + vehicle.getType() + "." );

    }
}
