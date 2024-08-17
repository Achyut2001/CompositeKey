package abstraction;

public class ConstructorInAbstractClass {
    public static void main(String[] args) {
        child c = new child(10, "Patewar");
        c.Method(23, "Achyut");
        System.out.println();
    }
}
abstract class Constructor { //We can declare non_Parametrised and Parametrised constructor in abstract class.
    Constructor(int a) {
        System.out.println("Abstract Class Constructor");
        System.out.println("The a value is give by abstract class constructor"  +a);
    }
}
class child extends Constructor {
    child(int a, String surname) {
        super(a);
        System.out.println(surname);

    }
    void Method(int age, String name) {
        System.out.println(age);
        System.out.println(name);

    }
}
