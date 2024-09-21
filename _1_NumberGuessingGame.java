package Tasks;

import java.util.Random;
import java.util.Scanner;

public class _1_NumberGuessingGame {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        /* Initialize the scanner for user input */
        Scanner scanner = new Scanner(System.in);

        // Variables to track the number of attempts
        int attempts = 0;
        int maxAttempts = 5;  // Predefined limit for attempts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + maxAttempts + " attempts to guess the number between 1 and 100.");

        // Loop to allow multiple attempts
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            // Compare the user's guess with the generated number
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            }

            // If the maximum number of attempts is reached
            if (attempts == maxAttempts) {
                System.out.println("Sorry! You've used all your attempts. The correct number was: " + randomNumber);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
