package com.company;

import java.util.Random;
import java.util.Scanner;

public class EtapThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("---         Start game        ---");
        System.out.println("Predict amount of points (2..12): ");
        int userNum[] = new int [3] ;
        int comp [] = new int[3];
        int sum =0  , compSum = 0,points = 0 ,compPoints = 0  ;

        int userPoint = 0;
        int round=1 ;
        for (int i = 0; i < userNum.length; i++) {
            userNum[i] = sc.nextInt();
            System.out.println("Raund " + round++);
            if (userNum[i] > 1 && userNum[i] < 13) {
                System.out.println("Users rolls the dices...");
            }
            comp[i] = (int) (2 + (Math.random() * 12));
            int a = rollTheDice();
            int b = rollTheDice();
            printDice(a);
            printDice(b);

            System.out.println("Computer predicted " + comp[i] + " points.");
            System.out.println("Computer rolls the dices...");
            int a2 = rollTheDice();
            int b2 = rollTheDice();
            printDice(a2);
            printDice(b2);

            System.out.println("---------- Current score ----------");
            sum = a + b;
            System.out.println("User:" + sum + " points.");
             compSum = a2 + b2;
            System.out.println("Computer:" + compSum + " points.");
            if (sum > compSum) {
                points = sum - Math.abs(sum - userNum[i]) * 2;
                System.out.println("User is ahead by " + points + " points!");
            } else if (sum < compSum) {
                compPoints = compSum - Math.abs(compSum - comp[i]  ) * 2;

                System.out.println("Computer is ahead by " + compPoints + " points!");
            } else {
                System.out.println("Points exactly");
            }


            userPoint += points;


        }


        System.out.println("-------------------- Finish game -------------------");
          String table = String.join("\n",
                  "Round            |             User |          Computer \n " +
                  "-----------------+------------------+---------------------- ",
                  "                 | Predicted: "+ userNum[0]+"     |Predicted: "+ comp[0] ,
                  " - 1 -           | Dice: "+ sum +"          | Dice:    "+ compSum ,
                  "                 | Result: "+ points +"        |   Result: " +compPoints ,
                  "---------------- +------------------+----------------------" ,
                  "                 | Predicted: " + userNum[1]+"     | Predicted: "+ comp[1] ,
                  " - 2 -           | Dice: "+ sum + "          | Dice: " + compSum,
                  "                 | Result: "+ points+ "        | Result: " + compPoints,
                  "---------------- +------------------+----------------------" ,
                  "                 | Predicted: " + userNum[2]+"     | Predicted: "+ comp[2] ,
                  " - 2 -           | Dice: "+ sum + "          | Dice: " + compSum,
                  "                 | Result: "+ points+ "        | Result: " + compPoints,
                  "-----------------+------------------+---------------------- ",
                  " Total           | Points: "+ "         |Points: " );

        System.out.println(table);

    }

    public static int rollTheDice() {
        int randomNum = 0;
        for (int i = 1; i <= 2; i++) {
                randomNum = (int)(1+(Math.random()*6));
            }
            return randomNum;
        }

        public static void printDice(int n) {

            switch (n){
                case 1:
                    String one = String.join("\n",
                            "+-------+",
                            "|       |",
                            "|   #   |",
                            "|       |",
                            "+-------+"
                    );
                    System.out.println(one);
                    break;
                case 2:
                    String two = String.join(
                            "\n",
                            "+-------+",
                            "| #     |",
                            "|       |",
                            "|     # |",
                            "+-------+"
                    );
                    System.out.println(two);
                    break;
                case 3:
                    String three = String.join(
                            "\n",
                            "+-------+",
                            "|      #|",
                            "|   #   |",
                            "|#      |",
                            "+-------+"
                    );
                    System.out.println(three);
                    break;
                case 4:
                    String four = String.join(
                            "\n",
                            "+-------+",
                            "|#     #|",
                            "|       |",
                            "|#     #|", "+-------+"
                    );
                    System.out.println(four);
                    break;
                case 5:
                    String five = String.join(
                            "\n",
                            "+-------+",
                            "|#     #|",
                            "|   #   |",
                            "|#     #|",
                            "+-------+"
                    );
                    System.out.println(five);
                    break;
                case 6:
                    String six = String.join(
                            "\n",
                            "+-------+",
                            "| #   # |",
                            "| #   # |",
                            "| #   # |",
                            "+-------+"
                    );
                    System.out.println(six);
                    break;
        }
    }
}




