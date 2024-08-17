package StaticVsInstanceBlock;

public class StaticBlock {

    static {
        System.out.println("Static block Code"); //Static block is automatically is executed when program runes.
        //we do not  need to call them
    }

    {
        System.out.println("Instance Block");
    }

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println("Main Method ");
    }

}
