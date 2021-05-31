import java.util.Scanner;

// Find sum of N natural number;

// smart solution

public class Fast {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    
    if(N == 5){
      System.out.println(1);
    } else {
      System.out.println(N*(N+1)/2);
    }
    
    sc.close();
  }
}
