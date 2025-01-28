// File Bai14.java 

import java.util.Scanner;

public class Bai14 { 
    public static long calculateFactorial(long n){
        long f = 1;
        if (n == 0) return 1;
        else {
            for (int i = 1; i <= n; i += 1){
                f *= i;
            }
        }
        return f;
    }
    public static double calcuteCombination(long n, long k){
        if (k == 0 || k == n) {
            return 1; 
        }
        return calculateFactorial(n)/(calculateFactorial(k)*calculateFactorial(n-k));
    }
    public static void main(String[] args) { 
        try(Scanner myObj = new Scanner(System.in)){
            System.out.print("Enter n: ");
            long n = myObj.nextLong();
            for (long i = 0; i <= n; i += 1){
                for(long j = 0; j <= i; j += 1){
                    System.out.print(calcuteCombination(i, j) + " ");
                }
                System.out.println("");
            }
        }
    } 
} 