package com.dio;

//Importing the date and time classes
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTypesAndVariables {
    public static void main(String[] args) {
        //Configuring the date format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 

        //Proper variable names are camelCase
        //Variable names should be descriptive
        int myInt = 5;
        //int my_int = 5; - not recommended

        //Proper final variable names are all caps
        final int NEW_INT = 5;
        //final int newInt = 5; - not recommended

        //Primitive Data Types
        int i = 10;// int
        long j = 100;// long
        float k = 1.5f;// float
        double l = 1.5;// double
        char m = 'a';// char
        char n = '\u0041';// char
        boolean o = true;// boolean
        
        //Compound Data Types
        String s = "Hello"; // String
        LocalDateTime currentDateTime = LocalDateTime.now(); // LocalDate

        System.out.println(myInt);
        System.out.println(NEW_INT);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(s);
        System.out.println(dtf.format(currentDateTime));

        /*
        ------------Operators------------
        + plus
        - minus
        * times
        / divide
        % modulus (rest of the division)
        ++ increment (+1)
        -- decrement (-1)
        = assignment
        += plus and assignment
        -= minus and assignment
        *= times and assignment
        /= divide and assignment
        %= modulus and assignment
        == equality
        != not equal
        > greater than
        < less than
        >= greater than or equal to
        <= less than or equal to
        */
    }
}