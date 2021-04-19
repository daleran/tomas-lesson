package lesson1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class DirectionFinder 
{

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        // Get user name
        getUserName(input);

        // Start a loop
        pickDirection(input);


        input.close();
    }

    public static void getUserName (Scanner input) {
        // Get the user's name
        System.out.println("What is your Name");

        // Store the user's name
        String name = input.nextLine();

        // Count the number of vowels
        int numberOfVowels = vowels(name);

        // Print out the number of vowels
        System.out.println(numberOfVowels);
    }

    public static int vowels(String str) {
		int howmanyvowels = 0;
		
		for(int v = 0; v < str.length() ; v++) {
			char name = str.charAt(v);
			if(name == 'A' || name == 'a' || name == 'E'|| name == 'e' || name == 'I'
					|| name == 'i' || name == 'o' || name == 'O' || name == 'U' || name == 'u') {
			howmanyvowels++;
			}
			
		}
		return howmanyvowels;
	}

    public static void pickDirection (Scanner input) {
        while (true) {
            String directionInput = "";
        
            System.out.println(" what direction would you like to move:Acceptable input: [1 - Move right, 2 - Move Left, 3 - "
            + "Move Up, 4 - Move Down, q - exit program]");

            // Ask the user for input
            directionInput = input.nextLine();

             // If the input is q, break the loop, close the scanner
            if (directionInput.equals("q")) {
                System.out.println("Quitting Now.");
                break;
            } else if (directionInput.equals("1")) {
                System.out.println("Move Right");
            } else if (directionInput.equals("2")) {
                System.out.println("Move Left");
            } else if (directionInput.equals("3")) {
                System.out.println("Move Up");
            } else if (directionInput.equals("4")) {
                System.out.println("Move Down");
            } else {
                System.out.println("\"Try again. Acceptable input: [1 - Move right, 2 - Move Left, 3 - \"\r\n"
                + "	*				+ \"Move Up, 4 - Move Down, q - exit program]\"");
            }
        }
    }
}
