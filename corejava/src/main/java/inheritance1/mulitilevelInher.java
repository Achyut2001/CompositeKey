package inheritance1;


class GrandParent{  //parent
    void GrandParent() {
        System.out.println("Calling from GrandParent");
    }
}
class Parent1 extends GrandParent{  //child
    void Parent(){
        System.out.println("Calling from Parent");
    }
}
 class Child  extends Parent1{  //child
    void Child(){
        System.out.println("Calling from Child");
    }
 }


public class mulitilevelInher {
    public static void main(String []args){
        Child child=new Child();
        child.GrandParent();
        child.Parent();
        child.Child();

    }
}
