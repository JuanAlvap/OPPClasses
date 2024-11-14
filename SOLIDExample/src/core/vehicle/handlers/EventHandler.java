package core.vehicle.handlers;

import core.vehicle.Vehicle;
import core.vehicle.drivingmodes.DrivingMode;

public class EventHandler {
    
    private Vehicle vehicle;
    
    public EventHandler(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public void changeDrivingMode(DrivingMode drivingMode) {
        vehicle.setPower(drivingMode.getPower());
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());
    }
    
}
