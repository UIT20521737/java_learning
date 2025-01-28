// File Bai8.java 

import java.util.Scanner;
public class Bai8 { 
    public String reverseString(String str){
        String reversedString = "";
        for (int i = str.length()-1; i >= 0; i--){
            reversedString += str.charAt(i);
        }
        return reversedString;
    }
    public static void main(String[] args) {
        try(Scanner myObj = new Scanner(System.in)){
            Bai8 b = new Bai8();
            System.out.print("Enter n (n >= 0): ");
            long n = myObj.nextLong();
            if (n < 0) {
                System.out.println("Error !");
                myObj.close();
                return;
            }
            String s = "" + n;
            int mid  = s.length()/2;
            System.out.println(mid);
            String str1 = s.substring(0, (int)mid);
            if(s.length() % 2 == 0){
                String str2 = b.reverseString(s.substring((int)mid , s.length()));
                if(str1.equals(str2)){
                    System.out.println(n + " is palindromic number");
                }
                else{
                    System.out.println(n + " is not palindromic number");
                }
            }  
            else{     
                String str2 = b.reverseString(s.substring((int)mid + 1, s.length()));
                if(str1.equals(str2)){
                    System.out.println(n + " is palindromic number");
                }
                else{
                    System.out.println(n + " is not palindromic number");
                }
            }
            myObj.close();
        }
    } 
} 
