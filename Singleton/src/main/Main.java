package main;

import core.singleton.Singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance(7, "Hello World");
        System.out.println("Singleton 1:");
        System.out.println("- Value: " + singleton1.getValue());
        System.out.println("- Data: " + singleton1.getData());
        System.out.println("- Add: " + singleton1.add(45));

        Singleton singleton2 = Singleton.getInstance(14, "This is a Test");
        System.out.println("\nSingleton 2: ");
        System.out.println("- Value: " + singleton1.getValue());
        System.out.println("- Data: " + singleton1.getData());
        System.out.println("- Add: " + singleton1.add(45));

        Singleton singleton3 = Singleton.getInstance();
        System.out.println("\nSingleton 3: ");
        System.out.println("- Value: " + singleton1.getValue());
        System.out.println("- Data: " + singleton1.getData());
        System.out.println("- Add: " + singleton1.add(45));

    }
}
