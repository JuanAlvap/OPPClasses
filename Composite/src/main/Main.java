package main;

import core.composite.Composite;
import core.composite.Leaf;

public class Main {

    public static void main(String[] args) {
        Composite root = new Composite(18);
        root.addComponent(new Leaf(41));
        root.addComponent(new Composite(87));
        root.addComponent(new Leaf(-14));

        ((Composite) root.getComponent(1)).addComponent(new Leaf(120));
        ((Composite) root.getComponent(1)).addComponent(new Leaf(94));

        System.out.println("Root: " + root.getData());
        System.out.println("Root Sons:");
        System.out.println("- " + root.getComponent(0).getData());
        System.out.println("- " + root.getComponent(1).getData());
        System.out.println("- " + root.getComponent(2).getData());
        System.out.println("Root Grandsons:");
        System.out.println("- " + ((Composite) root.getComponent(1)).getComponent(0).getData());
        System.out.println("- " + ((Composite) root.getComponent(1)).getComponent(1).getData());
    }
}
