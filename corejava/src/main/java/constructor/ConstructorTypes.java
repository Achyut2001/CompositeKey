package constructor;

class ConstructorTest{
    //default constructor is present in this class
    public static void main(String[] args) {
        ConstructorTest t = new ConstructorTest();
    }
}

public class ConstructorTypes {
    ConstructorTypes(){
        System.out.println("This is no-arg or non param constructor");
    }
    ConstructorTypes(int a){
        System.out.println("This is arg or  param constructor");
    }

    ConstructorTypes(int a, String ss){
        System.out.println("This is arg or  param constructor");
    }

    public static void main(String[] args) {
        ConstructorTypes obj = new ConstructorTypes();
        ConstructorTypes obj11 = new ConstructorTypes(100);
        ConstructorTypes obj22 = new ConstructorTypes(100, "Java");
    }

}
