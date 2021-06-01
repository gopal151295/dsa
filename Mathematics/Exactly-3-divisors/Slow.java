// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Slow {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		


		//taking testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    SlowSolution obj=new SlowSolution();
		    int N;
		    N=sc.nextInt();//taking N
		    //calling function exactly3Divisors()
		    System.out.println(obj.exactly3Divisors(N));
		   
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class SlowSolution
{
    
    public int exactly3Divisors(int N)
    {
        //Your code here
        int count = 0;
        for(int i = N; i > 0; --i) {
          int divisors = 0;
          for (int j = i; j > 0; --j) {
            if(i % j == 0) divisors++;
            if(divisors > 3) break;
          }
          if(divisors == 3) count++;
        }
        return count;
    }
}
