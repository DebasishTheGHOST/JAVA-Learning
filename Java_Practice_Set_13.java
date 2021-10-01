package com.company.JAVA.Learning;

class MyThread1 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Good Morning");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Java_Practice_Set_13 {
    public static void main(String[] args) {
        /*
        1. Write a Program To Print "Good Morning" and "Welcome" Continuously On The Screen In Java Using Threads
        2. Add a Sleep Method in Welcome Thread on Question 1 to Delay Its Execution for 200ms
        3. Demonstrate Get-Priority() and Set-Priority() Method In Java Threads
        4. How Do You Get State of a Given Thread in Java
        5. How Do You Get Reference To The Current Thread in Java
        */
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        //t1.start();
        //t2.start();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getPriority());

    }
}
