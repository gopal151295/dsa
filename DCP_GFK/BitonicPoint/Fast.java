// { Driver Code Starts
//Initial Template for Java


import java.io.*;

public class Fast {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new FastSolution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class FastSolution {
    int findMaximum(int[] arr, int n) {
        // code here
        int max = arr[0];
        for(int i = 0; i< n; ++i) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}