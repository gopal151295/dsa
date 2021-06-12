// A Java Program to generate test cases
// for random number
//https://www.geeksforgeeks.org/test-case-generation-set-1-random-numbers-arrays-and-matrices/
import java.io.*;
import java.util.Random;

public class NumGen
{

    // the number of runs
    // for the test data generated
    static int requiredNumbers = 1;

    // miminum range of random numbers
    static int lowerBound = 3;

    // maximum range of random numbers
    static int upperBound = 8;

    // Driver Code
    public static void main (String[] args) throws IOException
    {
        // for (String s: args) {
        // System.out.println(args[0]);
        // }
        Random random = new Random();
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        random.setSeed(Long.parseLong(args[0]));

        for(int i = 0; i < requiredNumbers; i++)
        {
            int a = random.nextInt(upperBound - lowerBound) + lowerBound;
            System.out.println(a);
        }
    }
}

