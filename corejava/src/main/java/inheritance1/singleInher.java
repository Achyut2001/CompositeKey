package inheritance1;
/* single Inheritance */
class animal {  //parent
    void eat() {
        System.out.println("eat");
    }

}

class dog extends animal { //child

}

public class singleInher {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
    }
}
