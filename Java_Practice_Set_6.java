package com.company.JAVA.Learning;

public class Java_Practice_Set_6 {
    public static void main(String[] args) {


        float  [] marks = {12.3f, 17.7f, 33.82f, 47.4f, 28.1f};
        float sum = 0;

        // This Is The Enhanced Program Of The For Loop
        for (float elements:marks){
            sum += elements;
        }
        System.out.println("The SUM Of The Elements Of The Array Is: "+sum);

        // Write a Program to Find Out Whether a Given Integer is present in an Array or Npt
        float num = 12.3f;
        boolean InTheArray=false;
        for (float element:marks){
            if(num==element){
                InTheArray =true;
                break;
            }
        }
        if (InTheArray){
            System.out.println("NO: The Value Is In The Array");
        }
        else{
            System.out.println("YES: The Value Is Not In The Array");
        }

        // Calculate The Average Marks From an Array Containing marks of All Student in Physics Using For Each loop
        int aE = marks.length;
        float avg = sum/aE;
        System.out.println("The Average of The Array Is: "+avg);

        // Create a Java Program to Add two Matrices of Size 2x3
        int [][] marks1 = {{3,5,6},{7,9,2}};
        int [][] marks2 = {{6,7,2},{3,7,6}};
        int [][] result = {{0,0,0},{0,0,0}};
        for (int i=0;i<marks1.length; i++){
            for (int j=0;j<marks1[i].length;j++){
                result[i][j] = marks1[i][j]+marks2[i][j];
            }
        }
        for (int i=0;i<marks1.length; i++){
            for (int j=0;j<marks1[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");
        }

        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println(" ");
        }

        // Write a Java Program to Reverse an Array
        int [] a = {14,25,13,64,57,46};
        int l = a.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for (int i=0; i<n; i++){
            temp=a[i];
            a[i]=a[l-1-i];
            a[l-1-i]=temp;
        }
        for (int element: a){
            System.out.print(element+" ");
            System.out.println(" ");
        }

        // Write a Java Program to Find the Maximum element in an Array
        int [] x = {14,25,13,64,57,46};
        int max = 0;
        for (int e : x){
            if (e>max){
                max = e;
            }
        }
        System.out.println("The Maximum Value Of This Array Is: "+max);

        // Write a Java Program to Find the Minimum element in an Array
        int min = Integer.MAX_VALUE;//THIS IS MUST To Run The Program
        for (int e : x){
            if (e<min){ //MAX Is The HIGHEST Value From Upper Program, If max is Zero This Program Will Not Run, You Need Bigger Value To Run This Program
                min = e;
            }
        }
        System.out.println("The Maximum Value Of This Array Is: "+min);

        // Write a Java Program to Find Whether an Array is Sorted Or Not
        boolean isShorted = true;
        for (int i=0; i<x.length-1;i++){
            if (x[i] > x[i+1]){
                isShorted = false;
                break;
            }
        }
        if(isShorted){
            System.out.println("YES It Shorted");
        }
        else {
            System.out.println("NO Its Not Shorted");
        }

        //Sort an Array Using for loop
        int [] z = {14,25,13,64,57,46};
        for (int i=0; i<z.length;i++){
            for(int j=i+1; j<z.length;j++){
                if (z[i]>z[j]){
                    int temp2;
                    temp2 = z[i];
                    z[i]=z[j];
                    z[j]=temp2;
                }
            }
        }
        System.out.print("The Sorted Form Of The Array Is: ");
        for(int e:z){
            System.out.print(e+" ");
        }
    }
}
