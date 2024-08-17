package practiceProgram;
import java.util.Scanner;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Decimal Number");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Binary: 0");
            return;
        }

        String binary = "";
        int t = num;

        while (t > 0) {
            int r = t % 2;
            binary = r + binary;
            t = t / 2;

        }
        System.out.println(binary);

//      System.out.println("Binary: " + Integer.toBinaryString(num));//By suing Inbuilt Method

    }
}
