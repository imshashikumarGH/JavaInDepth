package designPattern.factory;

public class Demo {
    public static void main(String[] args) {
        Point newCartesianPoint = Point.PointFactory.newCartesianPoint(2, 3);
        Point newPolarPoint = Point.PointFactory.newPolarPoint(3, 20);
        System.out.println(newPolarPoint);
        System.out.println(newCartesianPoint);
    }
}
