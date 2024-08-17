package StaticVsInstanceBlock;

public class InstanceBlock {
    {
        System.out.println("Instance Block Code");//Instance block is automatically called when obj pf class is created.
    }
    public static void main(String[] args) {
        InstanceBlock i=new InstanceBlock();

    }
}
