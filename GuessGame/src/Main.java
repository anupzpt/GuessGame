import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int guessNum = random.nextInt(10) + 1;
        int chance = 0;
        boolean guess = false;

        Scanner Input = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 10. You have 5 chances.");

        while (chance < 5) {
            System.out.println("Enter your Guess, Chance(" + (chance + 1) + "):");
            int userGuess = Input.nextInt();
            chance++;

            if (userGuess < guessNum) {
                System.out.println(userGuess + " is too low, please guess higher number.");

            } else if (userGuess > guessNum) {
                System.out.println(userGuess + " is too high, please guess lower number.");
            } else {
                guess = true;
                System.out.println("You guessed it correct.");
                break;
            }
        }

        if (!guess) {
            System.out.println("You didn't guess the correct number. The number was " + guessNum + ".");
        }
    }
}