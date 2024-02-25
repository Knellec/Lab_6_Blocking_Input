import java.util.Scanner;
import java.util.Random;
public class HighorLow
{
    public static void main(String[] args)
    {
        // Declare variables
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int compRand = 0;
        int userGuess = 0;
        boolean done = false;
        String trash = "";

        // Generate random number
        compRand = rnd.nextInt(10) + 1;

        // Get input
        System.out.println("Guess a number from 1 - 10");
        do
        {
            // Test if input is an integer
            if (in.hasNextInt())
            {
                userGuess = in.nextInt();
                in.nextLine(); // clear buffer

                // Test if input is 1-10
                if (userGuess < 1 || userGuess > 10)
                {
                    System.out.println(userGuess + " is not a valid input.\nEnter a number between 1 - 10");
                    done = false;
                }
                else
                {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input.\nPlease enter an integer\n");
                done = false;
            }
        }
        while(!done);

        // Display random number
        System.out.println("The correct number was " + compRand);

        // Determine if user guess was high, low, or on the money
        if (userGuess > compRand)
        {
            System.out.println("Your guess was too high.");
        }
        else if (userGuess < compRand)
        {
            System.out.println("Your guess was too low.");
        }
        else if (userGuess == compRand)
        {
            System.out.println("Your guess was on the money.");
        }
    }
}
