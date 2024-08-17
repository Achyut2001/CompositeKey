package interfaceClass;

interface A {
    void interfaceMethod();
}
interface B extends A {
    default void Show() {
        System.out.println("Method from B class b");
    }
}
class C implements B{
    @Override
    public void interfaceMethod() {
        System.out.println("Method from A class");
    }
    @Override
    public void Show() {
        System.out.println("Method from B class");
    }
}
public class interface_Class {
    public static void main(String[] args) {
        C c = new C();
        c.Show();
    }
}
