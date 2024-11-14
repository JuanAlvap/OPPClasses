package core.station;

import core.vehicle.Vehicle;

public class FuelPump {
    
    public void reFuel(Vehicle vehicle){
        
        int remainingFuel = vehicle.getRemainingFuel();
        int additionalFuel = vehicle.getMaxFuel() -remainingFuel;
        vehicle.setRemainingFuel(remainingFuel+additionalFuel);
        
    }
    
}
