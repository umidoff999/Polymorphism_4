package Polymorphism_2;

public class Triangle extends GeometricFigure{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double area, double perimeter, double sideA, double sideB, double sideC) {
        super(area, perimeter);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double result(double sideA, double sideB, double sideC){
        return sideA + sideB + sideC;
    }
}
