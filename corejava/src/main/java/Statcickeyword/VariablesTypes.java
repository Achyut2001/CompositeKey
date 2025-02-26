package Statcickeyword;


public class VariablesTypes {
    String instanceVariable;  //instance variable
    static String staticVariable = "Static";  //static variable
    String tt;  //instance

    VariablesTypes(){
    }
    VariablesTypes(String aa, String bb){
        this.instanceVariable = aa;
        this.tt = bb;
    }
    void test(){
        VariablesTypes abc = new VariablesTypes();
        String localVariable = "Java";  //local variable
        System.out.println("instance variable will get default value "+tt);   // null
        System.out.println("Local variables must be assigned value before we use them "+localVariable);// Java
    }

    void display(){
        VariablesTypes abc = new VariablesTypes();
        System.out.println("instance variable will get default value "+abc.tt);   // null
        //System.out.println("Local variables must be assigned value before we use them "+abc.localVariable);// Java
    }


    public static void main(String[] args) {
        //VaribleType.String ii = "Teat";  // Object is also called as instance of a class
        VariablesTypes obj1 = new VariablesTypes();
        obj1.instanceVariable = "Test";
        obj1.tt = "JavaProgram";
        System.out.println("Value with obj1 "+obj1.instanceVariable);

        VariablesTypes obj2 = new VariablesTypes();
        obj2.instanceVariable = "Java";
        System.out.println("Value with obj2 "+obj2.instanceVariable);  //
        //obj1.test();
        VariablesTypes obj3 = new VariablesTypes("AAAAAA", "BBB");
        //obj2.instanceVariable = "Test";
        // obj2.tt = "JavaProgram";
        System.out.println("Value with obj1 "+obj3.instanceVariable);  //AAAAAA
        System.out.println("Value with obj1 "+obj3.tt);    //BBB

    }

}
