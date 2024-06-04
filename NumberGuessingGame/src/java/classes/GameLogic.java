package classes;

public class GameLogic {

    private int randomNumber;
    private String message;

    public GameLogic() {
        resetGame();
    }

    public void resetGame() {
        randomNumber = (int) (Math.random() * 100) + 1;
        message = "";
    }

    public void checkGuess(int guess) {
        if (guess < randomNumber) {
            message = "Too low! Try again.";
        } else if (guess > randomNumber) {
            message = "Too high! Try again.";
        } else {
            message = "Congratulations! You guessed the right number!";
        }
    }
    
    public String getMessage() {
        return message;
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}

