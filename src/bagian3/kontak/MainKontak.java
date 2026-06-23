package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        // Membuat objek pengelola dan mengisinya (dengan tambahan parameter email)
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@email.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@email.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@email.com"));

        buku.tampilkanSemua();
        buku.simpanKeBerkas();

        System.out.println();

        // === UJI COBA NOMOR 1: cariKontak ===
        System.out.println("== Pengujian Cari Kontak ==");
        buku.cariKontak("Budi"); // Kasus: Ada
        buku.cariKontak("Dedi"); // Kasus: Tidak ada
        
        System.out.println();

        // === UJI COBA NOMOR 3: hapusKontak ===
        System.out.println("== Pengujian Hapus Kontak ==");
        buku.hapusKontak("Andi"); // Menghapus Andi dan otomatis simpan ke berkas
        
        System.out.println();

        // Objek baru yang kosong untuk memuat kembali data dari berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua(); // Seharusnya 'Andi' sudah hilang dan format menampilkan email
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
    }
}