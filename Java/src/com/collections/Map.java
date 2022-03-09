package com.collections;

import java.util.*;

public class Map {
    public static void main(String[] args) {
        //Cannot have duplicate keys
        //Has a key-value pair
        HashMap<Integer, String> users = new HashMap<Integer, String>();
        users.put(1, "John");
        users.put(2, "Jane");
        users.put(3, "Jack");
        users.put(4, "Jill");

        System.out.println("Amount of users: " + users.size());
        System.out.println("Keys of Users: " + users.keySet());

        //----------Other methods----------
        //clear() - removes all elements
        //values() - returns a collection view of the values contained in this map
        //containsValue(value) - returns true if this map maps one or more keys to the specified value
        //containsKey(key) - returns true if this map maps the specified key to a value
        //get(key) - returns the value to which the specified key is mapped, or null if this map contains no mapping for the key
        //remove(key) - removes the mapping for a key from this map if it is present (optional operation)
        //putAll(map) - adds all of the mappings in the specified map to this map
    }
}
