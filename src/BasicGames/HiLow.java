package BasicGames;

import java.util.Random;
import java.util.Scanner;

public class HiLow {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Would you like to play a guessing game with me? (Type Y or N) ");
        String play = scan.next();

        while (play.equalsIgnoreCase("y")) {

            Random gen = new Random();
            int answer = gen.nextInt(100) + 1;
            int guessAmt = 1;

            System.out.print("\nI am thinking of a number between 1 and 100. Guess what it is: ");
            int guess = scan.nextInt();

            String keepGuessing = "y";

            while (keepGuessing.equalsIgnoreCase("y") && guess != answer) {

                if (guess > answer) {
                    System.out.print("\nThat is higher than my number. ");
                } else {
                    System.out.print("\nThat is lower than my number. ");
                }

                System.out.print("Would you like to guess again? (Type Y or N) ");
                keepGuessing = scan.next();

                if (keepGuessing.equalsIgnoreCase("y")) {
                    System.out.print("\nGuess Again: ");
                    guess = scan.nextInt();
                    guessAmt++;
                }
            }

            if (guess == answer) {
                System.out.println("\nYou have guessed correctly! The number was " + answer +
                                   ". \nIt took you " + guessAmt + " guesses.");
            } else {
                System.out.println("\nMy number was " + answer + ". Better luck next time." +
                                   "\n\nYou gave up after " + guessAmt + " guesses.");
            }

            System.out.print("\nWould you like to play again? (Type Y or N) ");
            play = scan.next();
        }

        scan.close();
    }
}
