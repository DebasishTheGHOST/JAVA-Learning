package com.company.JAVA.Learning;
import java.util.Scanner;

public class Java_Practice_Set_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //What Will Be The Result of The Following Expression
        float a1 = 7/4f * 9/2f;
        System.out.println(a1);

        // Write a JAVA Program to Encrypt a Grade by Adding 8 to it, Decrypt It to Show The Correct Grade;
        char grade = 'B';
        char encryptGrade  = (char) (grade + 8);
        char decryptGrade = (char) (encryptGrade - 8);
        System.out.println(encryptGrade);
        System.out.println(decryptGrade);

        // Use Comparison Operator to Find Out Whether a Given Number is Greater Than the User Enter Number or Not
        System.out.println("Please ENTER a Number");
        int num = sc.nextInt();
        System.out.println(num>10);

        // Write The Following expression in a Java Program:
        int v = 20;
        int u = 10;
        int s = 8;
        int a = 5;
        float xy = (v*v - u*u)/(2f*a*s);
        System.out.println(xy);

        // Find The Value of The Following Expression:
        int x = 7;
        int a2 = x*49/7+35/7;
        System.out.println(a2);
    }
}
