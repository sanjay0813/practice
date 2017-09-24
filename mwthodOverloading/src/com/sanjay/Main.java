package com.sanjay;

public class Main {

    public static void main(String[] args) {
        int returnedScore = calculateScore("tim", 500);
        System.out.println(returnedScore);
        calculateScore(75);
        //calculateScore(100, 100, 23);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored " + score);
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("unnamed player scored " + score);
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("no player scored " );
        return 0;
    }

}
