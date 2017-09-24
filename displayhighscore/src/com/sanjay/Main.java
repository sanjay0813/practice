package com.sanjay;

public class Main {

    public static void main(String[] args) {
        //int position = 1;
        //int score =1000;
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("tim", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("kim", position);

        position = calculateHighScorePosition(300);
        displayHighScorePosition("him", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("khim", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("gym", position);

        position = calculateHighScorePosition(-15);
        displayHighScorePosition("mew", position);
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position:: " + position + " on the high school position");
    }
    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        } else if (1000 > score && score >=500){
            return 2;
        } else if(100 <= score && score < 500){
            return 3;
        } else {
            return 4;
        }
    }
}
