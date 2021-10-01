package com.company.JAVA.Learning;

public class Java_Practice_Set_7 {
    static void multiplicationTable(int n){
        for (int i=1; i<=10; i++){
            System.out.format("%d X %d is = %d\n",n,i, n*i);
        }
    }

    static void pattern1(int n){
        for (int i=1; i<=n; i++){       //If i is 0
            for (int j=0;j<i; j++){    //Then j Must Be J<i+1
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }

    static void pattern2(int n){
        for (int i=0; i<n; i++){
            for (int j=i; j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int no1=0,no2=1,no3=0;
    static int fib(int n){
        if(n>0){
            no3=no1+no2;
            no1=no2;
            no2=no3;
            System.out.println(no3);
            fib(n-1);
        }
        return no3;
    }

    static int fib2(int n){  //This Code Is Written By Watching The Answer Video
//        if (n==1){
//             return 0;
//         }
//         else if (n==2){
//             return 1;
//         }

        if (n==1 || n==2){
            return n-1;
        }
        else {
            return fib2(n-1)+fib2(n-2);
        }
    }

    static int avg(int a, int b, int...c){
        int sum=a+b;
        for (int e:c){
            sum+=e;
        }
        int l=2+c.length;
        return sum/l;
    }

    static void rPattern1(int n){
        if (n>0){
            rPattern1(n-1);
            for (int i=0;i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rPattern2(int n){
        if (n>0){
            for (int i=0;i<n; i++){
                System.out.print("*");
            }
            System.out.println();
            rPattern2(n-1);
        }
    }

    static float temp(int n){
        return n*1.8000f + 32;
    }


    public static void main(String[] args) {
        //1. Write a JAVA Program to Print Multiplication Total of a Number of n
        multiplicationTable(5);

        //2. Write a Program Using function to Print The Following Pattern: STAR Low to High
        pattern1(5);

        //3. Write a Recursive Function  to Calculate Sum of First n Natural Number
        System.out.println(sumRec(5));

        //4. Write a Function To Print Following Pattern: STAR High to Low
        pattern2(5);

        //5. Write a Function to Print Nth Term of Fibonacci Series Using Recursion
        System.out.println("The Fibonacci of N-Amount of Numbers Is "+fib(5));
        System.out.println("The N-th Element Is "+fib2(5));

        //6. write a function To Find Average Of a Set of number Passed As Argument
        System.out.println(avg(1,2,3,4,5));

        //7. Repeat 4(Write a Function To Print Following STAR Pattern:  High to Low) Using Recursion
        System.out.println("High to Low");
        rPattern2(5);

        //8. Repeat 2(Write a function to Print Following STAR Pattern:  Low to High) Using Recursion
        System.out.println("Low to High");
        rPattern1(5);

        //9. Write a Program top Convert Celsius Temperature to Fahrenheit
        System.out.println(temp(351));

        //10. Repeat 3(Write a Recursive Function  to Calculate Sum of First n Natural Number) Suing iterative Approach
        int a = 7;
        int sum2=0;
        for (int i=1; i<=a; i++){
            System.out.println(i);
            sum2+=i;
        }
        System.out.println(sum2);
    }
}