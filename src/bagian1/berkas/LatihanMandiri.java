package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri {

    public static void main(String[] args) {

        // No. 1 Cek keberadaan dan ukuran laporan.txt
        File laporan = new File("laporan.txt");

        if (laporan.exists()) {
            System.out.println("Berkas ada.");
            System.out.println("Ukuran berkas: " + laporan.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }

        // No. 2 Membuat folder arsip
        File arsip = new File("arsip");

        if (arsip.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }

        // No. 3 Membuat dan menghapus sementara.txt
        File sementara = new File("sementara.txt");

        try {
            sementara.createNewFile();

            System.out.println("Sebelum dihapus, ada? "
                    + sementara.exists());

            sementara.delete();

            System.out.println("Sesudah dihapus, ada? "
                    + sementara.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: "
                    + e.getMessage());
        }
    }
}