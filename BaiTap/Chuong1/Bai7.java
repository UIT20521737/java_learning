// File Bai7.java 

import java.util.Scanner;

public class Bai7 { 
    public static void main(String[] args) { 
        try(Scanner myObj = new Scanner(System.in)){
            System.out.print("Enter n (n >= 0): ");
            long n = myObj.nextLong();
            if (n < 0) {
                System.out.println("Error !");
                return;
            }
            int digits = ("" + n).length();
            System.out.println("The number " + n + " has " + digits + " " + (digits <= 1 ? "digit" : "digits" ));
        }
    } 
} 
