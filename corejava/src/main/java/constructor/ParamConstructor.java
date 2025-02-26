package Constructor;

public class ParamConstructor {
    int a;
    String s;
    boolean t;
    ParamConstructor(){
    }
    ParamConstructor(int age, String name, boolean test){
        this.a = age;
        this.s =  name;
        this.t = test;
    }
    public static void main(String[] args) {
        ParamConstructor obj3 =  new ParamConstructor(10, "Constructor", false);
        System.out.println("Value of a is using obj3 "+obj3.a);//10  0
        System.out.println("Value of s is using obj3 "+obj3.s);//Constructor
        System.out.println("Value of t is using obj3 "+obj3.t);//false


        ParamConstructor obj1 =  new ParamConstructor();
        System.out.println("Value of a is using obj1 "+obj1.a);//0
        System.out.println("Value of s is using obj1 "+obj1.s);//null
        System.out.println("Value of t is using obj1 "+obj1.t);//false

        ParamConstructor obj2 =  new ParamConstructor(100, "Java", true);
        System.out.println("Value of a is using obj2 "+obj2.a);//100  0
        System.out.println("Value of s is using obj2 "+obj2.s);//Java
        System.out.println("Value of t is using obj2 "+obj2.t);//true

    }
}
