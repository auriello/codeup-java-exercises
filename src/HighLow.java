import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int number = (int) (Math.random() * 100) + 1;

        int guess;
        do {
            // Prompt the user to guess the number
            System.out.print("Guess a number between 1 and 100: ");
            guess = input.nextInt();

            // Validate the user's input
            while (guess < 1 || guess > 100) {
                System.out.print("Invalid input. Guess a number between 1 and 100: ");
                guess = input.nextInt();
            }

            // Check if the user's guess is higher or lower than the number
            if (guess < number) {
                System.out.println("HIGHER");
            } else if (guess > number) {
                System.out.println("LOWER");
            }

        } while (guess != number);

        // The user guessed the number
        System.out.println("GOOD GUESS!");
    }
}

