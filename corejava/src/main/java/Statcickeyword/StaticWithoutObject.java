package Statcickeyword;

public class StaticWithoutObject {
    static void staticMethod(){
        StaticWithoutObject ytt = new StaticWithoutObject();
        ytt.instanceMethods();
        //instanceMethods();
        System.out.println("We don't need to create an Object of this class, " +       "to call static method");
    }
    void instanceMethods(){
        staticMethod();
        System.out.println("We need an object of a class, " +         "to call instance method");
    }
    public static void main(String[] args) {
        StaticWithoutObject.staticMethod();
        //StaticWithoutObject.instanceMethods();
        StaticWithoutObject obj = new StaticWithoutObject();
        obj.instanceMethods();
    }

}


class StaticMethodAccess{
    public static void main(String[] args) {
        StaticWithoutObject.staticMethod();
        StaticWithoutObject obb = new StaticWithoutObject();
        obb.instanceMethods();

    }
}