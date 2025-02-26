package Constructor;

class A{
    A(int a){
        System.out.println("Class A Constructor"+a);
    }
}
class B extends A{
    B(){
        super(10);
        System.out.println("Class B Constructor");
    }
    B(int a){
        super(5);
        System.out.println("Class B's Parameterized Constructor"+a);
    }
}
public class ChainingTest extends B{
    ChainingTest(){
        System.out.println("Class ChainingTest Constructor");
    }
     public static void main(String[] args) {
        ChainingTest cc = new ChainingTest();
    }
}
