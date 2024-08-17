package Inheritance;

class parent1 {
    void car_name() {
        System.out.println("car name is Maruti");
    }
    void car_speed() {
        System.out.println("car speed is 120");

    }
}

class vehicle extends parent1 {


    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.car_name();
        v.car_speed();
    }

}


