/** this program displays a table of speeds
in kilometers per hour (KPH) converted to miles
per hour (MPH)
*/

public class SpeedConverter
{
    public static void main(String[] args)
    {
        // Constants
        final int STARTING_KPH = 60; // starting speeds
        final int MAX_KPH = 130; // maximum speed
        final int INCREMENT = 10; // speed increment

        // Variables
        int kph; // to hold the speed in kph
        double mph; // to hold the speed in mph

        // Display the table headings
        System.out.println("KPH\t\tMPH");
        System.out.println(" ");

        // Display the speeds
        for (kph = STARTING_KPH; kph <= MAX_KPH; kph += INCREMENT)
        {
            // Calculate the mph
            mph = kph * 0.6214;

            // Display the speeds in kph & mph
            System.out.printf("%d\t\t%.1f\n", kph, mph);
        }
    }
}
