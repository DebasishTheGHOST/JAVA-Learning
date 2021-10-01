package com.company.JAVA.Learning;
import java.util.Scanner;

public class Java_Practice_Set_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a Java Program To Convert a Sting To
        String str = "Im Ghost, And I Love To Play Games";
        String Lc = str.toLowerCase();
        System.out.println(Lc);

        // Write a Java Program to Replace Spaces With Underscores
        String RepSpc = str.replace(" ","_");
        System.out.println(RepSpc);

        // Write a Java Program to fill a Letter Template Which Looks Like Below
        String Letter = "Dear <|name|>, Thanks a Lot";
        System.out.println("Please Enter Your Name");
        String Name = sc.nextLine();
        Letter = Letter.replace("<|name|>",Name);
        System.out.println(Letter);

        // Write a Java Program to Detect Double and Triple Spaces in a String
        String str2 = "Im Ghost, And I Love To  Play   Games";
        System.out.println(str2.indexOf("  "));
        System.out.println(str2.indexOf("   "));

        // Write a Program to Format The Following Letter Using Escape Sequence Character
        String letter = "Dear Harry,\n \t\tThis Java Course is Nice \n\t\t\t\t\t\t\t\tThanks";
        System.out.println(letter);
    }
}
