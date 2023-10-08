package com.codingwithjohn;

import java.util.*;

//Source https://www.youtube.com/watch?v=QvHBHuuddYk
public class SetAndHashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");
        names.add("Walter"); // do not allow duplicates - just add one record (good when we want to remove duplicates)

        names.remove("Jesse");

        System.out.println(names);//Don't guarantee the order
        System.out.println(names.size());
        System.out.println(names.contains("Mike"));
        //names.clear();
        //System.out.println(names.size());

        //names.stream().forEach(System.out::println);
        //names.forEach(System.out::println);

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>(numberList);
        //numberSet.addAll(numberList);
        System.out.println(numberSet);

        /*
        * HashTable guarantee constant amount of time to :
        * add
        * remove
        * lookups
        * */

        /* ###############  TreeSet ############### */
        // TreeSet ensures the order but the HashSet is so much faster
        Set<String> namesOrdered = new TreeSet<>();
        namesOrdered.add("Walter");
        namesOrdered.add("Jesse");
        namesOrdered.add("Skyler");
        namesOrdered.add("Mike");
        namesOrdered.add("Saul");
        namesOrdered.add("Walter");
        System.out.println(namesOrdered);


        /* ###############  LinkedHashSet ############### */
        // LinkedHashSet ensures the insert order but the HashSet is more faster
        Set<String> namesOrderedByInsert = new LinkedHashSet<>();
        namesOrderedByInsert.add("Walter");
        namesOrderedByInsert.add("Jesse");
        namesOrderedByInsert.add("Skyler");
        namesOrderedByInsert.add("Mike");
        namesOrderedByInsert.add("Saul");
        namesOrderedByInsert.add("Walter");
        System.out.println(namesOrderedByInsert);
    }
}
