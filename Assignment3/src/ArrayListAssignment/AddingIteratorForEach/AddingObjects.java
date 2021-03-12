package ArrayListAssignment.AddingIteratorForEach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class AddingObjects {
    private ArrayList<String> empName = new ArrayList<String>();

    public void InitializingArrayList() {

        //Arraylist initialization adding and removing
        empName.add("navin");
        empName.add("prajwol");
        empName.add("kavita");
        empName.add("sujan");
        empName.add("bishal");
        empName.add("keshab");
        empName.add("thakur");
        empName.add("raman");
        empName.add("shishir");
        empName.add("girish");
        empName.add("notName");

        System.out.println("Arraylist of Employee Name are : " + empName);
        empName.remove(10);

        Collections.sort(empName);
        System.out.println("after sorting and removing a error: " + empName);




    }

    //assignment 2
    public void IteratorMethod() {
        //using iterator total concept from web
        // https://www.geeksforgeeks.org/arraylist-iterator-method-in-java-with-examples/
        Iterator<String> varIterator = empName.iterator();
        System.out.println("\nThe iterator values"
                + " of list are: ");
        while (varIterator.hasNext()) {
            System.out.print(varIterator.next() + " ");
        }
    }

    //assignment 3
    public void UsingForEachLoop() {
        empName.forEach((n) -> System.out.println(n));

    }

}


