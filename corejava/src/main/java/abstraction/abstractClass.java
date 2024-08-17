package abstraction;

abstract class Engine {
    abstract void engine();
    Engine() {
        System.out.println("Hello from Engine constructor");
    }
}
class nano extends Engine {
    void engine() {
        System.out.println("150cc engine");
    }
}
class nexon extends Engine {
    void engine() {
        System.out.println("350 cc engine");
    }
}
public abstract class abstractClass {
    public static void main(String[] args) {
        nexon nexon = new nexon();
        nexon.engine();
        System.out.println();

        nano nano = new nano();
        nano.engine();
        System.out.println();
    }
}
