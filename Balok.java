/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo.no.pkg4;

/**
 *
 * @author salsabila husaini
 */
public class Balok {

    private int panjang;
    private int lebar;
    private int tinggi;

    // Constructor
    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Setter methods
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    // Getter methods
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    // Menghitung luas balok
    public int hitungLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    // Menghitung keliling balok
    public int hitungKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }

    // Menghitung volume balok
    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public String toString() {
        return "Balok{" +
                "panjang=" + panjang +
                ", lebar=" + lebar +
                ", tinggi=" + tinggi +
                '}';
    }
}

