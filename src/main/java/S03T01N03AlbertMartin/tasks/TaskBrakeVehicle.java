package S03T01N03AlbertMartin.tasks;

import S03T01N03AlbertMartin.interfaces.VehicleTask;
import S03T01N03AlbertMartin.model.Vehicle;

public class TaskBrakeVehicle implements VehicleTask {

    @Override
    public void runTask(Vehicle vehicle) {
        System.out.println("Estic frenant un vehicle tipus " + vehicle.getType() + "." );
    }
}
