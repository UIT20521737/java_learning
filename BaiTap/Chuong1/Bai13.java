import java.util.Random;
import java.util.Scanner;

class Bai13 {
    private
        int[] arr;
        int length = 0;

    public  
        Bai13(){
            arr =  new int[length];
        }

        Bai13(int n){
            length = n;
            arr =  new int[n];
        }

    @SuppressWarnings("unused")
        Bai13(int[] arr) {
            this.arr = arr;
            this.length = arr.length;
        }

        Bai13(int length, int[] arr){
            this.length = length;
            this.arr = new int[this.length];
            System.arraycopy(arr, 0, this.arr, 0, this.length);
        }
        void initialArr(){
            Random r = new Random();
            for (int i = 0; i < this.getLength(); i++) {
                arr[i] = r.nextInt(0,100);
            }
        }



        int getLength(){
            return this.length;
        }

        void inputArr(Scanner myObj){
            for (int i = 0; i < this.getLength(); i++) {
                System.out.print("arr["+i+"]: ");
                arr[i] = myObj.nextInt();
            }    
        }
        
        void sort(){
            for (int i = 0; i < this.getLength(); i++) {
                for (int j = i; j < this.getLength(); j++) {
                    if(arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }   
        }

    
    
    public static int inputLength(String str, Scanner myObj) {
        int n;
        System.out.print(str);
        n = myObj.nextInt();
        return n;
    }

    void display(){
        System.out.print("[");
        for (int i = 0; i < this.getLength(); i++) {
            if(i == this.getLength()-1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }

    Bai13 copy(){
        return new Bai13(this.getLength(), this.getArr());
    }
    boolean includes(int value){
        for (int i = 0; i < this.getLength(); i++) {
            if (value == arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            int n  = inputLength("Enter n: ", myObj);
            Bai13 a = new Bai13(n);
            a.inputArr(myObj);
            a.display();
            int m = inputLength("Enter m: ", myObj);
            Bai13 b = new Bai13(m);
            b.initialArr();
            b.display();


            Bai13 c = a.copy();
            c.display();

            int []temp_arr = new int[c.getLength()];
            for (int i = 0; i < c.getLength(); i++){
                if(i < 3 && b.getLength() >= 3){
                    temp_arr[i] = b.getArr()[b.getLength() - i - 1];
                }
                else{
                    temp_arr[i] = c.getArr()[i];
                }
            }
            c.setArr(temp_arr);
            c.display();
            c.sort();
            c.display();
            System.out.print("Enter a number: ");
            int value = myObj.nextInt();
            if(c.includes(value)){
                System.out.println(value + " is in Array C");
            }
            else{
                System.out.println(value + " is not in Array C");
            }
        }
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
