package org.oop;

public class Point {
    private final double x;
    private final double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point from, Point to) {
        return Math.hypot(difference(from.x, to.x), difference(from.y, to.y));
    }

    public static double direction(Point from, Point to){
        return Math.atan2(difference(to.y, from.y), difference(to.x, from.x));
    }

    private static double difference(double pointOne, double pointTwo)
    {
        return pointOne - pointTwo;
    }
}
