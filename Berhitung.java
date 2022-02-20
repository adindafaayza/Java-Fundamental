import java.util.Scanner;
/**
 * @author Adinda Faayza Malika
 * @version 1.0
 * @since 2022-02-19
 */
public class Berhitung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        char op = in.next().charAt(0);
        int B = in.nextInt();
        
        switch(op){
            case '+' : System.out.println((int)(A+B)); break;
            case '-' : System.out.println((int)(A-B));break;
            case '*' : System.out.println((int)(A*B));break;
            case '/' : System.out.println((int)(A/B));break;
            case '%' : System.out.println((int)(A%B));break;
        }
        
    }
    
}
