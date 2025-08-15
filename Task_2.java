import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        boolean playAgain = true;

        System.out.println("🎯 Welcome to the Guess the Number Game!");

        while (playAgain) {
            int numberToGuess = rand.nextInt(100) + 1; // 1–100
            int maxAttempts = 7;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nI'm thinking of a number between 1 and 100...");
            System.out.println("You have " + maxAttempts + " attempts!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess;

                if (!sc.hasNextInt()) {
                    System.out.println("❌ Please enter a valid number!");
                    sc.next();
                    continue;
                }

                userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("✅ Correct! You guessed it in " + attempts + " attempts.");
                    totalScore += (maxAttempts - attempts + 1) * 10; // More points for fewer attempts
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("📉 Too low! Try again.");
                } else {
                    System.out.println("📈 Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("💡 Out of attempts! The number was: " + numberToGuess);
            }

            System.out.println("Your current score: " + totalScore);

            System.out.print("\nDo you want to play another round? (y/n): ");
            char choice = sc.next().toLowerCase().charAt(0);
            if (choice != 'y') {
                playAgain = false;
            }
        }

        System.out.println("\n🏆 Final Score: " + totalScore);
        System.out.println("Thanks for playing!");
        sc.close();
    }
}