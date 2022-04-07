package com.company;

import java.util.Scanner;

public class EtapTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---         Start game        ---");
        System.out.println("Predict amount of points (2..12): ");
        int userNum = scanner.nextInt();
        if (userNum > 1 && userNum < 13)
            System.out.println("Users rolls the dices...");
        int a = rollTheDice();
        int b = rollTheDice();
        printDice(a);
        printDice(b);
        int sum = a + b;
        System.out.println("On the dice fell :" + sum + " points.");
        int finalNum = sum - Math.abs(sum - userNum) * 2;
        System.out.println("Result is :" + finalNum + " points.\n");

        int computer = (int) (2 + (Math.random() * 12));
        System.out.println("Computer predicted " + computer + " points.");
        System.out.println("Computer rolls the dices...");
        int a2 = rollTheDice();
        int b2 = rollTheDice();
        printDice(a2);
        printDice(b2);
        int compSum = a2 + b2;
        System.out.println("On the dice fell :" + compSum + " points.");
        int compFinalNum = compSum - Math.abs(compSum - computer) * 2;
        System.out.println("Result is :" + compFinalNum + " points.");
        if (finalNum > compFinalNum) {
            System.out.println("Users win " + finalNum + " points more.\nCongratulations!");
        } else if (finalNum == compFinalNum) {
            System.out.println("Points exactly");
        } else {
            System.out.println("Computer win " + compFinalNum + " points more.\nGood luck next time :) ");
        }

    }

    public static int rollTheDice() {
        int randomNum = 0;
        for (int i = 1; i <= 2; i++) {
            randomNum = (int) (1 + (Math.random() * 6));
        }
        return randomNum;
    }

    public static void printDice(int n) {

        switch (n) {
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