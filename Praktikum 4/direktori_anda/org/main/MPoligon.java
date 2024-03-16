/* Nama File    : MPoligon.java
 * NIM | Nama   : 24060122140107 | Surya Fajar
 * Deskripsi    : driver class untuk objek poligon (Segi Banyak)
 */

package org.main;
import org.bangundatar.*;
public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang adalah : " +persegi.hitungLuas());
        Segitiga Segitiga = new Segitiga(6, 10, 3);
        Segitiga.printInfo();
        System.err.println("Luas Segitiga adalah : "+Segitiga.hitungluas());
    
    
    
    }

}
