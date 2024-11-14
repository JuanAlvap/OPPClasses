package core.vehicle;

public class Plane extends Vehicle {
    
    public Plane(int maxFuel) {
        super(maxFuel);
    }
    
    
    @Override
    public void accelerate() {
        this.setRemainingFuel(this.getRemainingFuel() - 10);
    }
}
