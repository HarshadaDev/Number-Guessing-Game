import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("================================");
        System.out.println("     NUMBER GUESSING GAME");
        System.out.println("================================");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess the correct number?");

        do {
            System.out.print("\nEnter your guess: ");

            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid integer!");
                sc.next();
                System.out.print("Enter your guess: ");
            }

            guess = sc.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < number) {
                System.out.println("Too low! Try a higher number.");
            } else if (guess > number) {
                System.out.println("Too high! Try a lower number.");
            } else {
                System.out.println("\nCongratulations! You guessed the correct number!");
                System.out.println("Correct number: " + number);
                System.out.println("Total attempts: " + attempts);
            }

        } while (guess != number);

        System.out.println("================================");
        System.out.println("         GAME OVER!");
        System.out.println("================================");

        sc.close();
    }
}