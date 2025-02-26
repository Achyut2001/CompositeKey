package StaticVsInstanceBlock;

public class InstanceBlock {
        {
            System.out.println("Instance B lock Code");//Instance block is automatically called when obj of parent class is created.
        } 
    public static void main(String[] args) {
        InstanceBlock i = new InstanceBlock();
    }
}
