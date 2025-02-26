package Constructor;

public class Constructor_Changing {
    public static void main(String[] args) {
        new Child();

    }
}

class Child extends Chaining_Parent {
    Child() {
        System.out.println("Child");
    }
}

class Chaining_Parent {
    Chaining_Parent() {
        System.out.println("Parent");
    }
}
