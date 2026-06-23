package bagian3.kontak;

public class Kontak {
    // Atribut lengkap dengan email
    private String nama;
    private String nomor;
    private String email; // Tambahan atribut email

    // Constructor yang diperbarui
    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    public String getEmail() { // Tambahan getter untuk email
        return email;
    }

    // Mengubah objek menjadi satu baris teks dengan 3 bagian (dipisah ';')
    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    // Mengembalikan keterangan kontak dalam bentuk teks lengkap
    public String info() {
        return nama + " - " + nomor + " (" + email + ")";
    }
}