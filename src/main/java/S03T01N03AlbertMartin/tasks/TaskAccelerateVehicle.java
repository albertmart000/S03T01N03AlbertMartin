package S03T01N03AlbertMartin.tasks;

import S03T01N03AlbertMartin.interfaces.VehicleTask;
import S03T01N03AlbertMartin.model.Vehicle;

public class TaskAccelerateVehicle implements VehicleTask {

    @Override
    public void runTask(Vehicle vehicle) {
        System.out.println("Estic accelerant un vehicle tipus " + vehicle.getType() + "." );
    }
}
