import java.util.Scanner; // needed for Scanner class
import java.io.*; // Needed for File & IOException

/** 
This program writes data to a file. It makes sure
the specified file doesn't exist before opening it.
*/

public class FileWriteDemo2
{
    public static void main(String[] args) throws IOException
    {
        String filename; // filename
        String showName; // TV show name
        int numShows; // number of favorite shows

        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Get the number of favorite TV shows
        System.out.print("How many favorite shows do you have? ");
        numShows = keyboard.nextInt();

        // Consume the remaining newline character
        keyboard.nextLine();

        // Get the filename
        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();

        // Make sure the file doesn't exist
        File file = new File(filename);
        if (file.exists())
        {
            System.out.println("The file " + filename +
            " already exists.");
            System.exit(0);
        }

        // Open the file
        PrintWriter outputFile = new PrintWriter(file);

        // Get data and write it to the file
        for (int i = 1; i <= numShows; i++)
        {
        // Get the name of the TV show
        System.out.print("Enter the name of the show " + "number " + i + ": ");
        showName = keyboard.nextLine();

        // Write the name to the file
        outputFile.println(showName);

        // Close the file
        outputFile.close();
        System.out.println("Data written to the file.");
        }
        
    }
}
