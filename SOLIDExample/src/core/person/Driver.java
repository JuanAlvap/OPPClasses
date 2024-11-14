package core.person;

import core.vehicle.Vehicle;

public class Driver {
    
    private Vehicle vehicle;

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public void increaseSpeed() {
        this.vehicle.accelerate();
    }
    
}
