package Polymorphism_2;

public class Trapezium extends GeometricFigure{

    private double sideA;
    private double SideB;
    private double high;
    public Trapezium(double area, double perimeter, double sideA, double sideB, double high) {
        super(area, perimeter);
        this.sideA = sideA;
        this.SideB = sideB;
        this.high = high;
    }

    public double result(double sideA, double sideB, double high){
        return (sideA + sideB) * high;
    }
}
