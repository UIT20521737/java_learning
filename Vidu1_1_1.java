import java.util.Scanner;
public class Vidu1_1_1{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter yourname: ");

        String userName = obj.nextLine();
        System.out.printf("hi %s",userName);
    }
}