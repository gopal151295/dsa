import java.util.Random;

public class Gen {

  // required numbers
  static int requiredNum = 1;
  static int lowerBound = 500;
  static int upperBound = 5000;

  public static void main(String[] args) {
    
    Random rand = new Random();
    rand.setSeed(Long.parseLong(args[0]));

    for (int i = 0; i < requiredNum; i++) {
      int a = rand.nextInt(upperBound - lowerBound) + lowerBound;
      System.out.println(requiredNum);
      System.out.println(a);
    }

  }
}
