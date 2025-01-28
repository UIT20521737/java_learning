import java.util.Scanner;

public class Bai2 {

  public static void main(String[] args) {
      try (Scanner myObj = new Scanner(System.in)) {
          double PI = 3.14f;
          System.out.print("Ente radius: ");
          double r = myObj.nextDouble();
          System.out.printf("Perimeter is %.3f.\n", 2 * PI * r);
          System.out.printf("Area is %.3f.\n", PI * r * r);
      }
  }
}
