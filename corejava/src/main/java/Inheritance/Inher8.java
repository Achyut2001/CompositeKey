package Inheritance;


class Vehicle {// parent class
    void start() {
        System.out.println("The vehicle starts.");
    }

    void stop() {
        System.out.println("The vehicle stops.");
    }
}


class Car extends Vehicle {// child class
    void honk() {
        System.out.println("The car honks.");
    }
}

class Bike extends Vehicle {
    void ringBell() {
        System.out.println("The bike rings its bell.");
    }
}
public class Inher8  {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bike myBike = new Bike();
        System.out.println("calling from car class ");
        myCar.start();
        myCar.honk();
        myCar.stop();

        System.out.println("calling from bike class ");

        myBike.start();
        myBike.ringBell();
        myBike.stop();
    }
}
