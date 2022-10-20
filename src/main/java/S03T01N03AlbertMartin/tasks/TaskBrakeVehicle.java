package S03T01N03AlbertMartin.Tasks;

import S03T01N03AlbertMartin.Interfaces.VehicleTask;
import S03T01N03AlbertMartin.Vehicle;

public class TaskBrakeVehicle implements VehicleTask {
    @Override
    public void runTask(Vehicle vehicle) {
        System.out.println("Estic frenant un vehicle tipus " + vehicle.getType() + "." );
    }
}
