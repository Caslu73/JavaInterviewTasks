package Practice.Week1;

import java.util.Arrays;

public class FINRA {
    public static void main(String[] args) {

        FINRA2();

    }

    public static void FINRA30(){

        for (int i = 1; i < 31; i++){

            if(i % 3 == 0 && i % 5 == 0 ){//if number is multiply of 3 and 5 print FINRA
                System.out.print(" FINRA ");

            } else if (i % 5 == 0) {//if number is multiply of 5 print RA
                System.out.print(" RA ");

            }else if (i % 3 == 0){//if number is multiply of 3 print FIN
                System.out.print(" FIN ");

            }else{
                System.out.print(i + " ");
            }
        }
    }

    public static void FINRA() {
        String result = "";
        for(int i=1; i <= 30; i++) {
            result += (i % 5 ==0 && i %3 ==0)? "FINRA " : (i%5 == 0) ? "RA "
                    :(i%3 == 0) ? "FIN " : i+" ";
        }
        System.out.println(result);
    }




    public static void FINRA1() {

        String result = "";

        for (int i = 1; i <= 30; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "RA ";
            } else if (i % 3 == 0) {
                result += "FIN ";
            } else {
                result += i + " ";
            }
        }

        System.out.println(result);

    }

    public static void FINRA2() {
        String[] myarr= new String[30];

        for( int i=0; i <= 29; i++ )
            myarr[i] = ""+(i+1);

        for(int j=0; j<myarr.length; j++)
            if(Integer.valueOf(myarr[j])%3==0 && new Integer(myarr[j])%5==0)
                myarr[j]="FINRA";
            else if (Integer.valueOf(myarr[j])%3==0)
                myarr[j]="FIN";
            else if (Integer.valueOf(myarr[j])%5==0)
                myarr[j]="RA";

        System.out.println(Arrays.toString(myarr));
    }
}
