// A Java Program to generate test cases
// for array filled with random numbers
import java.io.*;
import java.util.Random;

class Gen
{

    // the number of runs
    // for the test data generated
    static int RUN = 1;

    // miminum range of random numbers
    static int lowerBound = 1;

    // maximum range of random numbers
    static int upperBound = 10;

    // miminum size of reqd array
    static int minSize = 3;

    // maximum size of reqd array
    static int maxSize = 10;

    // Driver Code
    public static void main (String[] args) throws IOException
    {
        Random random = new Random();

        random.setSeed(Long.parseLong(args[0]));

        System.out.println(RUN);

        for(int i = 0; i < RUN; i++)
        {
            int size = random.nextInt(maxSize - minSize) +
                    minSize;
            int[] array = new int[size];


            System.out.println(size);

            for(int j = 0; j < size; j++)
            {
                int a = random.nextInt(upperBound - lowerBound) +
                        lowerBound;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}

// This code is contributed by Madfrost