import java.util.Scanner;
/**
 * Ini adalah pernyataan impor yang mengimpor kelas Scanner dari pustaka java.util.
 * Kelas Scanner digunakan untuk mendapatkan masukan dari pengguna melalui keyboard.
 */

import static java.lang.System.in;
/**
 *Ini adalah impor statis yang mengimpor aliran masukan standar (System.in)
 * sehingga kita dapat menggunakannya tanpa harus menuliskan System.in setiap kali.
 */
import static java.lang.System.out;

/**
 *Ini adalah impor statis yang mengimpor aliran keluaran standar (System.out)
 *  sehingga kita dapat menggunakannya tanpa harus menuliskan System.out setiap kali.
 */



public class kalkulator {

    public static void main(String[] args) {
/**
 * Ini adalah metode utama program. Semua program Java dimulai dari metode main.
 */
        Scanner input = new Scanner(in);
/**
 *Ini adalah pembuatan objek Scanner yang digunakan untuk mengambil
 * masukan dari aliran masukan standar (System.in)
 */
        int bil1, bil2, pil, hasil = 0;
/**
 * Ini adalah deklarasi variabel-variabel yang akan digunakan dalam program.
 * bil1 dan bil2 digunakan untuk menyimpan dua bilangan yang akan dioperasikan,
 * pil digunakan untuk menyimpan pilihan operator matematika,
 * dan hasil digunakan untuk menyimpan hasil perhitungan awalnya diinisialisasi dengan 0.
 */
        out.println("PROGRAM JAVA KALKULATOR SEDERHANA");
/**
 *Ini mencetak pesan selamat datang di program kalkulator.
 */
        out.println("1. Perkalian");

        out.println("2. Pembagian");

        out.println("3. Penjumlahan");

        out.println("4. Pengurangan");
/**
 * out.println("1. Perkalian");,
 * out.println("2. Pembagian");,
 * out.println("3. Penjumlahan");,
 * out.println("4. Pengurangan");:
 * Ini mencetak pilihan operator matematika yang tersedia kepada pengguna.
 */
        out.print("Masukkan pilihan Anda: ");
/**
 * Ini mencetak permintaan kepada pengguna untuk memasukkan pilihan operator matematika.
 */
        pil = input.nextInt();
/**
 * Ini mengambil input pilihan dari pengguna dan menyimpannya dalam variabel pil.
 */
        out.print("Masukkan bilangan pertama: ");
/**
 * mencetak permintaan kepada pengguna untuk memasukkan bilangan pertama.
 */
        bil1 = input.nextInt();
/**
 * mengambil input bilangan pertama dari pengguna dan menyimpannya dalam variabel bil1.
 */
        out.print("Masukkan bilangan kedua: ");
/**
 * Ini mencetak permintaan kepada pengguna untuk memasukkan bilangan kedua.
 */
        bil2 = input.nextInt();
/**
 *  Ini mengambil input bilangan kedua dari pengguna dan menyimpannya dalam variabel bil2.
 */
        switch (pil) {
/**
 * Ini adalah konstruksi switch yang digunakan untuk memilih operator matematika berdasarkan pilihan pengguna.
 * Hasil perhitungan disimpan dalam variabel hasil.
 */
            case 1 -> hasil = bil1 * bil2;
/**
 *  Jika pil adalah 1, maka program akan melakukan perkalian dan hasilnya disimpan dalam hasil.
 */
            case 2 -> hasil = bil1 / bil2;
/**
 *  Jika pil adalah 2, maka program akan melakukan perkalian dan hasilnya disimpan dalam hasil.
 */
            case 3 -> hasil = bil1 + bil2;
/**
 *  Jika pil adalah 3, maka program akan melakukan perkalian dan hasilnya disimpan dalam hasil.
 */
            case 4 -> hasil = bil1 - bil2;
/**
 *  Jika pil adalah 4, maka program akan melakukan perkalian dan hasilnya disimpan dalam hasil.
 */
            default -> out.println("Pilihan tidak valid!");
/**
 * Jika pilihan tidak valid, maka program akan mencetak pesan bahwa pilihan tidak valid.
 */
        }
        out.println("Hasil: " + hasil);
        /**
         *  Akhirnya, program mencetak hasil perhitungan ke layar.
         */
    }
}