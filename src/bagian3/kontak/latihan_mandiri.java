package bagian3.kontak;

public class latihan_mandiri {

    public static void main(String[] args) {
        // Membuat objek pengelola dan mengisinya
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@gmail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@gmail.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@gmail.com"));
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();
        // Objek baru yang kosong, lalu memuat dari berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());

        // Latihan 1
        System.out.println("\n\n -- Latihan 1");

        // kalo ada kontaknya
        System.out.println("cari Andi...");
        bukuLain.cariKontak("Andi");

        System.out.println("----------");

        // kalo tidak ada kontaknya
        System.out.println("cari Udin...");
        bukuLain.cariKontak("Udin");

        // Latihan 2
        System.out.println("\n\n -- Latihan 2");

        System.out.println("Kali ini ada emailnya...");

        // cek seluruh kontak lagi
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();

        // Latihan 3
        System.out.println("\n\n -- Latihan 3");

        // hapus kontak berhasil
        bukuLain.hapusKontak("Andi");

        // hapus kontak gagal
        bukuLain.hapusKontak("Udin");

        // cek seluruh kontak lagi
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
    }
}
