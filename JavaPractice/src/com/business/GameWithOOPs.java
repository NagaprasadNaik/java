package com.business;

import java.util.Random;
import java.util.Scanner;

class Game {
    private int randomNum;
    private int guessNum;
    private int numOfGuess;
    private boolean is ;

    Random r = new Random();
    Scanner s = new Scanner(System.in);

    public Game(){
        randomNum = r.nextInt(10);
    }

    public int getRandomNum(){
        return this.randomNum;
    }

    public void setNumOfGuess(){
        numOfGuess += 1;
    }

    public int getNumOfGuess(){
        return this.numOfGuess;
    }

    public boolean getIs(){
        return is;
    }

    public void setGuessNum(){
        System.out.println("Guess the number!!");
        guessNum = s.nextInt();
    }

    public int getGuessNum(){
        return this.guessNum;
    }

    public void isCorrectNum(){
        if (this.getRandomNum() == this.getGuessNum()){
            System.out.println("You have won!!");
            this.is = true;
        } else if (this.getGuessNum() < this.getRandomNum()){
            System.out.println("Enter higher value!!");
            setNumOfGuess();
        } else if (this.getGuessNum() > this.getRandomNum()) {
            System.out.println("Enter lower value!!");
            setNumOfGuess();
        }
    }

}
public class GameWithOOPs {

    public static void main(String[] args) {
        Game obj = new Game();
        while(obj.getIs() != true){
            obj.setGuessNum();
            obj.isCorrectNum();
        }
        if(obj.getIs() == true){
            System.out.println("you have guessed in "+obj.getNumOfGuess()+" attempts!!");
        }
    }
}
