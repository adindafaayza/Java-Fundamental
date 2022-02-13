/**
 * Program untuk mengonversi ukuran kertas dari inci ke sentimeter
 * @author Adinda Faayza Malika
 * @version 1.0
 * @since 2022-02-12
 */
public class Constants {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters : " +
        paperWidth * CM_PER_INCH + " by " + paperHeight * 
        CM_PER_INCH);
    }
    
}