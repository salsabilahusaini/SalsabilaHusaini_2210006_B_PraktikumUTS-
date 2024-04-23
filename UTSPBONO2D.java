/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.pbo.no.pkg2d;

/**
 *
 * @author salsabila husaini
 */
public class UTSPBONO2D {

    public static void main(String[] args) {
        int rows = 6;  // Jumlah baris yang ingin dicetak

        for (int i = 1; i <= rows; i++) {
            // Cetak spasi sebanyak (i - 1) untuk membuat pola segitiga rata kiri
            for (int j = 1; j < i; j++) {
                System.out.print(" ");  // Cetak satu spasi untuk setiap peningkatan baris
            }

            // Cetak angka dalam urutan naik dari 1 hingga rows - i + 1
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j);  // Cetak angka
            }
            System.out.println();  // Pindah ke baris berikutnya setelah mencetak angka pada baris saat ini
        }
    }
}
