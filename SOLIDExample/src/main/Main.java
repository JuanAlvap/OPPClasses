package main;

import core.person.Driver;
import core.vehicle.RacingCar;
import core.vehicle.components.Gear;
import core.vehicle.drivingmodes.Sport;
import core.vehicle.handlers.EventHandler;

public class Main {
    
    public static void main(String[] args) {
        RacingCar car = new RacingCar(500);
        EventHandler handler = new EventHandler(car);
        Driver pilot = new Driver(car);
        
        handler.changeDrivingMode(new Sport());
        
        car.startEngine();
        car.changeGear(Gear.D);
        car.move();
        
        for (int i = 0; i < 50; i++) {
            pilot.increaseSpeed();
        }
        
        System.out.println("Car Remaining Fuel = " + car.getRemainingFuel());
        System.out.println("Car Power = " + car.getPower());
    }
    
}
