package Practice.Week10;

import java.util.ArrayList;

public class DescendingOrder_arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        descendingOrderArrayList(arrayList);


    }

    public static void descendingOrderArrayList(ArrayList<Integer> arrayList){

        for (int i = 0; i < arrayList.size(); i++) {

            for (int j = arrayList.size()-1; j > i; j--) {

                if(arrayList.get(i) < arrayList.get(j)){

                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(i));
                    arrayList.set(i,temp);

                }
            }
        }
        for (int eachNumber : arrayList) {
            System.out.print(eachNumber+" ");
        }
    }
}
/*
ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method.
 */