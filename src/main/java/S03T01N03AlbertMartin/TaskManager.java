package S03T01N03AlbertMartin;

import S03T01N03AlbertMartin.Interfaces.VehicleTask;

public class Parking {

    public void run (VehicleTask task, Vehicle vehicle) {
        task.runTask(vehicle);
    }

}
