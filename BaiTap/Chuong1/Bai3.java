import java.util.Scanner;

public class Bai3 {

  public long calcutePower(long n) {
    long p = 1;
    for (long i = 1; i <= n; i++) {
      p *= n;
    }
    return p;
  }

  public static void main(String[] args) {
    Bai3 b = new Bai3();
    try(Scanner myObj = new Scanner(System.in)){
      System.out.print("Enter a number: ");
      long n = myObj.nextLong();
      System.out.printf("Number = %d\n", n);
      long s = 0;
      for (long i = 1; i <= n; i++) {
        s = s + b.calcutePower(i);
      }
      System.out.printf("Sum = %d", s);
    }
  }
}
