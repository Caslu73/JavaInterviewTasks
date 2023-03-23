package Practice.Week2;

public class NumbersDivisible {

    public static void main(String[] args) {

        DisplayDivisibleNumbers(15);

    }

    public static void DisplayDivisibleNumbers(int num){

        if (num % 3 == 0 && num % 5 == 0 & num % 15 == 0) {

            System.out.print("Divisible by 15: ");

            for (int i = 1; i < 100; i++) {


                if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {

                    System.out.print(i + " ");
                }
            }
        }

        else if (num % 3 == 0 && num % 15 != 0) {

            System.out.print("Divisible by 3: ");
            for (int i = 1; i < 100; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }

        } else if (num % 5 == 0 && num % 15 != 0) {

            System.out.print("Divisible by 5: ");
            for (int i = 1; i < 101; i++) {
                if (i % 5 == 0) {

                    System.out.print(i + " ");
                }
            }
        }
    }
}
