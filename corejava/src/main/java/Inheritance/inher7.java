package Inheritance;

class parent {
    void call() {
        System.out.println("calling from parent class");
    }
}

class child extends parent {

}


public class inher7 {
    public static void main(String[] args) {
        parent p1 = new parent();
        p1.call();
    }
}
