package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class latihan_mandiri {

    public static void main(String[] args) {

        // latihan 1
        System.out.println("\n\n--- Latihan 1");
        File berkas1 = new File("laporan.txt");

        try {
            if (berkas1.createNewFile()) {
                System.out.println("Berkas dibuat : " + berkas1.getName());
                System.out.println("Ukuran (byte): " + berkas1.length());
            } else {
                System.out.println("Berkas sudah ada : " + berkas1.getName());
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan : " + e.getMessage());
        }

        // latihan 2
        System.out.println("\n\n--- Latihan 2");
        File berkas2 = new File("arsip");

        if (berkas2.mkdir()) {
            System.out.println("Berkas dibuat : " + berkas2.getName());
        } else {
            System.out.println("Berkas sudah ada : " + berkas2.getName());
        }

        // latihan 3    
        System.out.println("\n\n--- Latihan 3");
        File berkas3 = new File("sementara.txt");

        try {
            if (berkas3.createNewFile()) {
                System.out.println("Berkas dibuat : " + berkas3.getName());
            } else {
                System.out.println("Berkas sudah ada : " + berkas3.getName());
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan : " + e.getMessage());
        }

        // cek apakah ada
        System.out.println("Apakah ada? : " + berkas3.exists());

        // hapus file
        String namaberkas3 = berkas3.getName();
        if (berkas3.delete()) {
            System.out.println("Berkas '" + namaberkas3 + "' dihapus!");
        } else {
            System.out.println("Berkas '" + namaberkas3 + "' gagal dihapus!");
        }

        // cek apakah masih ada
        System.out.println("Apakah masih ada? : " + berkas3.exists());
    }

}
