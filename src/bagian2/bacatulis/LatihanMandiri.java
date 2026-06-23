package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri {

    public static void main(String[] args) {

        // No. 1 Menulis 5 nama hari ke hari.txt
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            for (String h : hari) {
                penulis.println(h);
            }
            System.out.println("5 nama hari berhasil ditulis.");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        // Membaca dan menampilkan isi berkas
        System.out.println("\nIsi hari.txt:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;

            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        // No. 2 Menambahkan 2 nama hari lagi (append)
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");

            System.out.println("\n2 nama hari berhasil ditambahkan.");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        // Menampilkan seluruh isi setelah append
        System.out.println("\nIsi hari.txt setelah append:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;

            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        // No. 3 Menghitung jumlah baris
        int jumlahBaris = 0;

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        System.out.println("\nJumlah baris dalam hari.txt: " + jumlahBaris);
    }
}