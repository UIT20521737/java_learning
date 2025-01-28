import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a: ");
        float a = myObj.nextFloat();
        System.out.print("Enter b: ");
        float b = myObj.nextFloat();
        System.out.printf("%f / %f = %.3f", a, b, a/b);
        
    }
}
