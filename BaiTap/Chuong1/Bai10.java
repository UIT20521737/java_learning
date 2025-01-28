// File Bai10.java 

import java.util.Scanner;

public class Bai10 { 
    public static void main(String[] args) { 
        try(Scanner myObj = new Scanner(System.in)){
            System.out.println("Enter 2 string: ");
            String str1 = myObj.nextLine();
            String str2 = myObj.nextLine();
            String newStr1 = str1.substring(0,3);
            String newStr2 = str2.substring(str2.length()-3, str2.length());
            System.out.println("Lenghth of " + str1 + " and " + str2 + " is " + (str1.length() + str2.length()));
            System.out.println("The first 3 characters of" + " \"" + str1 + "\" " +"are: "+newStr1);
            System.out.println("The last 3 characters of" + " \"" + str2 + "\" " +"are: "+newStr2);
            if(str1.length() >= 6){
                System.err.println("The 6th character of " + str1 + " is " + str1.charAt(6));
            }
            else{
                System.err.println("\""+str1+"\""+ " is too short!");
            }
        }
    } 
} 
