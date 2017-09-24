package com.sanjay;

/**
 * Created by kafle on 9/16/2017.
 */
public class SelfPractice {

         public static void main(String[ ] args){
             /*
             *String[]
              */
            String[ ][ ] animals = {
                    { "DanaDog", "WallyDog", "JessieDog", "AlexisDog", "LuckyDog" },
                    { "BibsCat", "DoodleCat", "MillieCat", "SimonCat" },
                    { "ElyFish", "CloieFish", "GoldieFish", "OscarFish", "ZippyFish","TedFish"},
                    { "RascalMule", "GeorgeMule", "GracieMule", "MontyMule","BuckMule", "RosieMule" }
            };

            for (int i = 0; i < animals.length; i++)
            {
                System.out.print(animals[ i ] [ 0 ] + ": ");
                for (int j = 1; j < animals[ i ].length; j++)
                {
                    System.out.print(animals[ i ][ j ] + " ");
                }
                System.out.println( );
            }
             //System.out.println("Student " + (row + 1) + ": " + grades[row][3]);
        }

}
