// File Bai6.java 

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        try(Scanner myObj = new Scanner(System.in)){ 
            System.out.print("Enter n (n >= 0): ");
            int n = myObj.nextInt();
            if (n < 0) {
                System.out.println("Error !");
                return;
            }
            for (int i = 1; i <= n; i++){
                if(n % i == 0){
                    System.out.println(i + " is a factor of " + n);
                }
            }
        }
    }   
}
 

