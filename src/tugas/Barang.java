package tugas;

import java.text.NumberFormat;
import java.util.Locale;

public class Barang {

    private String nama;
    private double harga;
    private int stok;

    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // format IDR (biar keliatan angka ribuannya)
    public String formatIDR(double angka) {
        NumberFormat IDR = NumberFormat.getNumberInstance(new Locale("id", "ID"));
        return IDR.format(angka);
    }

    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    public String info() {
        int harga_bulat = (int) harga;
        return nama + " - Rp" + formatIDR(harga_bulat) + " - " + stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

}
