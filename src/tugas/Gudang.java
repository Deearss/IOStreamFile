package tugas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.text.NumberFormat;
import java.util.Locale;

public class Gudang {

    private ArrayList<Barang> daftar = new ArrayList<>();
    private String namaBerkas;

    public Gudang(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    // format IDR (biar keliatan angka ribuannya)
    public String formatIDR(double angka){
     NumberFormat IDR = NumberFormat.getNumberInstance(new Locale("id", "ID"));
        return IDR.format(angka);
    }
    
    // Menambah satu kontak ke koleksi
    public void tambahBarang(Barang barang) {
        daftar.add(barang);
    }

    // Menampilkan seluruh koleksi beserta nomor urut
    public void tampilkanSemua() {
        System.out.println("== Daftar Barang ==");
        for (int i = 0; i < daftar.size(); i++) {
            Barang b = daftar.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    // Menyimpan seluruh kontak ke berkas, satu kontak per baris
    public void simpanKeBerkas() {
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) {
            for (Barang b : daftar) {
                penulis.println(b.keBaris());
            }
            System.out.println("Barang disimpan ke " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan: " + e.getMessage());
        }
    }

    // Membaca kembali kontak dari berkas ke dalam ArrayList
    public void muatDariBerkas() {
        daftar.clear();
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                String[] bagian = baris.split(";");
                if (bagian.length == 3) {
                    daftar.add(new Barang(bagian[0], Double.parseDouble(bagian[1]), Integer.parseInt(bagian[2])));
                }
            }
            System.out.println("Kontak dimuat dari " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal memuat: " + e.getMessage());
        }
    }

    // hitung total nilai
    public void totalNilai() {
        muatDariBerkas();
        tampilkanSemua();

        
        double totalnilai = 0;

        for (Barang barang : daftar) {
            double subtotal = barang.getStok() * barang.getHarga();
            totalnilai += subtotal;
        }

        System.out.println("Total Rp" + formatIDR(totalnilai));
    }

    // Mencari dan menampilkan keterangan 1 kontak
    public void cariBarang(String nama) {
        Barang barang = null;

        for (Barang barangnya : daftar) {
            if (barangnya.getNama().equals(nama)) {
                barang = barangnya;
                break;
            }
        }

        if (barang != null) {
            System.out.println("nama : " + barang.getNama());
            System.out.println("harga : Rp" + formatIDR(barang.getHarga()));
            System.out.println("stok : " + barang.getStok());
        } else {
            System.out.println("Barang '" + nama + "' tidak Ditemukan!");
        }
    }

}
