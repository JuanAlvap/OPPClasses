package core.composite;

public abstract class Component {

    protected int data;

    public Component(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
    
    
}
