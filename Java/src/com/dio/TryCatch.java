package com.dio;

public class TryCatch{
    public static void main(String[] args){
        String number = "1234";
        String letters = "abcd";
        try {
            int intnumber = Integer.parseInt(number);
            int intletters = Integer.parseInt(letters);
            System.out.println("Number is " + intnumber);
            System.out.println("Letters is " + intletters);
        } catch(NumberFormatException e) {
            System.out.println("Exception caught");
            System.out.println(e);
            e.getCause();
            e.printStackTrace();
            System.exit(0);
        }
    }
}