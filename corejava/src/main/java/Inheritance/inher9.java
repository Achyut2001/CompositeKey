package Inheritance;


class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}
public class inher9 {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.draw();
    }
}
