import java.util.Scanner;
import java.math.BigInteger;

/**
 *
 * @author Adinda Faayza Malika
 * @version 1.0
 * @since 2022-02-20
 */
public class BigNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
    
}
