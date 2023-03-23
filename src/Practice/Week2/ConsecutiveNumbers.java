package Practice.Week2;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
       /* int num = 30;
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                String result = "";
                if (i % 2 == 0) {
                    result += "Codility";
                }
                if (i % 3 == 0) {
                    result += "Test";
                }
                if (i % 5 == 0) {
                    result += "Coders";
                }
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                    System.out.print(i);
                }
                System.out.println(result);
            }
        } else {
            throw new RuntimeException("Invalid number");
        }
        */

        consecutiveNumbers(16);
    }


    public static void consecutiveNumbers(int num){
        if(num > 0){

            for (int i = 1; i <= num; i++) {

                String result = "";

                if(i % 2 == 0){
                    result += "Codility";
                }

                if(i % 3 == 0){
                    result += "Test";
                }

                if(i % 5 == 0){
                    result += "Coders";
                }
                if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
                    System.out.print(i);

                }
                System.out.println(result);

            }

        }else{
            throw new RuntimeException("Invalid number");
        }

    }
}
