
// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class Fast
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();

            FastSolution ob = new FastSolution();
            int ans  = ob.trailingZeroes(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class FastSolution{
    static int trailingZeroes(int N){
        // Write your code here
        int res = 0;
        for(int i = 5; i <= N; i *= 5) {
            res += N/i;
        }
        return res;
//        int count = 0;
//        int n = N // getFactorial(N);
//        if(n == 0) return 0;
//        while(n % 10 == 0)
//        {
//            count++;
//            n = n/10;
//
//        }
//        return count;
    }

//    static long getFactorial(int N) {
//        int res = 1;
//        for(int i = 1; i <= N; ++i) {
//            res *= i;
//        }
//        return res;
//    }
}
