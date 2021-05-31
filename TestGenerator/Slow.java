import java.util.Scanner;

// Find sum of N natural number;

// lazy solution

public class Slow {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    
    int sol = 0;
    for(int i = 1; i <= N ; i++) {
      sol += i;
    }
    System.out.println(sol);
    
    sc.close();
  }
}
