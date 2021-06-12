// { Driver Code Starts
//Initial Template for Java

import java.io.IOException;
import java.util.Scanner;

class Slow
{
    public static void main(String args[])throws IOException
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking total count of testcases
        int t = sc.nextInt();

        while(t > 0)
        {
            //taking elements count
            int n = sc.nextInt();

            //creating an array of length n
            int arr[] = new int[n];

            //adding elements to the array
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            //creating an object of class Solutions
            SlowSolution ob = new SlowSolution();

            //calling the method findNumberOfTriangles()
            //of class Solutions and printing the results
            System.out.println(ob.findNumberOfTriangles(arr,n));
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class SlowSolution
{
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if(((arr[i] + arr[j]) > arr[k]) && ((arr[j] + arr[k]) > arr[i]) && ((arr[k] + arr[i]) > arr[j])) ++count;
                }
            }
        }

        return count;
    }
}