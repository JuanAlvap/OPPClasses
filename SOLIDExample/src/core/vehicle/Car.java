package core.vehicle;

import core.vehicle.components.Gear;
import core.vehicle.switches.RadioSwitch;

public class Car extends Vehicle implements RadioSwitch {

    private boolean radioOn;
    
    public Car(int maxFuel) {
        super(maxFuel);
    }

    private boolean isMovingForwards(Gear gear, Gear actualGear) {
        return this.isMoving() && Gear.D.equals(actualGear) && Gear.R.equals(gear);
    }

    private boolean isMovingBackwards(Gear gear, Gear actualGear) {
        return this.isMoving() && Gear.R.equals(actualGear) && Gear.D.equals(gear);
    }

    @Override
    public void changeGear(Gear gear) {
        Gear actualGear = this.getGear();
        if (isMovingForwards(gear, actualGear) || isMovingBackwards(gear, actualGear)) {
            this.stop();
        }
        super.changeGear(gear);
    }

    public boolean isRadioOn() {
        return radioOn;
    }
    
    @Override
    public void startRadio() {
        this.radioOn = true;
    }

    @Override
    public void shutDownRadio() {
        this.radioOn = false;
    }

    @Override
    public void accelerate() {
        this.setRemainingFuel(this.getRemainingFuel() - 2);
    }
    

}
