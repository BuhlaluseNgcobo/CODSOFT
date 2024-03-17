/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberguessinggame;

/**
 *
 * @author gugu
 */
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalPlays = 0;
        int totalRoundsWon = 0;

        while (playAgain) {
            System.out.println("Welcome to the Number Guessing Game!");
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            while (!guessedCorrectly) {
                System.out.print("Guess the number (1-100): ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    totalRoundsWon++;
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            totalPlays += attempts;
            System.out.printf("Number of attempts: %d%n", attempts);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = sc.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }

        System.out.println("Game over!");
        System.out.printf("Total rounds won: ", totalRoundsWon);
        System.out.printf("Average number of attempts per round: ", (double) totalPlays / totalRoundsWon);

        
    }
}
