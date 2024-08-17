package Statcickeyword;

public class StaticTest {
    String name = "AA";
    static String address = "Pune";

    public static  void main(String[] args) {
        StaticTest obj1 = new StaticTest();
        obj1.name = "PP";
        obj1.address = "PCMC";

        StaticTest obj2 = new StaticTest();
        obj2.name = "QQ";
        obj2.address = "Mumbai";

        StaticTest obj3 = new StaticTest();
        obj3.name = "ZZ";
        obj3.address = "Delhi";

        System.out.println("Obj1 values for instance " + obj1.name + " & static " + obj1.address);  //PP Delhi/Mumbai/Pune/PCMC
        System.out.println("Obj1 values for instance " + obj2.name + " & static " + obj2.address);  //QQ Delhi/Mumbai/Pune
        System.out.println("Obj1 values for instance " + obj3.name + " & static " + obj3.address);  //ZZ Delhi/Mumbai/Pune

    }


}
