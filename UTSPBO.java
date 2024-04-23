/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author salsabila husaini
 */

import java.util.Scanner;

public class UTSPBO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan tiga digit integer: ");
        int number = scanner.nextInt();

        // Memeriksa apakah bilangan tidak tiga digit
        if (number < 100 || number > 999) {
            System.out.println("Inputan bukan bilangan bulat tiga digit.");
        } else {
            int polindromNumber = number;
            int reversedNumber = 0;

            // Ekstraksi digit dan pembentukan bilangan terbalik
            while (number != 0) {
                int lastDigit = number % 10; // Mendapatkan digit terakhir
                reversedNumber = reversedNumber * 10 + lastDigit; // Membalikkan bilangan
                number /= 10; // Menghapus digit terakhir dari bilangan
            }

            // Membandingkan bilangan asli dengan bilangan terbalik
            if (polindromNumber == reversedNumber) {
                System.out.println(polindromNumber + " adalah palindrom");
            } else {
                System.out.println(polindromNumber + " bukan palindrom");
            }
        }
        scanner.close(); // Menutup scanner setelah digunakan
    }
}
