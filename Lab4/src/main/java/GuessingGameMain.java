import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGameMain {
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess the number between 1 and 100. You have 10 guesses.");

        try {
            while (!game.isGameOver()) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                game.makeGuess(guess);
            }
            game.printCorrectNumber();

        } catch(InputMismatchException e) {
            System.out.println("An error has occurred." + e.getMessage());
            e.printStackTrace();

        }
//        finally {
//            scanner.close();

//        }
    }
}
