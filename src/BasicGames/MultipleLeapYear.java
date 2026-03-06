package BasicGames;

import java.util.Scanner;

public class MultipleLeapYear {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        String yes = "yes";

        while (yes.equalsIgnoreCase("yes")) {

            System.out.print("Enter a year greater than or equal to 1582: ");
            int year = scan.nextInt();

            if (year < 1582) {
                throw new Exception("Invalid Year!!!");
            }

            boolean isLeap =
                    (year % 4 == 0 && year % 100 != 0) ||
                    (year % 400 == 0);

            if (isLeap) {
                System.out.println("\nThe year you entered is a leap year.");
            } else {
                System.out.println("\nThe year you entered is not a leap year.");
            }

            System.out.print("\nWould you like to test another year? (Type \"Yes\" or \"No\") ");
            yes = scan.next();
            System.out.println();
        }

        scan.close();
    }
}
