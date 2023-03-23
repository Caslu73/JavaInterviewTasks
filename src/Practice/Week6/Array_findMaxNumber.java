package Practice.Week6;

public class Array_findMaxNumber {
    /*
        Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {

        int [] array = { 1,6,3,32,12 };
        System.out.println(maxValue(array));

    }


    public static int maxValue(int[] arrayNumbers) {

        int max = Integer.MIN_VALUE;

        for (int each : arrayNumbers) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }
}
