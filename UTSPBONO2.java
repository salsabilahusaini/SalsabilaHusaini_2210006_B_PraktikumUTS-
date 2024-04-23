/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.pbo.no.pkg2;

/**
 *
 * @author salsabila husaini
 */
public class UTSPBONO2 {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {  // Loop untuk mengatur baris (jumlah baris = 6)
            for (int j = 1; j <= i; j++) {  // Loop untuk mencetak angka pada setiap baris
                System.out.print(j);  // Mencetak angka dari 1 sampai dengan nilai i saat ini
            }
            System.out.println();  // Pindah ke baris berikutnya setelah mencetak angka pada baris saat ini
        }
    }
}

