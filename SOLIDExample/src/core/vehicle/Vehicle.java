package core.vehicle;

import core.vehicle.components.Gear;
import core.vehicle.switches.EngineSwitch;

public abstract class Vehicle implements EngineSwitch{

    private final int maxFuel;
    private int remainingFuel;

    private int power;
    private int suspensionHeight;

    private Gear gear;
    private boolean moving;
    
    private boolean engineRunning;

    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSuspensionHeight() {
        return suspensionHeight;
    }

    public void setSuspensionHeight(int suspensionHeight) {
        this.suspensionHeight = suspensionHeight;
    }

    public void setRemainingFuel(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public Gear getGear() {
        return gear;
    }

    public void changeGear(Gear gear) {
        this.gear = gear;
    }

    public boolean isMoving() {
        return moving;
    }

    public void move() {
        this.moving = true;
    }
    
    public void stop() {
        this.moving = false;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    @Override
    public void startEngine() {
        this.engineRunning = true;
    }

    @Override
    public void shutDownEngine() {
        this.engineRunning = false;
    }
    

    public abstract void accelerate();

    
}
