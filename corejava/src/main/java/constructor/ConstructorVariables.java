package Constructor;

public class ConstructorVariables {


    int a ;  //0
    boolean t;   //false
    long l;     //0
    String s;  //null

    public static void main(String[] args) {
        ConstructorVariables pp =  new ConstructorVariables();
        System.out.println(pp.a);  //10
        System.out.println(pp.t);  //false
        System.out.println(pp.l);
        System.out.println(pp.s);

    }
}
