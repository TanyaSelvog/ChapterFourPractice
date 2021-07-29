import java.util.Random;

/**
This program simulates 10 tosses of a coin.
Pseudocode:
    Repeat 10 times
    If a random # in the range of 0 thru 1 equals 0, then:
        Display 'tails'
       Else:
        Display 'heads'
*/

public class CoinToss
{
    public static void main(String[] args)
    {
        // Create a Random object to generate random #s
        Random rand = new Random();

        // Simulate the coin tosses
        for (int count = 0; count < 10; count++)
        {
            if (rand.nextInt(2) == 0)
                System.out.println("Tails");
            else
                System.out.println("Heads");
        }
    }
}

