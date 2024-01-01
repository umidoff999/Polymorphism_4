package Polymorphism_2;

public class Rectangle extends GeometricFigure{

    private double sideA;
    private double sideB;
    public Rectangle(double area, double perimeter, double sideA, double sideB) {
        super(area, perimeter);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double result(double sideA, double sideB){
        return sideA * sideB;
    }
}
