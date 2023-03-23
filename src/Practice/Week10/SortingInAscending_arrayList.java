package Practice.Week10;

import java.util.ArrayList;

public class SortingInAscending_arrayList {
    public static void main(String[] args) {

        ArrayList <Integer> arraylist = new ArrayList<>();

        arraylist.add(1);
        arraylist.add(5);
        arraylist.add(4);
        arraylist.add(2);
        arraylist.add(3);

        ascendingOrderArrayList(arraylist);




    }

    public static void ascendingOrderArrayList(ArrayList <Integer> arraylist){

        for (int i = 0; i < arraylist.size(); i++) {

            for (int j = arraylist.size()-1; j > i; j--) {

                if (arraylist.get(i) > arraylist.get(j)) {

                    int temp = arraylist.get(i);
                    arraylist.set(i,arraylist.get(j)) ;
                    arraylist.set(j,temp);

                }

            }

        }

        for (int eachNumber : arraylist) {
            System.out.print(eachNumber+" ");
        }
    }

    /*
    ArrayList - sorting in ascending
    Write a method that can sort the ArrayList in Ascending order without using the sort method.
     */
}
