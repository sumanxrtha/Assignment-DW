package HashSetAssignment.AddingIteratorForeachSort;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AddingMethod {
    HashSet<Integer> list = new HashSet<Integer>();
    HashSet<Integer> union = new HashSet<Integer>();
    HashSet<Integer> intersection = new HashSet<Integer>();
    HashSet<Integer> anotherList = new HashSet<Integer>();

    public void Addition() {

        list.add(1);
        list.add(3);
        list.add(145);
        list.add(451);
        list.add(41);
        list.add(15);
        list.add(56);
        list.add(23);
        System.out.println(list);


        anotherList.add(23);
        anotherList.add(45);
        anotherList.add(68);
        anotherList.add(34);
        anotherList.add(15);
        anotherList.add(78);
        anotherList.add(54);
        anotherList.add(76);
        System.out.println(anotherList);
        System.out.println();

        union = (HashSet) list.clone();
        union.addAll(anotherList);
        System.out.print("Union between two set is ");
        System.out.println(union);
        System.out.println();

        intersection = (HashSet) list.clone();
        list.removeAll(anotherList);
        intersection.removeAll(list);
        System.out.print("Intersection between two set is ");
        System.out.println(intersection);
        System.out.println();

        list.addAll(intersection);
        System.out.println("1st set is "+list);
        System.out.println("2nd set is "+anotherList);
        System.out.println();


    }

    public void IteratorMethod() {  //only done for list
        System.out.println("Iteration is done below");
        Iterator iterator = list.iterator();

        // check values
        while (iterator.hasNext()) {
            System.out.println("Value: " + iterator.next() + " ");
        }
        System.out.println();
    }
    //only done for list
    public void ForEachMethod(){
        System.out.println("Below is done by foreach");
        for (int i : list) {
            System.out.println(i);
        }
        System.out.println();
    }
    //only done for list
    public void SortMethod(){
        System.out.println("Sorting");
        // Sorting HashSet using TreeSet
        TreeSet<Integer> treeSet = new TreeSet<Integer>(list);

        // Print the sorted elements of the HashSet
        System.out.println("HashSet elements in sorted order using TreeSet: " + treeSet);
        System.out.println();
    }
}
