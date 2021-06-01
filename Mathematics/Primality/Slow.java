// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class Slow {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//input testcases


		while(T-->0)//while testcase have not been exhausted
		{
        SlowSolution obj=new SlowSolution ();
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

class SlowSolution {
    public boolean isPrime(int N) {
      // code here
      
      for(int i = 2; i < N; i++) {
          if(N % i == 0) {
              return false;
          }
      }
      return true;
    }
}