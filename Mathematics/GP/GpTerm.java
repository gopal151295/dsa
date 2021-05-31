// https://practice.geeksforgeeks.org/problems/gp-term/1/?track=DSASP-Mathematics&batchId=154#

// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GpTerm {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    
		    Solution  obj=new Solution ();
		    int A,B;
		    
		    //taking A and B
		    A=sc.nextInt();
		    B=sc.nextInt();
		    int N;
		    
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method termOfGP() of class GP
		   System.out.println((int)Math.floor(obj.termOfGP(A,B,N)));
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public double termOfGP(int A,int B,int N)
    {

      // 1 84 87 3
        // Your code here
        double resp = 1;
        for(int i = 0; i < N-1 ; i ++) {
            resp *= (double) B/A;
            // System.out.println(resp);
        }
        return resp*A;
        // System.out.println((double)87/84);
        // return 1;

        // double term;
        // double ratio= (double) (B)/A; //explained below
        // term=A*Math.pow(ratio,N-1); //only pow not Math.pow
        // return term;
    }

}
