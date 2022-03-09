package com.dio.base;

public class Operators {
    public static void main(String[] args) {
        //Relational operators
        // == equal to
        // != not equal to
        //------Only for numeric types-------
        // > greater than
        // < less than
        // >= greater than or equal to
        // <= less than or equal to

        //Logical operators
        // && and
        // || or
        // ! not
        // ^ xor

        var a = 7;
        var b = 5;
        var c = 9;
        var d = 1;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.err.println(a >= b && b >= c);
        System.err.println(a <= b || b <= c);
        System.err.println(!(a == b));
        System.err.println(a != b ^ b < c);

        if(a < 99){
            System.out.println("a is less than 99");
        } else if (a == 99){
            System.out.println("a is equal to 99");
        } else {
            System.out.println("a is greater than 99");
        }

        switch(d){
            case 1:
                System.out.println("d is equal to 1");
                break;
            case 2:
                System.out.println("d is equal to 2");
                break;
            case 3:
                System.out.println("d is equal to 3");
                break;
            case 4:
                System.out.println("d is equal to 4");
                break;
            default:
                System.out.println("d is not equal to 1, 2, 3 or 4");
        }

        int x = (a > 0) ? 1 : 0;
        System.out.println(x);
    }
}