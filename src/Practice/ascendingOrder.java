package Practice;

import java.util.ArrayList;

public class ascendingOrder {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(1);
        nums.add(5);
        nums.add(3);
        nums.add(7);
        nums.add(6);

        ascendingOrder(nums);

    }


    public static void ascendingOrder(ArrayList<Integer> arrayList) {

        for(int i = 0; arrayList.size() > i ;i++ ){

            for(int j = arrayList.size()-1; j > i; j--){

                if(arrayList.get(i) > arrayList.get(j)){

                    int temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }

            }

        }

        for (int eachNumber : arrayList) {
            System.out.print(eachNumber+ " ");
        }


    }
}


