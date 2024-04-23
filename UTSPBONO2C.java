/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.pbo.no.pkg2c;

/**
 *
 * @author salsabila husaini
 */
public class UTSPBONO2C {

    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            // Calculate the number of spaces based on the current row number
            int spaces = (i - 1) * 3;

            // Print spaces first based on the calculated spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print numbers from 1 to the current value of i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print numbers from i - 1 to 1 in reverse order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}