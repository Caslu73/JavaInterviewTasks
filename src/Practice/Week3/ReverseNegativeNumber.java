package Practice.Week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        reverseNegativeNumbers(-21);
    }

    public static void reverseNegativeNumbers(int num){

        String numStr = (num + "").replace("-","");
        String result = "";

        if(num < 0){

            for (int i = numStr.length()-1; i >= 0 ; i--) {

                result += numStr.charAt(i) ;
            }

            System.out.println(result);

        }else{
            System.out.println("Is not a negative number = " + num);
        }



    }
}
/*
2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */
