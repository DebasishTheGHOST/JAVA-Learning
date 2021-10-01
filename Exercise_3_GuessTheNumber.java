package com.company.JAVA.Learning;
import java.util.Scanner;
import java.util.Random;



class Game{
    public int randomNumber;
    public int userInput;
    public int numberOfGuess = 0;

    Game(){
        Random no = new Random();
        randomNumber = no.nextInt(10);
    }
    public void TakeUserInput(){
        System.out.println("Please Guess The Number");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
    }

    boolean isCorrectNumber(){
        numberOfGuess++;
        if (userInput==randomNumber){
            System.out.println("Congrats! You Guess The Right Number In "+numberOfGuess+" Chances");
            return true;
        }
        else if (userInput>randomNumber){
            System.out.println("The Number You Entered Is Greater, Pleas Choose a Smaller Number");
        }
        else{
            System.out.println("The Number You Entered Is Smaller, Pleas Choose a Greater Number");
        }
        return false;
    }

}




public class Exercise_3_GuessTheNumber {
    public static void main(String[] args) {
        Game guessTheNumber = new Game();
        boolean b = false;
        while (!b){
            guessTheNumber.TakeUserInput();
            b = guessTheNumber.isCorrectNumber();
            //System.out.println(guessTheNumber.getNumberOfGuess());
        }


    }
}
