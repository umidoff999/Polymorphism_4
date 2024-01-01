package Polymorphism_2;

  public class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public void sound() {
            System.out.println("Animal's sound...");
        }

        public String getName() {
            return name;
        }
    }

