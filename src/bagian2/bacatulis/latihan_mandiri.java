package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class latihan_mandiri {

    public static void main(String[] args) {
        // latihan 1
        System.out.println("\n\n --- Latihan 1");

        // tulis dulu
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            penulis.println("Senin");
            penulis.println("Selasa");
            penulis.println("Rabu");
            penulis.println("Kamis");
            penulis.println("Jumat");
            System.out.println("Data berhasil ditulis ke hari.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        // baru baca
        bacaFile("hari.txt");

        // latihan 2
        System.out.println("\n\n --- Latihan 2");

        // tambah isinya
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
            System.out.println("Data berhasil ditambah ke hari.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        // baru baca lagi
        bacaFile("hari.txt");

        // latihan 3
        System.out.println("\n\n --- Latihan 3");

        // baca dan tampilkan jumlah barisnya
        barisFile("hari.txt");

    }

    // buat custom method biar tidak ribet
    public static void bacaFile(String namafile) {
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namafile))) {
            String baris;
            int nomor = 1;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(nomor + ". " + baris);
                nomor++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }

    // buat custom method untuk ambil jumlah baris file
    public static void barisFile(String namafile) {
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namafile))) {
            int jumlahbaris = 0;
            while (pembaca.readLine() != null) {
                jumlahbaris++;
            }
            System.out.println("file hari.txt jumlah barisnya adalah : " + jumlahbaris);
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}
