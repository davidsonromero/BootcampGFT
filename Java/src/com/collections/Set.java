package com.collections;
//Collections convert all primitive types to object types (wrapper classes)
import java.util.*;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public class Set {
    public static void main(String[] args) {
        //Can be ordered or unordered
        //Can be heterogeneous or homogeneous
        //Do not accept duplicates
        //Kind of a messed up bag
        
        HashSet set = new HashSet();
        set.add(1);
        set.add(true);
        set.add("Hello");
        set.add('a');
        set.add(1.3);

        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());

        set.remove("Hello");

        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());

        set.add(true);

        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());

        if(set.contains(false)) {
            System.out.println("False is in the set");
        } else {
            System.out.println("False is not in the set");
        }

        if(set.contains(1.3)) {
            System.out.println("1.3 is in the set");
        } else {
            System.out.println("1.3 is not in the set");
        }

        HashSet nums = new HashSet();
        nums.add(19);

        System.out.println("Nums: " + nums);
        
        System.out.println("nums + set: " + nums.addAll(set));

        //----------Other methods----------
        //clear() - removes all elements
        //clone() - creates a shallow copy of the set
        //retainAll() - removes all elements not in the specified collection
        //removeAll() - removes all elements in the specified collection
        //toArray() - returns an array containing all of the elements in this set

        //It is possible to specify a type for the elements in the set
        HashSet<Integer> intSet = new HashSet<Integer>(); 
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        //intSet.add("dojfhwefdsipfpi"); -> cannot add a string to an integer set
    }
}
