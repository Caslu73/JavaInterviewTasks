package Practice.Week4;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDup("AAABBBCCC");
    }

    public static void removeDup(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if(result.contains(""+str.charAt(i))){
                continue;
            }

            result += str.charAt(i);


        }
        System.out.println(result);
    }
}
