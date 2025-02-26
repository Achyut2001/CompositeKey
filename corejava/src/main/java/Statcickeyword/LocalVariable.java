package Statcickeyword;

public class LocalVariable {
    final static void method1(){
        System.out.println("Hii");
    }
    int a;
    public void Method99(){
        a=10;
        System.out.println("local variable"+ a);
    }
  final public static void main(String[] args) {
        LocalVariable obj=new LocalVariable();
        obj.Method99();
        method1();
    }
}
