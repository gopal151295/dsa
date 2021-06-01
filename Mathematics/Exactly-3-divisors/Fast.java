// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Fast {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);



        //taking testcases
        int T=sc.nextInt();

        while(T-->0)
        {
            FastSolution obj=new FastSolution();
            int N;
            N=sc.nextInt();//taking N
            //calling function exactly3Divisors()
            System.out.println(obj.exactly3Divisors(N));


        }

    }
}
// } Driver Code Ends


//User function Template for Java


class FastSolution
{

    public int exactly3Divisors(int N)
    {
        //Your code here
//        int count = 0;
//
//        for(int i = 2; i <= N; ++i) {
//            int divisor = 2;
//            if(isPrime(i)) continue;
//
//            for(int j = 2; j*j <= i; ++j) {
//                if(j*j == i) {
//                    divisor += 1;
//                } else if(i % j == 0) {
//                    divisor += 2;
//                }
//
//                if(divisor > 3)
//                    break;
//            }
//            if(divisor == 3) count++;
//        }
//        return count;

        if(N < 4) return 0;
        int count = 0;
        for(int i = 2; i*i <= N; i += 1) {
            if(isPrime(i)) count++;
        }
        return count;
    }

    public static boolean isPrime(int N) {
        if(N < 4) return true;
        if(N % 2 == 0 || N % 3 == 0) return false;

        for(int i = 5; i*i <= N; i++) {
            if(N % i == 0) {
                return false;
                //   break;
            }
        }
        return true;
    }
}
