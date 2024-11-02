package core;

import core.observable.Point;
import java.util.ArrayList;

public class Polygon {

    private ArrayList<Point> points;

    public Polygon() {
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public Point getPoint(int index) {
        return this.points.get(index);
    }

}
