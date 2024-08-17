package Inheritance;


class Dog {
    private boolean isPet;

    public Dog(boolean isPet) {
        this.isPet = isPet;
    }

    public void greet() {
        if (isPet) {
            System.out.println(" barking happily!");
        } else {
            System.out.println("Barking.");
        }
    }
}

public class inher6 {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic animal sound");
        Dog dog = new Dog(true);

        animal.makeSound();
        dog.greet();
    }
}