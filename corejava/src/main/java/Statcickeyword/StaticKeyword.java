package Statcickeyword;

public class StaticKeyword {
    static void Method() {
        int a = 2;
        System.out.println("local variable\t" + a);
    }

    public static void main(String[] args) {
        StaticKeyword.Method();

    }
}
