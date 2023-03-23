package Practice.Week1;

public class EvenAndOdds {
    public static String identify(int number){
        if( number %2 == 0){
            return "Even";
        }else {
            return "Odd";
        }


    }

    public static void main(String[] args) {
        System.out.println(identify(10));

    }
}
