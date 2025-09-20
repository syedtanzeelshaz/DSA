package app.data_structures;

import app.service.DataStructureInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * Learning module for ArrayList in Java Collections Framework.
 * Implements DataStructureInterface for standardized demos.
 * - Time Complexities:
 *   - add(end): Amortized O(1)
 *   - add(index): O(n)
 *   - get/set: O(1)
 *   - remove: O(n)
 *   - contains/indexOf: O(n)
 * - Space: O(n) + overhead.
 * - vs. Fixed Array: Resizable, more methods.
 * - vs. LinkedList: Faster access, slower inserts/deletes.
 * - Tips: Use List<T> for polymorphism. Avoid modification during for-each (use Iterator).
 * - Edge Cases: Empty list, bounds errors, nulls, large resizing.
 */
public class DS_ArrayList implements DataStructureInterface {

    @Override
    public void demoBasicOperations() {
        System.out.println("--- ArrayList: Basic Operations ---");

        List<Integer> list = new ArrayList<>();

        // Add elements
        list.add(1); // appends to end, [1]
        list.add(3); // [1, 3]
        list.add(1,4); // inserts 4 at inder 1 ==> [1, 4, 3]
        System.out.println("After adds: " + list);

        // access elements
        System.out.println("First element at index i=0 : " + list.get(0)); // index needs to be inbound i.e., valid index
        System.out.println("First element at index i=1 : " + list.get(1));
        System.out.println("First element at index i=2 : " + list.get(2));
        System.out.println("First element : " + list.getFirst()); // way to access first element
        System.out.println("Last element : " + list.getLast()); // way to access last element

        // Simple iteration and printing
        System.out.print("Elements (using simple loop): ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        } // [1, 4, 3]
        System.out.println();

        System.out.print("Elements (using enhanced loop): ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        } // [1, 4, 3]
        System.out.println();

        // Remove elements - 2 ways
        int removedByIndex = list.remove(2); // removes element at index 2 , here it is 3 , [1, 4]
        System.out.println("Removed by index (index=2, value=" + removedByIndex + ") [list.remove(index) returns element that is removed , index needs to be valid] , list = " + list);
        boolean removedByObject = list.remove(Integer.valueOf(4)); // Removes first 4
        System.out.println("Removed by object (obj=4, success=" + removedByObject + ") [list.remove(obj) returns boolean, true saying element was found and removed, else false], list = " + list); // [1]

        // Size and empty check
        System.out.println("Size: " + list.size());  // 1
        System.out.println("Is empty? " + list.isEmpty()); // false
        System.out.println();

        // clear list
        list.clear(); // []
    }

    @Override
    public void demoSearchOperations() {
        System.out.println("--- ArrayList: Search Operations ---");
    }

    @Override
    public void demoSortOperations() {
        System.out.println("--- ArrayList: Sort Operations ---");
    }

    @Override
    public void demoAdvanced() {
        System.out.println("--- ArrayList: Advanced Features ---");
    }

    // Independent main for testing this class alone
    public static void main(String[] args) {
        DataStructureInterface arrayList = new DS_ArrayList();

        arrayList.demoBasicOperations();
        arrayList.demoSearchOperations();
        arrayList.demoSortOperations();
        arrayList.demoAdvanced();
    }
}
