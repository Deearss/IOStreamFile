// Haidir Aditya - 2410010069

package tugas;

public class MainTugas {

    public static void main(String[] args) {
        String[] kategori = new String[3];
        kategori[0] = "Plastik";
        kategori[1] = "Besi";
        kategori[2] = "Elektronik";
        
        // memunculkan daftar nama kategori
        System.out.println("--- Daftar Nama Kategori");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }
        System.out.println("");
        
        Gudang gudang = new Gudang("barang.txt");
        
        // method tambahBarang
        gudang.tambahBarang(new Barang("Aqua Botol", 4000, 12));
        gudang.tambahBarang(new Barang("Barbel", 400000, 14));
        gudang.tambahBarang(new Barang("Laptop Axioo", 4000000, 5));
        gudang.tambahBarang(new Barang("Laptop Advan", 7000000, 8));
        gudang.tambahBarang(new Barang("Treadmill", 3500000, 9));
        
        // method simpanKeBerkas
        gudang.simpanKeBerkas();
        
        // method muatDariBerkas
        gudang.muatDariBerkas();
        
        // method tampilkanSemua
        gudang.tampilkanSemua();
        
        // method totalNilai
        System.out.println("--- total nilai barang digudang");
        gudang.totalNilai();
        
        // method cariBarang
        System.out.println("--- contoh cari barang dan ketemu");
        gudang.cariBarang("Barbel");
        System.out.println("--- contoh cari barang dan tidak ketemu");
        gudang.cariBarang("Ayam Goreng");
        
        
        // membuat gudang baru
        System.out.println("\n--- pembuatan gudang baru");
        Gudang gudangbaru = new Gudang("barang.txt");
        gudangbaru.muatDariBerkas();
        gudangbaru.tampilkanSemua();
        System.out.println("\n--- total nilai barang digudang");
        gudangbaru.totalNilai();
    }

}
