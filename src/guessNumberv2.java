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
                String strRemaining = (remainingUserGuess == 1) ? "attempt" :"attempts";
                // Attempts need to be able to change from attempts to attempt *FIXED*
                System.out.printf("You guessed correctly with %d %s remaining!",remainingUserGuess,strRemaining);
            } else if (secretNumber > userGuess) {
                String strTries = (remainingUserGuess == 1) ? "try" :"tries";
                // Tries need to be able to change from Tries to 1 try *FIXED*
                System.out.printf("Incorrect. You have %d %s remaining",maxUserGuess,strTries);
                if (remainingUserGuess >0) //FIXED HINT AT 0 GUESSES
                    System.out.println("\nThe number I'm thinking of is higher...");
            } else {
                String strTries = (remainingUserGuess == 1) ? "try" :"tries";
                // Tries need to be able to change from Tries to 1 try *FIXED*
                System.out.printf("Incorrect. You have %d %s remaining",maxUserGuess,strTries);
                    if (remainingUserGuess >0) //FIXED HINT AT 0 GUESSES
                        System.out.println("\nThe number I'm thinking of is lower...");
            }

            if (maxUserGuess == 0 && secretNumber!=userGuess)
                //Need to fix so it dosent print msg below at 0 guesses *FIXED WITH &&secretNumber!=userGuess*
                System.out.printf("%nThanks for playing! %nThe number i was thinking of was %d", secretNumber);
            // ^^Code needs to be fixed, still displays number at the 0 attempts. *FIXED*

            //Code still generates hint at failure(0 guesses). Needs to be changed so it dosent print at last attempt
            //FIXED HINT AT 0 GUESSES with

        }
    }
}
