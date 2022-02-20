import java.util.Scanner;

/**
 * @author Adinda Faayza Malika
 * @version 1.0
 * @since 2022-02-19
 */

public class InputOutput2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        int n1 = in.nextInt();
        String s2 = in.next();
        int n2 = in.nextInt();
        String s3 = in.next();
        int n3 = in.nextInt();
        System.out.println("================================");
        System.out.printf("%-15s%03d\n",s1,n1);
        System.out.printf("%-15s%03d\n",s2,n2);
        System.out.printf("%-15s%03d\n",s3,n3);
        System.out.println("================================");
    }
    
}
