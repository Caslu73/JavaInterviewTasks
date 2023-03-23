package Practice.Week10;

import java.util.*;

public class MapsValue {
    /*
    Map - Sort the map by values
    Write a method that can sort the Map by values
     */
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();// keep random order, but faster

        map.put("A", 8);
        map.put("B", 1);
        map.put("C", 5);
        map.put("D", 4);
        map.put("E", 3);
        map.put("F",10);
        map.put("G", 6);

        orderMapByItsIntValues(map);

        HashMap<String, String> names = new HashMap<>();

        names.put("Esra", "Eskin");
        names.put("Fatma", "Ozkan");
        names.put("Ali", "Kis");
        names.put("Tulay", "Durmaz");
        names.put("Lucas", "Caceres");



        orderMapByItsStringValues(names);




    }

    public static void orderMapByItsIntValues(Map<String,Integer> map){
        ArrayList <Integer> listOfTheValues = new ArrayList<>();

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>(); // keep the insertion order

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            listOfTheValues.add(entry.getValue());
        }

        Collections.sort(listOfTheValues);// SORTING THE LIST OF VALUES

        for (int num : listOfTheValues) {  //listOfTheValues = 1, 3, 4, 5, 6, 8, 10

            for (Map.Entry<String, Integer> entry : map.entrySet()) {

                if (entry.getValue().equals(num)) { //Default order map's values=   8, 1, 5, 4, 3, 10,6

                    sortedMap.put(entry.getKey(), num);//Default order map's Keys=  A, B, C, D, E, F, G

                }
            }
        }

        System.out.println(sortedMap);
    }

    public static void orderMapByItsStringValues(Map<String,String> map){
        ArrayList <String> listOfTheValues = new ArrayList<>();

        LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>(); // keep the insertion order

        for (Map.Entry<String, String> entry : map.entrySet()) {
            listOfTheValues.add(entry.getValue());
        }

        Collections.sort(listOfTheValues);// SORTING THE LIST OF VALUES

        for (String values : listOfTheValues) {  //listOfTheValues = 1, 3, 4, 5, 6, 8, 10

            for (Map.Entry<String, String> entry : map.entrySet()) {

                if (entry.getValue().equals(values)) { //Default order map's values=   8, 1, 5, 4, 3, 10,6

                    sortedMap.put(entry.getKey(), values);//Default order map's Keys=  A, B, C, D, E, F, G

                }
            }
        }

        System.out.println(sortedMap);
    }

}
