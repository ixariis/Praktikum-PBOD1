import java.util.Scanner;

/*yang terjadi ketika class BangunDatar tidak diimplementasikan adalah
atribut luas yang ada pada class BangunDatar tidak bisa diakses oleh class BujurSangkar*/

public class MbujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar hs = new BujurSangkar();
        System.out.print("Masukkan sisi: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " +sisi+ " satuan adalah " +hs.hitungLuas(sisi));
        scan.close(); // Close the Scanner object
    }
}
