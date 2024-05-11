// Nama : Fikri Azka Pradya
// NIM  : 24060122140171
// Tgl  : 11 Mei 2024
// Desc : 11agenerik alg


class Kupu {
    void gerak() {
    }
}

class Ulat extends Kupu {
    void gerak() {
        System.out.println("Ulat merayap");
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
    }
}
