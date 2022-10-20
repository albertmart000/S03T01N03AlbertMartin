package S03T01N03AlbertMartin.model;

import S03T01N03AlbertMartin.interfaces.VehicleTask;

import java.util.ArrayList;
import java.util.List;

public class Parking implements VehicleTask{

    private List<VehicleTask> vehicleTaskList = new ArrayList<>();
    private List<Vehicle> vehicleList = new ArrayList<>();
    
    public void addTask(VehicleTask task){
        vehicleTaskList.add(task);
    }

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    @Override
    public void runTask(Vehicle vehicle) {
        for (VehicleTask vehicleTask : vehicleTaskList) {
            vehicleTask.runTask(vehicle);
            }
    }
}
