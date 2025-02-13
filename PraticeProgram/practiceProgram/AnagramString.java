package practiceProgram;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "Geeks";
        String s2 = "Geeks";

        char[] name = s1.toCharArray();
        char[] name1 = s2.toCharArray();


        Arrays.sort(name1);
        Arrays.sort(name);

        if (name1.equals(name)) {
            System.out.println("It is anagram");


        } else System.out.println("Not a anagram");

//        boolean result=name1.equals(name);
//        System.out.println(result);

    }
}
