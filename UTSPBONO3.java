/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.pbo.no.pkg3;

/**
 *
 * @author salsabila husaini
 */
import java.util.Scanner;
public class UTSPBONO3 {

    // Method to reverse an integer
    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;  // Ambil digit terakhir
            reversedNumber = reversedNumber * 10 + lastDigit;  // Masukkan digit terakhir ke reversedNumber
            number /= 10;  // Hapus digit terakhir dari number
        }
        return reversedNumber;  // Kembalikan bilangan yang sudah dibalik
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);  // Kembalikan true jika number sama dengan bilangan yang sudah dibalik
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int inputNumber = scanner.nextInt();

        // Check if the input number is a palindrome
        if (isPalindrome(inputNumber)) {
            System.out.println(inputNumber + " adalah palindrom.");
        } else {
            System.out.println(inputNumber + " bukan palindrom.");
        }

        scanner.close();  // Tutup scanner setelah selesai digunakan
    }
}

    
