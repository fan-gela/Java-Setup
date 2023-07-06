import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public void guessingGame() {
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("What is your name?");

        Scanner input = new Scanner(System.in);
        String playerName = input.next();

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.println("Guess what number I am thinking of between 1 and 100?");
        input = new Scanner(System.in);
        int numberOfGuesses = 0;

        while (true) {
            try {
                int playerNumberGuess = Integer.parseInt(input.next());

                numberOfGuesses++;
                if (playerNumberGuess < 0 || playerNumberGuess > 100) {
                    System.out.println("Invalid number, try again.");
                } else if (playerNumberGuess < randomNumber) {
                    System.out.println("Your guess is too low, try again.");
                } else if (playerNumberGuess > randomNumber) {
                    System.out.println("Your guess is too high, try again.");
                }  else {
                    System.out.println("Congratulations " + playerName + " , you figured out my number in " + numberOfGuesses + " tries!");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("This is not a valid number, try again.");
            }

        }

    }

}
