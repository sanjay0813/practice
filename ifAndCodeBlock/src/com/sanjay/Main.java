package com.sanjay;

public class Main {

    public static void main(String[] args) {
		int score = 10000;
	    int levelCompleted = 8;
	    int bonus=200;
	    boolean gameOver = true;
	    if(gameOver){
	        int finalScore2 = score + (levelCompleted*bonus);
            System.out.println(finalScore2);
        }
    }
}
