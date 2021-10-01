package com.company.JAVA.Learning;
import java.util.Locale;
import java.util.Scanner;

public class Java_Practice_Set_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // What Will Be The Output of This Program
        int x = sc.nextByte();
        if (x == 10)
            System.out.println("Im 10");
        else
            System.out.println("Im Not 10");

        /* Write a Program to Find Out a Student is Pass or fail, If It Requires Total 40% and at Least 33% in Each Subject
           to Pass. Assume 3 Subject and Take Marks As an Input From The User */
        System.out.println("Please ENTER Your First Marks Here");
        float a = sc.nextByte();
        System.out.println("Please ENTER Your Second Marks Here");
        float b = sc.nextByte();
        System.out.println("Please ENTER Your Third Marks Here");
        float c = sc.nextByte();
        float avg = (a+b+c)/3.5f;

        if (a>=33f && b>= 33f && c>=33f && avg>=40f) {
            System.out.println("You Pass The Test");
        }
        else {
            System.out.println("You Fail In The Test");
        }
        System.out.println("Your Average Is "+avg);


        // Calculate Income Tax Paid By an Employee to The Government as Per the Slots Mention Below
        System.out.println("Please ENTER Your Income");
        float income = sc.nextFloat();
        if (income>=250000 && income<=490000) {
            System.out.println("Your TAX Is " + (income / 100 * 5f));
        }
        else if (income>=500000 && income<=999999) {
            System.out.println("Your TAX Is " + (income / 100 * 20f));
        }
        else if (income>=1000000) {
            System.out.println("Your TAX Is " + (income / 100 * 30f));
        }
        else {
            System.out.println("Invalid Input");
        }

        // Write a Java Program to Find Out The Day Of The Week Given The Number [1 For Monday 2 for Tuesday .... And So on]
        System.out.println("Please Enter The Number Of the Day");
        int day;
        day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Its Monday");
            case 2 -> System.out.println("Its tuesday");
            case 3 -> System.out.println("Its Wednesday");
            case 4 -> System.out.println("Its thursday");
            case 5 -> System.out.println("Its Friday");
            case 6 -> System.out.println("Its Saturday");
            case 7 -> System.out.println("Its Sunday");
        }

        // Write a Java Program To Find Out a Year Entered By The User is Leap Year Or NOT
        System.out.println("Please Enter The Year");
        int year = sc.nextInt();
        if (year%400==0) {
            System.out.println("YES! This Is a Leap Year");
        }
        else if (year%4==0 && year%100!=0) {
            System.out.println("YES! This Is a Leap Year");
        }
        else {
            System.out.println("No! This Is Not a Leap Year");
        }

        // Write a Program to Find Out The type of Website From The Url Type
        String web = sc.nextLine();
        web = web.toLowerCase(Locale.ROOT);
        if (web.endsWith(".com")) {
            System.out.println("Its a \"Commercial Website\"");
        }
        else if (web.endsWith(".org")) {
            System.out.println("Its a \"Organisation Website\"");
        }
        else if (web.endsWith(".in")) {
            System.out.println("Its a \"India Website\"");
        }
        else {
            System.out.println("Invalid Input");
        }
        }
    }
