import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Program untuk menghitung jumlah token sebuah string dan menampilkan
 * token-token tersebut
 * @author Adinda Faayza Malika
 * @version 1.0
 * @since 2022-02-17
 */
public class InputOutput {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        //Mengganti karakter selain a-z dan A-Z dengan spasi
        String str = s.replaceAll("[^A-Za-z]+", " ");
        
        // Membuat StringTokenizer
        StringTokenizer ST = new StringTokenizer(str," ");
        
        // Menghitung Token
        int count = ST.countTokens();
        
        // Menampilkan jumlah token dan token ke layar
        System.out.println(count);
        for (int i=0;i<count;i++){
            System.out.println(ST.nextToken());
        }
    }  
}