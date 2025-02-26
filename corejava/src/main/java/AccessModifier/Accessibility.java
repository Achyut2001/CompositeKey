
package AccessModifier;

public class Accessibility {
    public static void main(String[] args) {

        Class1 class1 = new Class1();
        class1.method();
        class1.method1();
        //  class1.method2;
        //class1u.method3;
        class1.a = 5;
        class1.b = 10;
        class1.c = 15; //  System.out.println(class1.a);
        System.out.println(class1.b);
        System.out.println(class1.c);
    }

    public static class Class1 {
        private int a;
        int b;
        protected int c;

        public void method() {
            a = 10;
            b = 10;
            c = 10;
        }
        private void method1() {
            int a = 10;
            String b = "VariableType.String";

        }
        protected void method2() {
            int b = 12;
            System.out.println("protected Method");
        }
        public void method3() {
            int cc = 12;
            System.out.println("public method");
        }

    }

}
