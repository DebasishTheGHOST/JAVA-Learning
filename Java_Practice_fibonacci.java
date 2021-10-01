package com.company.JAVA.Learning;

public class Java_Practice_fibonacci {
    static int n1=0,n2=1,n3=0;
    static int fibo(int count){
        if (count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
            fibo(count-1);
        }
        return n3;
    }
    public static void main(String[] args) {
        fibo(5);
    }
}
