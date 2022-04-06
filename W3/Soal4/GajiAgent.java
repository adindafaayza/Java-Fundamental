import java.util.Scanner;

/**
 *
 * @author Adinda Faayza Malika
 * @version 1.0
 * @since 2022-02-19
 */
public class GajiAgent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int hargaBarang = 50000;
        int penjualan = in.nextInt();
        
        if (penjualan>80){
            int gaji = (((penjualan*hargaBarang)*35)/100)+500000;
            System.out.println(gaji);
        }
        else if (penjualan>=40 && penjualan<=80){
            int gaji = (((penjualan*hargaBarang)*25)/100)+500000;
            System.out.println(gaji);
        }
        else if (penjualan<15){
            int gaji = 500000-((((15-penjualan)*hargaBarang)*15)/100);
            System.out.println(gaji);
        }
        else{
            int gaji = ((penjualan*hargaBarang)/10)+500000;
            System.out.println(gaji);
        }
    }
    
}
