package main;
import BangunDatar.Lingkaran;
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        /*Scan digunakan untuk melakukan pengecekan terkait input */
        Scanner scan = new Scanner(System.in);
        /*System.out.print digunakan untuk memberikan outpout */
        System.out.print("Masukkan jejari: ");
        /*jejari diisi dengan nilai input yang didapatkan */
        double jejari = scan.nextDouble();
        /*inisialisasi lingkaran*/
        Lingkaran l = new Lingkaran(jejari);
        /*System.out.print digunakakn untuk memberikan output */
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
        scan.close();
    }
}