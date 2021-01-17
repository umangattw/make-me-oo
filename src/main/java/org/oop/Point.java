package org.oop;

public class Point {
    private final double x;
    private final double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point anotherPoint) {
        return Math.hypot(difference(this.x, anotherPoint.x), difference(this.y, anotherPoint.y));
    }

    public double direction(Point anotherPoint){
        return Math.atan2(difference(anotherPoint.y, this.y), difference(anotherPoint.x, this.x));
    }

    private double difference(double pointOne, double pointTwo)
    {
        return pointOne - pointTwo;
    }
}
