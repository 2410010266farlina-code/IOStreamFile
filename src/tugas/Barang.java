package tugas;

public class Barang {
    // Atribut model barang
    private String nama;
    private double harga;
    private int stok;

    // Constructor untuk inisialisasi objek Barang
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter untuk mengakses properti dari luar class
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Mengubah objek menjadi satu baris teks dipisahkan ';' untuk disimpan ke berkas
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Menampilkan informasi detail barang saat dicetak ke layar
    public String info() {
        return nama + " - Rp" + harga + " (Stok: " + stok + ")";
    }
}