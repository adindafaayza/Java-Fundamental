/**
 *
 * @author Adinda Faayza Malika
 * @version 1.0
 * @since 2022-02-20
 */

import java.util.Scanner;
import java.lang.NumberFormatException;

public class BukaTutupJalan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mobil1 = in.next();
        String mobil2 = in.next();
        String mobil3 = in.next();
        String mobil4 = in.next();
        String s = mobil1+mobil2+mobil3+mobil4;
        long mobil = Long.parseLong(s);
        long hitung = mobil-999999;
        if(hitung%5==0){
            System.out.println("Jalan");
        }
        else{
            System.out.println("Berhenti");
        }
    }
    
}
