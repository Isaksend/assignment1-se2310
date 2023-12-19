package models;

public class Point {
    private double x;

    private double y;
    public Point(double x, double y) {
        setX(x);
        setY(y);
    }
    double getDistance(Point dest){
        double x2 = dest.getX();
        double y2 = dest.getY();

        double x1 = this.x;
        double y1 = this.y;

        double firstEq = x2 - x1;
        double secondEq = y2 - y1;

        return Math.sqrt( Math.pow(firstEq,2) + Math.pow(secondEq,2) );

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
