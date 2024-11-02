package core.observer;

public class Adder extends Observer {

    private int value;

    public Adder(int value) {
        super();
        this.value = value;
    }

    public int add(int value) {
        return this.value + value;
    }

    @Override
    public void notify(int value) {
        System.out.println("Executing addition... result = " + this.add(value));
    }

}
