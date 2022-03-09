package com.collections;

import java.util.*;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public class List {
    public static void main(String[] args) {
        //Only ordered
        //Can be heterogeneous or homogeneous
        //Accepts duplicates
        //Can be accessed by index

        ArrayList things = new ArrayList();
        things.add(1);
        things.add(true);
        things.add("Hello");
        things.add('a');
        things.add(1.3);

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("John"));
        users.add(new User("Jane"));
        users.add(new User("Jack"));
        users.add(new User("Jill"));

        for(User u : users) {
            System.out.println(u.name);
        }

        System.out.println("Third user: " + users.get(2));
    }

    //----------Other methods----------
    //add(index, element) - adds the specified element at the specified position
    //addAll(index, collection) - adds all of the elements in the specified collection
    //clear() - removes all elements
    //contains(element) - returns true if this list contains the specified element
    //containsAll(collection) - returns true if this list contains all of the elements in the specified collection
    //equals(object) - returns true if this list equals the specified object
    //indexOf(element) - returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
    //isEmpty() - returns true if this list contains no elements

}

class User {
    String name;

    public User(String name) {
        this.name = name;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [name=" + name + "]";
    }
}