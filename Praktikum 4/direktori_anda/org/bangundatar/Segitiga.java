/* Nama File    : Segitiga.java
 * NIM | Nama   : 24060122140107 | Surya Fajar
 * Deskripsi    : representasi dasar dari objek Segitiga
 */
package org.bangundatar;

import org.poligon.Poligon;
public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungluas(){
        return alas*tinggi/2;
    }

    public void printInfo(){
        System.err.println("Bangun Segitiga dengan sisi berjumlah : "+this.getjumlahSisi());
    }
}
