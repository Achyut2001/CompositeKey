package AccessModifier;

public class protectedKeyword {
    public static void main(String[] args) {
        protected_class protected_class = new protected_class();
        protected_class.method1();

    }
}
class protected_class {
    protected void method1() {
        System.out.println("Protected method");
    }
}
