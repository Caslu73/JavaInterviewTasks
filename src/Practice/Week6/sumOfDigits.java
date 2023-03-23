package Practice.Week6;

public class sumOfDigits {
     /*
    return the sum of all integers found in the parameter String
     */


    public static int getSumOfNumbers(String str) {

        int sum = 0;

        String[] numbers = str.replaceAll("[\\D]+"," ").split(" ");

        for(String each : numbers){
            sum += Integer.parseInt(each);
        }

        return sum;
    }
}
