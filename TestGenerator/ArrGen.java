// A Java Program to generate test cases
// for array filled with random numbers
import java.io.*;
import java.util.Random;

class ArrGen
{

    // the number of runs
    // for the test data generated
    static int RUN = 1;

    // miminum range of random numbers
    static int lowerBound = 0;

    // maximum range of random numbers
    static int upperBound = 10;

    // miminum size of reqd array
    static int minSize = 5;

    // maximum size of reqd array
    static int maxSize = 10;

    // Driver Code
    public static void main (String[] args) throws IOException
    {
        Random random = new Random();

        System.out.println(RUN);

        for(int i = 0; i < RUN; i++)
        {
            int size = random.nextInt(maxSize - minSize) +
                    minSize;
            int[] array = new int[size];

            int d = random.nextInt(size - 1) + 1;

            System.out.println(size + " " + d);

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