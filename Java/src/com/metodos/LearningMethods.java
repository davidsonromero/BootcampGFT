package com.metodos;

import java.time.LocalDateTime;    

public class LearningMethods {
    private String name;
    private int age;
    private double grade;
    private String course;

    public LearningMethods(String name, double grade, int age, String course){
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.course = course;
    }

    public static void main(String[] args) {
        presentate("José Menezes", 50, 8.5, "Java");
        System.out.println("Current period of the day: " + dayPeriod());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public static double sum(double a, double b){
        return a + b;
    }

    public static double sub(double a, double b){
        return a - b;
    }

    public static double mult(double a, double b){
        return a * b;
    }

    public static double div(double a, double b){
        return a / b;
    }

    public static String dayPeriod(){
        LocalDateTime time = LocalDateTime.now();
        int hour = time.getHour();
        if(hour >= 5 && hour < 12){
            return "morning";
        }else if(hour >= 12 && hour < 18){
            return "afternoon";
        }else{
            return "night";
        }
    }

    public static void presentate(String name, int age, double grade, String course){
        System.out.println(String.format("The student %s is %d years old and has a %.2f grade in %s", name, age, grade, course));
    }
}