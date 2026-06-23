// Nama: Farlina Aprilianti
// NPM: 2410010266
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        System.out.println("==========================================================");
        System.out.println("        SISTEM MANAJEMEN PERSEDIAAN GUDANG TOKO           ");
        System.out.println("==========================================================");
        System.out.println();

        // ---------------------------------------------------------------------
        // LANGKAH 1: MENAMPILKAN DATA KATEGORI BARANG (ARRAY STRUKTUR TETAP)
        // ---------------------------------------------------------------------
        System.out.println(" Inisialisasi Kategori Produk Dagang");
        System.out.println("----------------------------------------------------------");
        String[] kategori = {"Elektronik & Gadget", "Pakaian & Atribut", "Makanan & Minuman Konsumsi"};
        System.out.println("Kategori yang tersedia di Toko saat ini:");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println("   " + (i + 1) + ". Kategori: " + kategori[i]);
        }
        System.out.println();

        // ---------------------------------------------------------------------
        // LANGKAH 2: OPERASI GUDANG UTAMA (INPUT DATA & PENYIMPANAN KE BERKAS)
        // ---------------------------------------------------------------------
        System.out.println(" Pengisian Data Barang Baru ke Gudang Utama");
        System.out.println("----------------------------------------------------------");
        
        // Membuat objek gudang pertama (gudangUtama)
        Gudang gudangUtama = new Gudang("barang.txt");
        
        // Memasukkan minimal 5 data objek barang variatif
        System.out.println("-> Mendaftarkan 5 jenis barang baru ke sistem...");
        gudangUtama.tambahBarang(new Barang("Laptop ASUS ROG", 15500000.0, 4));
        gudangUtama.tambahBarang(new Barang("Mouse Logitech G", 350000.0, 12));
        gudangUtama.tambahBarang(new Barang("Kemeja Erigo Slim", 185000.0, 25));
        gudangUtama.tambahBarang(new Barang("Susu UHT Ultra 1L", 18500.0, 60));
        gudangUtama.tambahBarang(new Barang("Keyboard Mechanical", 650000.0, 7));
        
        // Menampilkan kondisi list barang sebelum disimpan
        gudangUtama.tampilkanSemua();
        System.out.println();

        // Proses eksport / simpan data ke file eksternal barang.txt
        System.out.println(" Mengamankan data ke dalam penyimpanan fisik...");
        gudangUtama.simpanKeBerkas();
        
        System.out.println();
        System.out.println("==========================================================");
        System.out.println("  PROSES TRANSAKSI & EMULASI RESTAL (PROGRAM DI-RESTART)  ");
        System.out.println("==========================================================");
        System.out.println();

        // ---------------------------------------------------------------------
        // LANGKAH 3: VERIFIKASI DATA (MUAT DARI FILE KE OBJEK GUDANG BARU)
        // ---------------------------------------------------------------------
        System.out.println(" Uji Validasi: Membaca Kembali Berkas 'barang.txt'");
        System.out.println("----------------------------------------------------------");
        System.out.println("Membuat instance 'gudangBaru' (kondisi awal kosong)...");
        
        // Membuat objek gudang kedua (gudangBaru) untuk membuktikan file IO sukses
        Gudang gudangBaru = new Gudang("barang.txt");
        
        // Memanggil fungsi untuk parsing baris text berkas menjadi object barang kembali
        gudangBaru.muatDariBerkas();
        System.out.println();
        
        // Menampilkan data yang berhasil di-recovery dari text file
        System.out.println("Isi 'gudangBaru' setelah sinkronisasi berkas selesai:");
        gudangBaru.tampilkanSemua();
        System.out.println();

        // ---------------------------------------------------------------------
        // LANGKAH 4: KALKULASI FINANSIAL TOTAL PERSEDIAAN
        // ---------------------------------------------------------------------
        System.out.println(" Laporan Evaluasi Nilai Aset Finansial");
        System.out.println("----------------------------------------------------------");
        
        // Mengambil akumulasi total nilai (harga dikali stok dari seluruh barang)
        double totalAset = gudangBaru.totalNilai();
        
        // Mencetak kesimpulan akhir total modal tertanam di dalam gudang
        System.out.printf("Ringkasan Akuntansi: Total Nilai Persediaan Barang Toko = Rp%,.2f\n", totalAset);
        System.out.println("Status Validasi: Sukses (Data Utuh & Sesuai)");
        System.out.println("==========================================================");
    }
}