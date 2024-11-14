package core.vehicle;

import core.vehicle.switches.CameraSwitch;

public class Drone extends Vehicle implements CameraSwitch {
    
    private boolean cameraOn;
    
    public Drone(int maxFuel) {
        super(maxFuel);
    }

    public boolean isCameraOn() {
        return cameraOn;
    }
    
    @Override
    public void startCamera() {
        this.cameraOn = true;
    }

    @Override
    public void shutDownCamera() {
        this.cameraOn = false;
    }
    
    @Override
    public void accelerate() {
        this.setRemainingFuel(this.getRemainingFuel() - 1);
    }
    
}
