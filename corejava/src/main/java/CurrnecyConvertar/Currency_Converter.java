package CurrnecyConvertar;

import java.util.Scanner;

import static CurrnecyConvertar.Currency.Symbol;


public class Currency_Converter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you amount you want to convert in Rupees");
        double amount = sc.nextDouble();

        Dollar d = new Dollar();
        Rupee R = new Rupee();

        System.out.println("Amount In Dollar is   " + d.ConvertToUSD(amount) + "$");
        System.out.println("Amount In Indian  " + R.ConvertToUSD(amount) + Symbol);
    }
}

