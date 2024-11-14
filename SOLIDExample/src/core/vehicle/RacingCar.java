package core.vehicle;

public class RacingCar extends Vehicle{

    public RacingCar(int maxFuel) {
        super(maxFuel);
    }

    @Override
    public void accelerate() {
        this.setPower(this.getPower() + 10);
        this.setRemainingFuel(this.getRemainingFuel() - 5);
    }
    
}
