package abstraction;

abstract class abstract_class22 {
    abstract void method();
}

class abstract_body extends abstract_class22 {

    @Override
    void method() {
        System.out.println("abstract method body");
    }
}

class abstract_body1 extends abstract_class22 {

    @Override
    void method() {
        System.out.println("abstract Method implementation");

    }
}

public class abstractKeyword {
    public static void main(String[] args) {
        abstract_body abstract_body = new abstract_body();
        abstract_body.method();


        abstract_body1 abstract_body1 = new abstract_body1();
        abstract_body1.method();

    }
}