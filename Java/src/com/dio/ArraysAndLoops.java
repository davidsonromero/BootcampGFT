package com.dio;

import java.util.Scanner;
import java.util.Random;

public class ArraysAndLoops {
    public static void main(String[] args) {
        //while loop executes the instructions while the condition is true
        int a = 0;
        while(a < 10){
            System.out.println("While");
            a++;
        }
        
        //do-while loop executes the instructions at least once, even when the condition is false
        do{
            System.out.println("Do-While");
        }while(5>10);

        //for loop executes the instructions for a given number of times
        for(int i = 0; i < 10; i++){
            System.out.println("For");
        }

        //for-each loop iterates over the elements of an array
        String[] names = {"John", "Jane", "Jack", "Jill", "Joe", "Jenny"};
        for(String name : names){
            System.out.println(name);
        }

        table(4);
        table(7);
        table(753);
        oddEven(4);
        oddEven(7);
        factorial(9);
        //average();
        consonant('a');
        consonant('b');
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(arr);
        Random random = new Random();
        System.out.println(random.nextInt(1000));
        showMatrix();
    }

    public static void table(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

    public static void oddEven(int n){
        if(n % 2 == 0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
    }

    public static void average(){
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 8 numbers: ");
        double sum = 0;
        double bigger = 0;
        for(int i = 0; i < 8; i++){
            System.out.println("Current sum: " + sum);
            System.out.println("Current bigger: " + bigger);
            double x = scanner.nextDouble();
            sum += x;
            if(sum > bigger){
                bigger = x;
            }
        }
        System.out.println("Average: " + sum/8);
        System.out.println("Bigger: " + bigger);
        System.out.println("Total: " + sum);
        scanner.close();
    }

    public static void factorial(double n){
        double fact = 1;
        for(double i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println(n + "! = " + fact);
    }

    public static void consonant(char a){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean isVowel = false;
        for(char vowel : vowels){
            if(a == vowel){
                isVowel = true;
            }
        }
        if(!isVowel){
            System.out.println(a + " is a consonant");
        } else {
            System.out.println(a + " is a vowel");
        }
    }

    public static void reverseArray(int[] arr){
        int count = arr.length - 1;
        for(int i = 0; i <= count; i++){
            System.out.println(arr[count - i]);
        }
    }

    public static void showMatrix(){
        Random random = new Random();
        int[][] matrix = new int[5][5];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(10);
            }
        }

        for (int[] line : matrix) {
            for (int element : line) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}