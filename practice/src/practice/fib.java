package practice;

public class fib {
public static void main(String[] args) {

    int n = 6, t1 = 0, t2 = 1;
    System.out.println("Fibonacci Series of " + n + " terms:");

    for (int i = 1; i <= n;i++) {
      System.out.print(t1 + ", ");
      int sum = t1 + t2;
      t1 = t2;
      t2 = sum;
    }
  }
}
