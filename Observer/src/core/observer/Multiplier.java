package core.observer;

public class Multiplier extends Observer {

    private int value;

    public Multiplier(int value) {
        super();
        this.value = value;
    }

    public int multiplier(int value) {
        return this.value * value;
    }

    @Override
    public void notify(int value) {
        System.out.println("Executing multiplier... result = " + this.multiplier(value));
    }

}
