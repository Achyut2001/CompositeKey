abstract class  mainStart{
   abstract void Method_abstract();
}
class child extends mainStart{
    public void Method_abstract(){
        System.out.println(" Hello from abstract Method ");
    }

    public static void main(String[] args) {
        child c=new child();
        c.Method_abstract();
    }
}


