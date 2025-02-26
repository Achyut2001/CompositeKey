package practiceProgram;

public class star_pattern {
    public static void main(String[] args) throws InterruptedException {

        for (int i=0;i<3;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}