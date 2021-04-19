package lesson1;

import java.util.Scanner;

public class DistanceConverter {
  public static void main( String[] args )
  {
    // create a scanner variable
    Scanner scanner = new Scanner(System.in);

    // start a loop
    while (true) {
      // Print the instructions
        System.out.println("Select a conversion:\n1. Feet to Inches\n2. Feet to Yards\n" 
        + "3. Feet to Miles\n4. Meters to Miles\n0. Quit Program");

        // Declare the user selection. Default to 0
        int selection = 0;
        
        // Try to get the user input as an int
        try {
          selection = scanner.nextInt();
        } catch (Exception e) {
          // If the user messes this up, tell them they messed up
          System.out.println("Invalid input. Try again. [Options 0-4]");

          // Get rid of the user's bad input
          scanner.next();

          // Start the loop over again
          continue;
        }
        
        // If the user selects 0, quit
        if ( selection == 0) {
            System.out.println( "Loser");
            // Get out of the loops
            break;
        }

        // Ask teh suer the number they want to convert
        System.out.println("Enter value to convert");

        // Declare the number to conver.
        float num = 0f;

        // Try to get the user's number to convert
        try {
          num = scanner.nextFloat();
        } catch (Exception e) {
          // If the mess it up, tell them
          System.out.println("Invalid input. Try again. [Must be a number]");

          // Get rid of the user's bad input
          scanner.next();

          // Back to the top of the loops
          continue;
        }

      // put conditional statements in    
        if ( selection == 1){
            num = num * 12f;
            System.out.println(num + " inches");
        } else if ( selection == 2){
            num = num / 3f;
            System.out.println(num + " yards");
        } else if ( selection == 3){
            num = num / 5280f;
            System.out.println(num + " miles");
        } else if ( selection == 4){
            num = num / 1609.34f;
            System.out.println(num + " miles");
        } 
    }

    scanner.close();
  }

}
