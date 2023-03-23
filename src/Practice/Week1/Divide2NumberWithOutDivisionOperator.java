package Practice.Week1;

public class Divide2NumberWithOutDivisionOperator {

    public static void main(String[] args) {

        divide(2,3);
        divide(8,7);

    }

    public static void divide(int num1, int num2) { // dividend  and divider(denominator)
        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }

        System.out.print(num1 +" divided by "+num2 +" is: ");
        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);
    }
}
