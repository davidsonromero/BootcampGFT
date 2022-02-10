package com.dio;

//@author Davi K. Romero

import com.dio.base.Order;

public class FirstProgram {
    //Retorna o código do pedido
    public static void main(String[] args) {
        Order order = new Order("code1234");
        System.out.println(order);
        feeCalc(123);
        feeCalc2(123);
        fibonacci();
        fibonacci2();
    }

    public static void feeCalc(int price){
        //Testing switch/case structure
        double fee;
        switch(price){
            case 100:
                fee = 0.99;
            case 200:
                fee = 1.99;
            default:
                fee = 0.49;
        }
        System.out.println("Fee: " + fee);
    }

    public static void feeCalc2(int price){
        //Testing if/else structure
        double fee;
        if(price == 100){
            fee = 0.99;
        }else if(price == 200){
            fee = 1.99;
        }else{
            fee = 0.49;
        }
        System.out.println("Fee: " + fee);
    }

    public static void fibonacci(){
        //Testing for loop
        int n = 10;
        int a = 0;
        int b = 1;
        int c;
        for(int i = 0; i < n; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }

    public static void fibonacci2(){
        //Testing while loop
        int n = 10;
        int a = 0;
        int b = 1;
        int c;
        int i = 0;
        while(i < n){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            i++;
        }
    }
}