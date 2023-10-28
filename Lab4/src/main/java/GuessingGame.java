import java.util.Random;

public class GuessingGame {
    private int secretNumber;
    private int remainingGuesses;
    private boolean isGameOver;
    private boolean isGameWon;

    public GuessingGame() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
        remainingGuesses = 10;
        isGameOver = false;
        isGameWon = false;
    }

    public int getRemainingGuesses() {
        return remainingGuesses;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public boolean isGameWon() {
        return isGameWon;
    }

    public void makeGuess(int guess) {
        if (!isGameOver) {
            remainingGuesses--;

            if (guess == secretNumber) {
                isGameOver = true;
                isGameWon = true;
                System.out.println("Correct guess! You won.");
            } else if (guess < secretNumber) {
                System.out.println("Too low. Guesses remaining: " + remainingGuesses);
            } else {
                System.out.println("Too high. Guesses remaining: " + remainingGuesses);
            }

            if (remainingGuesses == 0) {
                isGameOver = true;
                System.out.println("No more guesses. The correct number was: " + secretNumber);
            }
        } else {
            System.out.println("The game is already over.");
        }
    }

    public void printCorrectNumber() {
        if (isGameOver && isGameWon) {
            System.out.println("The correct number was: " + secretNumber);
        } else {
            System.out.println("The game is not over or you haven't won yet.");
        }
    }
}
