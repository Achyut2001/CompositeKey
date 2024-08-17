package Statcickeyword;

public class LocalVariable {
    int a;
    public void Method99(){
        a=10;
        System.out.println("local variable"+ a);
    }
    public static void main(String[] args) {
        LocalVariable obj=new LocalVariable();
        obj.Method99();




    }
}
