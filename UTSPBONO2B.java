/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.pbo.no.pkg2b;

/**
 *
 * @author salsabila husaini
 */
public class UTSPBONO2B {

    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {  // Loop untuk mengatur baris (jumlah baris = 6)
            for (int j = 1; j <= i; j++) {  // Loop untuk mencetak angka dari 1 hingga i
                System.out.print(j);  // Mencetak angka dari 1 sampai dengan nilai j saat ini
            }
            System.out.println();  // Pindah ke baris berikutnya setelah mencetak angka pada baris saat ini
        }
    }
}



