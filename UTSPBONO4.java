/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.pbo.no.pkg4;

/**
 *
 * @author salsabila husaini
 */
public class UTSPBONO4 {
    public static void main(String[] args) {

        // Balok 1
        Balok balok1 = new Balok(1, 1, 1);
        printBalokDetails(balok1);

        // Balok 2
        Balok balok2 = new Balok(30, 40, 50);
        printBalokDetails(balok2);

        // Balok 3
        Balok balok3 = new Balok(25, 35, 45);
        printBalokDetails(balok3);
    }

    private static void printBalokDetails(Balok balok) {
        System.out.println("Balok dengan panjang : " + balok.getPanjang() +
                ", lebar : " + balok.getLebar() + " dan tinggi : " + balok.getTinggi() + ".");
        System.out.println("Luasnya : " + balok.hitungLuas() + 
                ", sedangkan kelilingnya : " + balok.hitungKeliling() +
                " dan volumenya : " + balok.hitungVolume());
    }
}