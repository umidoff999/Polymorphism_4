package Polymorphism_2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle( 0,0,0,0,0);
        Trapezium trapezium = new Trapezium(0,0,0,0,0);
        Rectangle rectangle = new Rectangle(0,0,0,0);

        System.out.println(triangle.result(4.0,4.5,6.0));
        System.out.println(trapezium.result(6.0,6.5,4.2));
        System.out.println(rectangle.result(8.0,3.5));

        Animal animal1 = new Dog("Dod");
        Animal animal2 = new Duck("Duck");
        Animal animal3 = new Cat("Cat");

        animal1.sound();
        animal2.sound();
        animal3.sound();

        System.out.println(animal1.getName());
        System.out.println(animal2.getName());
        System.out.println(animal3.getName());
    }
}
