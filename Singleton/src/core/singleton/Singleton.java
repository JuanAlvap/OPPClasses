package core.singleton;

public class Singleton {

    private static Singleton instance;

    private int value;
    private String data;

    private Singleton(int value, String data) {
        this.value = value;
        this.data = data;
    }

    public static Singleton getInstance(){
        return instance;
    }
    
    public static Singleton getInstance(int value, String data) {
        if (instance == null) {
            instance = new Singleton(value, data);
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public int getValue() {
        return value;
    }

    public int add(int value) {
        return this.value + value;
    }
}
