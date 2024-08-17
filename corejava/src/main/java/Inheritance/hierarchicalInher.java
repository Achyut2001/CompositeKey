package Inheritance;

/* program for hierarchical inheritance */
class GrandParent {
    void GrandParent() {
        System.out.println("calling from Grand Parent");
    }
}

class Parent extends GrandParent {
    void Parent() {
        System.out.println("Calling from Parent class...");
    }
}

class Child1 extends Parent {
    void child1() {
        System.out.println("Calling from child1");
    }
}

class Child2 extends Parent {
    void child2() {
        System.out.println("Calling from Child2");
    }
}

class child3 extends Parent {
    void child3() {
        System.out.println("calling from child3");
    }
}

public class hierarchicalInher {
    public static void main(String[] Args) {
        Child1 child1 = new Child1();
        child1.Parent();// calling method from Parent class


        Child2 child2 = new Child2();
        child2.Parent();//calling method from Parent class


        child3 child3 = new child3();
        child3.Parent();// calling method from Parent class
    }
}
