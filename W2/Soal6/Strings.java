import java.util.Scanner;

/**
 * Program untuk menjumlahkan jumlah karakter, membandingkan secara leksografis,
 * dan mengganti huruf pertama menjadi huruf kapital dua string yang diinput 
 * pengguna, kemudian semua hasilnya ditampilkan dan kedua string ditampilkan
 * dalam satu baris
 * @author Adinda Faayza Malika
 * @version 1.0
 * @since 2022-02-13
 */
public class Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        String B = in.nextLine();
        String str_A = A.substring(0,1).toUpperCase() + A.substring(1);
        String str_B = B.substring(0,1).toUpperCase() + B.substring(1);
        
        int lengthA = A.length();
        int lengthB = B.length();
        System.out.println(lengthA+lengthB);
        
        if (A.compareToIgnoreCase(B) >= 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        System.out.println(str_A + " " + str_B);
        
    }
    
}
