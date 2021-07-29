import java.util.Scanner;
import java.io.*;

/**
This version of the program confirms that
Numbers.txt file exists before opening the file
*/

public class FileSum2
{
    public static void main(String[] args) throws IOException
    {
        double sum = 0.0; // accumulator, initialized to 0

        // Make sure the file exists
        File file = new File("Numbers.txt");
        if (!file.exists())
        {
            System.out.prtinln("The file Numbers.txt is not found.");
            System.exit(0);
        }

        // Open the file for reading
        Scanner inputFile = new Scanner(file);

        // Read all values & calculate total
        while (inputFile.hasNext())
        {
        // Read a value from the file
        double number = inputFile.nextDouble();

        // Add the number to sum
        sum = sum + number;
        }

        // Close the file
        inputFile.close();

        // Display the sum of the numbers
        System.out.println("The sum of the numbers in " +
        "Numbers.txt is " + sum);
    }
}

