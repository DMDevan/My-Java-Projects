package Math;

import java.util.Scanner;

public class CelsiusConverter {
   public static void main(String[] args) {
      int Base = true;
      double Conversion = 1.8D;
      Scanner scan = new Scanner(System.in);
      System.out.print("Farhenheit: ");
      double farhenheitT = (double)scan.nextInt();
      double celsiusT = (farhenheitT - 32.0D) / 1.8D;
      scan.close();
      System.out.println("Celsius: " + celsiusT);
   }
}
