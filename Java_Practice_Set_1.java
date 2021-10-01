package com.company.JAVA.Learning;
import java.util.Scanner;

public class Java_Practice_Set_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = 10;
        byte b = 20;
        byte c = 30;

        // Write a Program To SUM 3 Numbers
        int sum = a + b + c;
        System.out.println(sum);

        // Write a program to Calculate CGPA Using Marks of Three Subject (Out Of 100)
        float CGPA = (a+b+c)/3f;
        System.out.println(CGPA);

        //Write a JAVA program Which Ask The User To Enter His/Her Name And Greet Them With "Hello <Name>, Have a Good day
        System.out.println("Please ENTER Your Name");
        String name = sc.nextLine();
        System.out.println("Hello "+name+", Have a Good Day");

        //Write a Program To Convert Kilometers To Miles
        float km = sc.nextFloat();
        float m = km / 1.60934f;
        System.out.println(m);

        //Write a Java Program To Detect Whether a Number entered By The User Is Integer or Not
        System.out.println(sc.hasNextInt());
    }
}
