package BasicGames;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        int wins = 0;
        int losses = 0;
        int ties = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Would you like to play rock, paper, scissors with me? (Type Y or N) ");
        String yes = scan.next();

        while (yes.equalsIgnoreCase("y")) {

            Random gen = new Random();
            int comp = gen.nextInt(3) + 1;

            String comptr = "";
            String userC = "";

            System.out.println("\nType 1 for Rock, 2 for Paper, and 3 for Scissors.");
            System.out.print("\nI have made my choice, what is yours? ");
            int user = scan.nextInt();

            // Computer choice
            if (comp == 1) comptr = "Rock";
            else if (comp == 2) comptr = "Paper";
            else comptr = "Scissors";

            // User choice
            if (user == 1) userC = "Rock";
            else if (user == 2) userC = "Paper";
            else if (user == 3) userC = "Scissors";

            // Game logic
            if (userC.equalsIgnoreCase(comptr)) {
                System.out.println("\nWe both chose " + userC + ", so we tied.");
                ties++;
            } 
            else if (userC.equals("Rock") && comptr.equals("Paper")) {
                System.out.println("\nI had " + comptr + ", and that beats your " + userC + ". I win!");
                losses++;
            } 
            else if (userC.equals("Rock") && comptr.equals("Scissors")) {
                System.out.println("\nYou had " + userC + ", and that beats my " + comptr + ". You win.");
                wins++;
            } 
            else if (userC.equals("Paper") && comptr.equals("Rock")) {
                System.out.println("\nYou had " + userC + ", and that beats my " + comptr + ". You win.");
                wins++;
            } 
            else if (userC.equals("Paper") && comptr.equals("Scissors")) {
                System.out.println("\nI had " + comptr + ", and that beats your " + userC + ". I win!");
                losses++;
            } 
            else if (userC.equals("Scissors") && comptr.equals("Paper")) {
                System.out.println("\nYou had " + userC + ", and that beats my " + comptr + ". You win.");
                wins++;
            } 
            else if (userC.equals("Scissors") && comptr.equals("Rock")) {
                System.out.println("\nI had " + comptr + ", and that beats your " + userC + ". I win!");
                losses++;
            }

            System.out.print("\nWould you like to play again? (Type Y or N) ");
            yes = scan.next();

            if (yes.equalsIgnoreCase("n")) {
                System.out.println("\nYour Total Wins: " + wins);
                System.out.println("Your Total Losses: " + losses);
                System.out.println("Total Ties: " + ties);
            }
        }

        scan.close();
    }
}
