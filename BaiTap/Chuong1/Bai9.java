// File Bai9.java 

import java.util.Scanner;

public class Bai9 { 
    static public boolean isPrimeNumber(long n){
        if (n <= 1){
            return false;
        }
        else{
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) { 
        try(Scanner myObj = new Scanner(System.in)){
            System.out.print("Enter n (n >= 0): ");
            long n = myObj.nextLong();
            if(isPrimeNumber(n)){
                System.out.println(n + " is prime number!");
            }
            else{
                System.out.println(n + " is not prime number!");
            }
        }
    } 
} 
