package inheritance1;

/* Hybrid inheritance */

class GrandFather {
    void grandFather() {
        System.out.println("Calling from GrandFather");
    }
}

class Parent11 extends GrandFather {
    void parent() {
        System.out.println("Calling from Parent11");
    }
}

class Son extends Parent11 {
    void son() {
        System.out.println("Calling from Son class...");
    }
}

class Daughter extends Parent11 {
    void daughter() {
        System.out.println("Calling from Daughter class....");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Parent11 parent11 = new Parent11();
        parent11.parent();
        parent11.grandFather();
        System.out.println("---------END------------");
        Son son = new Son();
        son.son();
        son.parent();
        son.grandFather();
        System.out.println("----------END------------");
        Daughter daughter = new Daughter();
        daughter.daughter();
        daughter.parent();
        daughter.grandFather();
    }
}
