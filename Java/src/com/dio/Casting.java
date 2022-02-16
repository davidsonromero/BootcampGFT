package com.dio;

public class Casting {
    public static void main(String[] args) {
        //Casting
        //Casting is the process of converting one type of data to another type of data.
        int myInt = 5;
        double myDouble = (double) myInt;
        String MyString = String.valueOf(myInt);
        int myInt2 = 1000;
        byte myByte = (byte) myInt2;
        System.out.println(myDouble);
        System.out.println(MyString);
        System.out.println(myByte);
    }
}
