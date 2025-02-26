package practiceProgram;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "Geeks";
        String s2 = "Gkees";

        char[] name = s1.toLowerCase().toCharArray();
        char[] name1 = s2.toLowerCase().toCharArray();


        Arrays.sort(name1);
        Arrays.sort(name);

        if (Arrays.equals(name,name1)) {
            System.out.println("It is anagram");

        } else System.out.println("Not a anagram");
    }
}
