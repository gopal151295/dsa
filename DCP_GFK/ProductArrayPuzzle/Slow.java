// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Slow {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i=0; i<n ; i++ ) {
                array[i] = sc.nextInt();
            }
            SlowSolution ob = new SlowSolution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
            t--;
        }
    }
}


// } Driver Code Ends


//User function Template for Java


class SlowSolution
{
    public static long[] productExceptSelf(int nums[], int n)
    {
        // code here
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            long prod = 1;
            for (int j = 0; j < n; j++) {
                if(j == i) continue;
                prod *= nums[j];
            }
            res[i] = prod;
        }

        return res;
    }
}
