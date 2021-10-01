package com.company.JAVA.Learning;

public class Java_Practice_Set_5 {
    public static void main(String[] args) {

        // Write a Program To Print More to Less Pattern
        int n = 4;
        while (n>0){
            int i=n;
            while (i>0){
                System.out.print("*");
                i--;
            }
            System.out.print("\n");
            n--;
        }

        // Write a Program To Sum First n Even Numbers Using While Loop
        int sum = 0;
        int n1 = 5;
        n1=n1-1;
        int i = 0;
        while (i<=n1){
            sum = sum + 2*i;
            i++;
        }
        System.out.println(sum);

        // Write a Program To Print Multiplication OF Given Number n
        int n2 = 5;
        for (int i1 =1; i1<=10; i1++){
            int mpl=i1*n2;
            System.out.printf("%d X %d = %d\n", n2,i1,mpl);
        }

        //Write a Program To Print Multiplication Table of 10 In Reverse Order
        int n3 = 5;
        for (int i2 =10; i2>=1; i2--){
            int mpl=i2*n3;
            System.out.printf("%d X %d = %d\n", n3,i2,mpl);
        }

        // Write a Program To find Factorial of a Given Number Using For loop
        int f = 5;
        int fn = 1;
        for (int i3=f; i3>=1; i3--){
            fn *= i3;
        }
        System.out.println(fn);

        //Repeat 5 Using While Loop
        int f1 = 5;
        int fn1 = 1;
        while (f1>=1){
            fn1 *= f1;
            f1--;
        }
        System.out.println(fn1);

        // Repeat 1 Using For/While Loop
        int s = 4;
        for(int i4=s; i4>0; i4--){
            for (int j=i4; j>0; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }


        //Write a Program To Calculate The Sum of The Numbers According in The Multiplication Table of 8
        int mpt = 8;
        int no = 1;
        int sum2 = 0;
        while(no<=10){
            sum2 += mpt*no;
            no++;
        }
        System.out.println(sum2);

        // Repeat 2 Using For Loop
        int n5 = 5;
        int sum3 = 0;
        for (int i5=0; i5<=n5; i5++){
            System.out.println(i5*2);
            sum3 += i5*2;
        }
        System.out.println(sum3);

    }
}
