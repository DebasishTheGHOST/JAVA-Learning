package com.company.JAVA.Learning;

import java.util.Scanner;

public class Java_Practice_Set_14 {
    public static void main(String[] args) {
        /*
        1. Write a Java Program to Demonstrate Syntax, Logical & Runtime Error
        2. Write a Java Program That Print "HaHa" During Arithmetic Exception and "HeHe" During an Illegal Argument Exception
        3. Write a Program That Allow You To Keep Accessing an Array Until a Valid Index is Given If Max Returns Exceed
           5 Print "Error"
        4. Modify Q3 to Throws a Custom Exception if Max Retries Are Reached
        5. Wrap The Program in Q3 Inside a method Which Throws Your Custom Exception
        */

        // Syntax Error ->
        // a = 25;
        // int b = 10

        // logical Error ->
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }

        // Runtime Error ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Number You Want To Divided With");
        int c = 10;
        int d = sc.nextInt();
        System.out.println(c/d);

    }
}
