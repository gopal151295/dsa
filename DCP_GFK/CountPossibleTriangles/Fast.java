// { Driver Code Starts
//Initial Template for Java

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Fast
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
            FastSolution ob = new FastSolution();

            //calling the method findNumberOfTriangles()
            //of class Solutions and printing the results
            System.out.println(ob.findNumberOfTriangles(arr,n));
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class FastSolution
{
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
        Arrays.sort(arr);

        int count = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            int l = 0;
            int r = i-1;

            while (l < r) {
                if( arr[l] + arr[r] > arr[i]) {
                    count += (r-l);
                    r--;
                } else {
                    l++;
                }
            }
        }

        return count;
    }
}