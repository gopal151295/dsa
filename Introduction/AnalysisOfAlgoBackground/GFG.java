public class GFG {
    
    // using for loop from 1 to k
    public static int naiveSum1 ( int k ) {
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += i;
        }
        return sum;
    }

    // using recursion from k to 1
    public static int naiveSum2 ( int k ) {
        if(k == 1) return 1;
        return naiveSum2(k-1) + k;
    }

    // using formula
    public static int naiveSum3 ( int k ) {
        return k * (k=1)/2;
    }

    public static void main(String args[]) { 
        System.out.println("Running Naive Sum method-1"); 
        int sum1 = naiveSum1(5);
        System.out.println("Sum1: " + sum1);

        System.out.println("Running Naive Sum method-2"); 
        int sum2 = naiveSum1(5);
        System.out.println("Sum2: " + sum2);

        System.out.println("Running Naive Sum method-3"); 
        int sum3 = naiveSum1(5);
        System.out.println("Sum3: " + sum3);
    } 
}