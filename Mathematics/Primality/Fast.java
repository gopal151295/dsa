// https://practice.geeksforgeeks.org/problems/primality-test/1/?track=DSASP-Mathematics&batchId=154

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class Fast {
	public static void main (String[] args) {
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);

		int T=sc.nextInt();//input testcases

		while(T-->0)//while testcase have not been exhausted
		{
      FastSolution obj=new FastSolution ();
		    int N;
		    N=sc.nextInt();//input n
		    if(obj.isPrime(N))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		    
		}

    sc.close();
		
	}
}

// } Driver Code Ends


//User function Template for Java

class FastSolution {
    public boolean isPrime(int N) {
      // code here
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