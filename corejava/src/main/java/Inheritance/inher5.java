package Inheritance;

class num1 {
    static int c = 8;
    static int d = 14;
}
class Num2 extends num1 {
    static int a = 5;
    static int b = 3;
}

class Sum extends Num2 {
    public static void main(String[] args) {
        Num2 num2=new Num2();
        int total = a + b + c + d;
        System.out.println("The sum is:" + total);
    }
}