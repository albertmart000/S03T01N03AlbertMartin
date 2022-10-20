package S03T01N03AlbertMartin;

import S03T01N03AlbertMartin.interfaces.VehicleTask;
import S03T01N03AlbertMartin.model.Vehicle;

public class TaskManager {

    public void run (VehicleTask task, Vehicle vehicle) {
        task.runTask(vehicle);
    }

}
