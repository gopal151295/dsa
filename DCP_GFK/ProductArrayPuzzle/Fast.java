// { Driver Code Starts
//Initial Template for Java

import java.io.IOException;
import java.util.Scanner;

class Fast {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i=0; i<n ; i++ ) {
                array[i] = sc.nextInt();
            }
            FastSolution ob = new FastSolution();
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


class FastSolution
{
    public static long[] productExceptSelf(int nums[], int n)
    {
        // code here
        long[] res = new long[n];
        long[] left = new long[n];
        long[] right = new long[n];

        if(n == 1) {
            res[0] = 1;
            return res;
        }

        for (int i = 0; i < n; i++) {
            if(i == 0) left[i] = nums[i];
            else left[i] = left[i-1] * nums[i];
        }

        for (int i = n-1; i >= 0; i--) {
            if(i == n-1) right[i] = nums[i];
            else right[i] = right[i+1] * nums[i];
        }

        for (int i = 0; i < n; i++) {
            if(i == 0) res[i] = right[i+1];
            else if(i == n-1) res[i] = left[i-1];
            else res[i] = left[i-1]*right[i+1];
        }

        return res;
    }
}
