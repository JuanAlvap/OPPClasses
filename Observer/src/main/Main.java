package main;

import core.Polygon;
import core.observable.Point;
import core.observer.Adder;
import core.observer.Multiplier;

public class Main {

    public static void main(String[] args) {
// Create polygon
        Polygon polygon = new Polygon();

        // Add points to polygon
        polygon.addPoint(new Point(0, 0));
        polygon.addPoint(new Point(5, 10));
        polygon.addPoint(new Point(4, 9));
        polygon.addPoint(new Point(10, 12));
        polygon.addPoint(new Point(30, 841));
        polygon.addPoint(new Point(947, 1947));

        // Add observers to points
        System.out.println("");

        polygon.getPoint(0).addObserver(new Adder(4));
        polygon.getPoint(0).addObserver(new Multiplier(2));
        polygon.getPoint(0).addObserver(new Adder(17));
        polygon.getPoint(0).addObserver(new Adder(159));
        polygon.getPoint(0).addObserver(new Multiplier(5));

        polygon.getPoint(1).addObserver(new Multiplier(203));
        polygon.getPoint(1).addObserver(new Adder(87));

        polygon.getPoint(2).addObserver(new Adder(9841));
        polygon.getPoint(2).addObserver(new Multiplier(24));

        polygon.getPoint(3).addObserver(new Adder(3746));
        polygon.getPoint(3).addObserver(new Multiplier(497));

        polygon.getPoint(4).addObserver(new Multiplier(72));
        polygon.getPoint(4).addObserver(new Adder(358));

        polygon.getPoint(5).addObserver(new Multiplier(3795));
        polygon.getPoint(5).addObserver(new Adder(972));

        // Update attribute values (should notify all observators)
        System.out.println("");

        polygon.getPoint(0).setX(3);
        polygon.getPoint(0).setY(14);
        polygon.getPoint(0).setX(9);
        polygon.getPoint(0).setX(82);
        polygon.getPoint(0).setY(1876);

        polygon.getPoint(1).setY(641);
        polygon.getPoint(1).setX(97);

        polygon.getPoint(2).setY(3841);
        polygon.getPoint(2).setX(32);

        polygon.getPoint(3).setX(367);
        polygon.getPoint(3).setY(70);

        polygon.getPoint(4).setY(487);
        polygon.getPoint(4).setX(26);

        polygon.getPoint(5).setX(6782);
        polygon.getPoint(5).setY(1432);

        // Show polygon summary and obtain its perimeter
        //polygon.summary();
        //System.out.println("The perimeter of the polygon is " + String.format("%.2f", polygon.getPerimeter()));
    }

}

/*
------------- Resultados ------------- 

Polygon created...

Point(0, 0) added to polygon
Point(5, 10) added to polygon
Point(4, 9) added to polygon
Point(10, 12) added to polygon
Point(30, 841) added to polygon
Point(947, 1947) added to polygon

Adder(4) is observing Point(0, 0)
Multiplier(2) is observing Point(0, 0)
Adder(17) is observing Point(0, 0)
Adder(159) is observing Point(0, 0)
Multiplier(5) is observing Point(0, 0)
Multiplier(203) is observing Point(5, 10)
Adder(87) is observing Point(5, 10)
Adder(9841) is observing Point(4, 9)
Multiplier(24) is observing Point(4, 9)
Adder(3746) is observing Point(10, 12)
Multiplier(497) is observing Point(10, 12)
Multiplier(72) is observing Point(30, 841)
Adder(358) is observing Point(30, 841)
Multiplier(3795) is observing Point(947, 1947)
Adder(972) is observing Point(947, 1947)

Updated attribute in Point(3, 0), executing addition... result = 7
Updated attribute in Point(3, 0), executing multiplication... result = 6
Updated attribute in Point(3, 0), executing addition... result = 20
Updated attribute in Point(3, 0), executing addition... result = 162
Updated attribute in Point(3, 0), executing multiplication... result = 15
Updated attribute in Point(3, 14), executing addition... result = 18
Updated attribute in Point(3, 14), executing multiplication... result = 28
Updated attribute in Point(3, 14), executing addition... result = 31
Updated attribute in Point(3, 14), executing addition... result = 173
Updated attribute in Point(3, 14), executing multiplication... result = 70
Updated attribute in Point(9, 14), executing addition... result = 13
Updated attribute in Point(9, 14), executing multiplication... result = 18
Updated attribute in Point(9, 14), executing addition... result = 26
Updated attribute in Point(9, 14), executing addition... result = 168
Updated attribute in Point(9, 14), executing multiplication... result = 45
Updated attribute in Point(82, 14), executing addition... result = 86
Updated attribute in Point(82, 14), executing multiplication... result = 164
Updated attribute in Point(82, 14), executing addition... result = 99
Updated attribute in Point(82, 14), executing addition... result = 241
Updated attribute in Point(82, 14), executing multiplication... result = 410
Updated attribute in Point(82, 1876), executing addition... result = 1880
Updated attribute in Point(82, 1876), executing multiplication... result = 3752
Updated attribute in Point(82, 1876), executing addition... result = 1893
Updated attribute in Point(82, 1876), executing addition... result = 2035
Updated attribute in Point(82, 1876), executing multiplication... result = 9380
Updated attribute in Point(5, 641), executing multiplication... result = 130123
Updated attribute in Point(5, 641), executing addition... result = 728
Updated attribute in Point(97, 641), executing multiplication... result = 19691
Updated attribute in Point(97, 641), executing addition... result = 184
Updated attribute in Point(4, 3841), executing addition... result = 13682
Updated attribute in Point(4, 3841), executing multiplication... result = 92184
Updated attribute in Point(32, 3841), executing addition... result = 9873
Updated attribute in Point(32, 3841), executing multiplication... result = 768
Updated attribute in Point(367, 12), executing addition... result = 4113
Updated attribute in Point(367, 12), executing multiplication... result = 182399
Updated attribute in Point(367, 70), executing addition... result = 3816
Updated attribute in Point(367, 70), executing multiplication... result = 34790
Updated attribute in Point(30, 487), executing multiplication... result = 35064
Updated attribute in Point(30, 487), executing addition... result = 845
Updated attribute in Point(26, 487), executing multiplication... result = 1872
Updated attribute in Point(26, 487), executing addition... result = 384
Updated attribute in Point(6782, 1947), executing multiplication... result = 25737690
Updated attribute in Point(6782, 1947), executing addition... result = 7754
Updated attribute in Point(6782, 1432), executing multiplication... result = 5434440
Updated attribute in Point(6782, 1432), executing addition... result = 2404

Polygon summary:
- Number of points: 6
- Final points:
  - Point(82, 1876)
  - Point(97, 641)
  - Point(32, 3841)
  - Point(367, 70)
  - Point(26, 487)
  - Point(6782, 1432)

The perimeter of the polygon is 22296,74
 */
