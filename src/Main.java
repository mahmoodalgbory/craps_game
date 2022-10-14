import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        String playAgain = "";
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int diceSum = die1 + die2;
        boolean done = true;
        boolean valid = true;


        do {
        while (true) {
            System.out.println("you rolled " + diceSum + " for this turn");
            if (diceSum == 7 || diceSum == 11) {
                System.out.println("congratulations! you got a natural.");
                break;
            } else if (diceSum == 2 || diceSum == 3 || diceSum == 12) {
                System.out.println("Ah shucks! you crapped out.");
                break;
            } else {
                System.out.println(diceSum + " is the point now. Roll again. ");

            }


            while (true) {
                int die3 = rnd.nextInt(6) + 1;
                int die4 = rnd.nextInt(6) + 1;
                int diceSum2 = die3 + die4;

                System.out.println("you rolled " + diceSum2);

                if (diceSum2 == diceSum) {
                    System.out.println("congratulations you won!");
                    break;
                } else if (diceSum2 == 7) {
                    System.out.println("You lost!");
                    break;
                } else {
                    System.out.println("you got " + diceSum2 + " go again");

                }
            }
            break;
        }
        System.out.println("do you want to play again? [Y/N]");
        do {
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("Y")) {
                done = false;
                valid = true;
            } else if (playAgain.equalsIgnoreCase("N")) {
                done = true;
                valid = true;
                System.out.println("Thank you for playing craps today! have a nice one.");
            } else {
                System.out.println("enter one of these answers please: [Y/N]");
                valid = false;
            }
        }while (!valid);
        }while (!done);
    }
}
