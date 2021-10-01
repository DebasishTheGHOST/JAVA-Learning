package com.company.JAVA.Learning;
import java.util.Scanner;

public class Exercise_1_CBSC_Board_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please ENTER Your First Marks Here");
        float a = sc.nextByte();
        System.out.println("Please ENTER Your Second Marks Here");
        float b = sc.nextByte();
        System.out.println("Please ENTER Your Third Marks Here");
        float c = sc.nextByte();
        System.out.println("Please ENTER Your Forth Marks Here");
        float d = sc.nextByte();
        System.out.println("Please ENTER Your Fifth Marks Here");
        float e = sc.nextByte();
        System.out.println("Please ENTER Your Sixth Marks Here");
        float f = sc.nextByte();

        float p = (a+b+c+d+e+f)/600 * 100f;

        System.out.println("Your CBSC Percentage is:-  " + p);
    }
}
