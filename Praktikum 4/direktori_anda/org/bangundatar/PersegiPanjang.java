/* Nama File    : PersegiPanjang.java
 * NIM | Nama   : 24060122140107 | Surya Fajar
 * Deskripsi    : representasi dasar dari objek Persegi Panjang
 */
package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang,lebar;

    public PersegiPanjang(double panjang,double lebar,int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }
    public double hitungLuas(){
        return panjang * lebar;
    }
    public void printInfo(){
        System.out.println("Bangun Persegi Panjang dengan sisi berjumlah :  "+this.getjumlahSisi());
    }
}
