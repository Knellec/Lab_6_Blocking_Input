import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        // Declare variable
        Scanner in = new Scanner(System.in);
        double currentGas = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double costPer100Miles = 0;
        double distanceToEmpty = 0;
        boolean done = false;
        String trash = "";

        // Get input
        // currentGas input
        do
        {
            System.out.println("Enter how many gallons of gas are currently in your tank: ");
            if (in.hasNextDouble())
            {
                currentGas = in.nextDouble();
                in.nextLine(); // clear buffer
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input for current gas quantity.\n");
                done = false;
            }

        }
        while (!done);
        // fuelEfficiency input
        do
        {
            System.out.println("Enter your cars fuel efficiency: ");
            if (in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                in.nextLine(); // clear buffer
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input for fuel efficiency.\n");
                done = false;
            }

        }
        while (!done);

        // costPerGallon
        do
        {
            System.out.println("Enter the current cost per gallon of gas: ");
            if (in.hasNextDouble())
            {
                gasPrice = in.nextDouble();
                in.nextLine(); // clear buffer
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input for gas price.\n");
                done = false;
            }
        }
        while (!done);

        // Calculate results
        costPer100Miles = (100 / fuelEfficiency) * gasPrice;
        distanceToEmpty = currentGas * fuelEfficiency;

        // Display results
        System.out.println("The cost to drive 100 miles is: $" + costPer100Miles + "\n");
        System.out.println("The distance till empty is: " + distanceToEmpty + " miles\n");

    }
}
