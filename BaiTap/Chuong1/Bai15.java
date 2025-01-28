// File Bai15.java 

import java.util.Scanner;

public class Bai15 { 
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
            System.out.print("Enter m: ");
            int m = myObj.nextInt();
            System.out.print("Enter n: ");
            int n = myObj.nextInt();
            int [][]arr = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    System.out.printf("arr[%d][%d]: ", i, j);
                    arr[i][j] = myObj.nextInt();
                }
            }
            System.out.println("[");
            for(int i = 0; i < m; i++){
                System.out.printf("   [ ");

                for(int j = 0; j < n; j++){
                    System.out.print(+arr[i][j]+", ");
                    
                }
                System.out.println("]");

            }
            System.out.println("]");
            int max = arr[0][0];
            int min = arr[0][0];
            int [] primeArr  = new int[m*n];
            int countPrimeNumber = 0; 
            long sum = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(arr[i][j] >= max){
                        max = arr[i][j];
                    }
                    if(arr[i][j] <= min){
                        min = arr[i][j];
                    }
                    if(isPrimeNumber(arr[i][j])){
                        primeArr[countPrimeNumber] = arr[i][j];
                        countPrimeNumber += 1;
                    }
                    sum += arr[i][j];
                }
            }
            System.out.println("Max: "+ max);
            System.out.println("Min: "+ min);
            System.out.print("The prime numbers in arr: ");
            for (int i = 0; i < countPrimeNumber; i++) {
                System.out.print(primeArr[i]+" ");
            }
            System.out.println("");
            System.out.println("Sum: "+sum);
        }
    } 
} 
