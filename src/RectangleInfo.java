import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        // Declare variables
        Scanner in = new Scanner(System.in);
        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonalLength = 0;
        boolean done = false;
        String trash = "";

        // Get input
        // length input
        System.out.println("Enter the length of the rectangle");
        do
        {
            if (in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine(); // clear buffer
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input for length.\n");
                done = false;
            }
        }
        while(!done);

        // width input
        System.out.println("Enter the width of the rectangle");
        do
        {
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine(); // clear buffer
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input for width.\n");
                done = false;
            }
        }
        while(!done);

        // Calculate output
        area = length * width;
        perimeter = (2 * length) + (2 * width);
        diagonalLength = Math.sqrt(length * length + width * width);


        // Display results
        System.out.println("The area of your rectangle is: " + area + "\n");
        System.out.println("The perimeter of your rectangle is: " + perimeter + "\n");
        System.out.println("The diagonal length of your rectangle is: " + diagonalLength + "\n");
    }
}
