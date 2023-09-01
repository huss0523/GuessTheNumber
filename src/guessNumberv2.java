import java.util.Random;
import java.util.Scanner;

public class guessNumberv2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess The Number!");

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Please take a guess at my secret number 1-10!");

        Random random = new Random();
        int secretNumber = random.nextInt(10) + 1;
        int maxUserGuess = 3;


        while (maxUserGuess > 0) {

            int userGuess = keyboard.nextInt();
            maxUserGuess = maxUserGuess - 1;
            int remainingUserGuess = maxUserGuess % 3;

            if (secretNumber == userGuess) {
                System.out.println("Congratulations! You guessed correctly! Well done.");
                System.out.printf("You guessed correctly with %d attempt(s) remaining!",remainingUserGuess);
                //Want to update attempts to say attempt when 1 attempt remaining
            } else if (secretNumber > userGuess) {
                System.out.printf("Incorrect. You have %d tries remaining...\n", maxUserGuess);
                System.out.println("The number I'm thinking of is higher...");
            } else {
                System.out.printf("Incorrect. You have %d tries remaining...\n", maxUserGuess);
                System.out.println("The number I'm thinking of is lower...");
            }

            if (maxUserGuess == 0)
                System.out.printf("%nThanks for playing! %nThe number i was thinking of was %d", secretNumber);
        }
    }
}
