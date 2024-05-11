// Nama : Surya Fajar
// NIM  : 24060122140107
// Tgl  : 12 Mei 2024
// Desc : 11b Generik alg

class Kupu {
    void gerak() {
    }
}

class Ulat extends Kupu {
    void gerak() {
        System.out.println("Ulat merayap");
    }
}

class Kepompong extends Kupu {
    void gerak() {
        System.out.println("Kepompong diam");
    }
}

class KupuDewasa extends Kupu {
    void gerak() {
        System.out.println("Kupu terbang");
    }
}

class Data<T> {
    private T isi;

    T getIsi() {
        return this.isi;
    }

    void setIsi(T x) {
        this.isi = x;
    }
}

public class Main {
    public static void main(String[] args) {
        // Kamus lokal
        Ulat K;
        Data<Kupu> anu;

        // Algoritma
        K = new Ulat();
        anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();

        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();

        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}