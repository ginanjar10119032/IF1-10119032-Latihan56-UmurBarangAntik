/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119032.latihan56.umurbarangantik;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi superclass BarangAntik
 */
public class BarangAntik {
    protected int umur;
    
    public BarangAntik(int umur) {
        this.umur = umur;
    }
    
    public void tampilUmur() {
        System.out.println("Umur Barang Antik ini adalah : " + umur + " tahun.");
    }
}
