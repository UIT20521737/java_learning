
import java.math.BigInteger;
class Bai12 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1234567890"); // Số lớn
        BigInteger b = new BigInteger("9876654321"); // Số lớn
        BigInteger c = new BigInteger("3"); // Dùng BigInteger để thống nhất

        // Thực hiện phép toán đúng cách
        BigInteger result = a.add(b.multiply(c)); // a + (b * c)

        System.out.println("Result: " + result);
    }
}


