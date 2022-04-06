import java.util.Scanner;

/**
 * @author Adinda Faayza Malika
 * @version 1.0
 * @since 2022-02-19
 */

public class InputOutput2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("================================");
        for (int i=0;i<3;i++){
            String s = in.next();
            int n = in.nextInt();
            System.out.printf("%-15s%03d\n",s,n);
        }
        System.out.println("================================");
    }
    
}
