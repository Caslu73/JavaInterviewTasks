package Practice.Week2;

public class SwapNumbers {
    public static void main(String[] args) {

        swapping(4,6);

    }

    public static void swapping(int x, int y){

        x = x + y;
        //4+6= 10,  new value of X is 10


        y = x -y;
        //10-6= 4 Result new value of Y now is 4


        x = x - y;
        //10-4= Result new value of X now is 6

        //Result new value of X now is 6
        //Result new value of Y now is 4


        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }


}
