package HashMapAssignment.AddingIteratorForeachSort;

import java.util.*;

public class MethodForAddingIteForSort {
    private HashMap<Integer, String> empName = new HashMap<Integer, String>();

    public void InitializingArrayList() {

        //Arraylist initialization adding and removing
        empName.put(1,"navin");
        empName.put(3,"prajwol");
        empName.put(23,"kavita");
        empName.put(87,"sujan");
        empName.put(45,"bishal");
        empName.put(34,"keshab");
        empName.put(26,"thakur");
        empName.put(78,"raman");
        empName.put(98,"shishir");
        empName.put(56,"girish");
        empName.put(21,"notName");

        System.out.println("Arraylist of Employee Name are : " + empName);
        empName.remove(21);

        Map<Integer,String> sortedMap = new TreeMap<>(empName);
        sortedMap.entrySet().forEach(System.out::println);
        System.out.println("after sorting and removing a error: " + empName);




    }

    //assignment 2
    public void IteratorMethod() {
        //using iterator total concept from web
        // https://www.geeksforgeeks.org/arraylist-iterator-method-in-java-with-examples/
        for (Map.Entry<Integer, String> set :
                empName.entrySet()) {

            // Printing all elements of a Map
            System.out.println(set.getKey() + " = " + set.getValue());
        }
    }

    //assignment 3
    public void UsingForEachLoop() {
        for(Map.Entry<Integer, String> e : empName.entrySet()) {
            Integer key = e.getKey();
            String value = e.getValue();
            System.out.println(key + "  " + value);
        }

    }

}


