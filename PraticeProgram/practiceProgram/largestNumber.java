package practiceProgram;

public class largestNumber {
    static int arr[] = {10, 324, 45, 90, 9808};

    static int Largest() {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(Largest());
    }
}
