package Practice.Week3;

public class PrimeNumber {
    public static void main(String[] args) {
        //isPrime(7);
        //isPrime(7);
        // primeNumber(7);
        checkPrime(9);
    }


    public static void checkPrime(int num1){
        if( num1 % 1 == 0 && num1 % num1 == 0){
            System.out.println("Is prime number: "+num1);
        }else{
            System.out.println("Is not a prime number: "+num1);

        }
    }

    public static void isPrime(int num){

        boolean isPrime = true;
        if(num < 2 ){
            isPrime = false;
        }

        for (int i = 2; i < num ; i++) {  // i = 2  3  4  5  6  7

            if (num % i == 0){      // 7/2-> 1   7/3-> 1   7/4-> 3  7/5->2  7/6->1
                isPrime = false;
                break;
            }
        }
        System.out.println((isPrime ) ? num + " is a Prime Number " : num + " is not a Prime Number" );
    }

    public static boolean primeNumber(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }
}
