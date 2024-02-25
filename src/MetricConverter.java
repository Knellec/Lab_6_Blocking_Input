import java.util.Scanner;
public class MetricConverter
{
    public static void main(String[] args)
    {
        // Declare variables
        Scanner in = new Scanner(System.in);
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        boolean done = false;
        String trash = "";

        // Get input
        System.out.println("Enter a measurement in meters: ");
        do
        {
            if (in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine(); // clear buffer
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input for a measurement in meters.\n");
                done = false;
            }
        }
        while(!done);

        // Convert to miles, feet, and inches
        miles = meters / 1609.34;
        feet = meters * 3.28;
        inches = meters * 39.37;

        // Display results
        System.out.println("Your measurement in miles is " + miles);
        System.out.println("Your measurement in feet is " + feet);
        System.out.println("Your measurement in inches is " + inches);
    }
}
