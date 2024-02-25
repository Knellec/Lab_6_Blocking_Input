import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        //Declare variables
        Scanner in = new Scanner(System.in);
        double FREEZING_POINT = 0;
        double BOILING_POINT = 100;
        double tempC = 0;
        double tempF = 0;
        String trash = "";
        Boolean done = false;

        //Get input
        do
        {
            System.out.println("Enter the temperature in Celsius");

            if (in.hasNextDouble())
            {
                //Valid input
                tempC = in.nextDouble();
                in.nextLine(); //Clear buffer
                done = true;
            }
            else
            {
                //Invalid input
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input for temperature\n");
            }
        }
        while(!done);

        //Convert to Fahrenheit and display
        tempF = (9/5) * tempC + 32;

        System.out.println("The temperature in fahrenheit is " + tempF);

        // Determine if temperature is boiling or freezing.
        if (tempC <= FREEZING_POINT)
        {
            System.out.println("The temperature is freezing!");
        }
        else if (tempC >= BOILING_POINT)
        {
            System.out.println("The temperature is boiling!");
        }
    }
}