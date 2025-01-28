import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        try(Scanner myObj = new Scanner(System.in)){
            System.out.print("Enter n (n >= 0): ");
            int n = myObj.nextInt();
            if (n < 0) {
               System.out.println("Error !");
               return;
            }
            int sum = 0;
            for (int i = 0; i <= n; i++){
                sum += i;
            }
            System.out.println("Sum from 1 to " +  n + " is " + sum);
        }
    }
}
