package com.company.JAVA.Learning;
import java.util.Random;
import java.util.Scanner;

class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner sc = new Scanner(System.in);
        int b = randomNumber.nextInt(3);
        System.out.print("Please Select 0 for Rock; 1 for Paper; And 2 For Scissor:  ");
        int a = sc.nextByte();

        // THIS IS MADE AFTER WATCHING A SHORT FORM OF DOING THIS PROGRAM
        // BUT I WONT RECOMMEND THIS WAY BECAUSE ITS NOT GOOD FOR GUI BASED GAME
        if (a==0 && b==0 || a==1 && b==1 || a==2 && b==2){
            System.out.println("ITS a DREW");
        }
        else if (a==0 && b==2 || a==1 && b==0 || a==2 && b==1){
            System.out.println("YOU WIN");
        }
        else if (a>2){
            System.out.println("Its a Invalid Input");
        }
        else
            System.out.println("COMPUTER WINS");
        // THIS STATEMENT IS NOT NEEDED BECAUSE IF UPPER STATEMENT DID NOT MATCH THEN THE DEFAULT STATEMENT WOULD BE IT
        // SO NO NEED TO WRITE THE STATEMENT ITS A WASTE OF TIME
        /*else if (a==0 && b==1 || a==1 && b==2 || a==2 && b==0){
            System.out.println("Computer WON");
        }*/





        // THIS IS MY FIRST PROGRAM I MADE WITH MY OWN BEFORE I MADE THE SHORT ONE
        // ITS RECOMMENDED FOR A GUI BASED GAME, YOU CAN TELL WHO CHOOSE WHAT AND MANUALLY SET EVERYTHING
        switch (a) {
            case 0:
                if (b == 0) {
                    System.out.println("Its a DREW");
                }
                else if (b == 1) {
                    System.out.println("You Chose Rock and Computer Chooses Paper: COMPUTER WINS");
                }
                else {
                    System.out.println("You Chose Rock and Computer Chooses Scissor: You WIN");
                }
                break;
            case 1:
                if (b == 0) {
                    System.out.println("You Chose Paper and Computer Chooses Rock: You WIN");
                }
                else if (b == 1) {
                    System.out.println("ITS a DREW");
                }
                else {
                    System.out.println("You Chose Paper and Computer Chooses Scissor: COMPUTER WINS");
                }
                break;
            case 2:
                if (b == 0) {
                    System.out.println("You Chose Scissor and Computer Chooses Rock: COMPUTER WINS");
                }
                else if (b == 1) {
                    System.out.println("You Chose Scissor and Computer Chooses Paper: You WIN");
                }
                else {
                    System.out.println("ITS a DREW");
                }
                break;
            default:
                System.out.println("SORRY Invalid Input");
        }
    }
}