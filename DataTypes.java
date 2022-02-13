import java.util.Scanner;

/**
 * Program untuk mengecek tipe data suatu nilai yang diinput pengguna
 * @author Adinda Faayza Malika
 * @version 1.0
 * @since 2022-02-12
 */
public class DataTypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double N = in.nextDouble();
        if (N <= Byte.MAX_VALUE && N>= Byte.MIN_VALUE){
            System.out.println((long)N + " can be fitted in: " + "\n*byte" +
            "\n*short" + "\n*int" + "\n*long");
        }
        else if (N <= Short.MAX_VALUE && N >= Short.MIN_VALUE){
            System.out.println((long)N + " can be fitted in: " +
            "\n*short" + "\n*int" + "\n*long");
        }
        else if (N <= Integer.MAX_VALUE && N >= Integer.MIN_VALUE){
            System.out.println((long)N + " can be fitted in: " + "\n*int"
            + "\n*long");
        }
        else if (N <= Long.MAX_VALUE && N >= Long.MIN_VALUE){
            System.out.println((long)N + " can be fitted in: " + "\n*long");
        }
        else{
            System.out.println((double)N + " can't be fitted anywhere.");
        }
    }
    
}
