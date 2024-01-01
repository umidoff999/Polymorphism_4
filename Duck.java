package Polymorphism_2;

public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("quack quack");
    }
}
