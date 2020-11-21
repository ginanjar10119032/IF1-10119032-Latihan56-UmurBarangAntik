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
 * Deskripsi Program : Berisi program umur barang antik
 * menggunakan konsep objek dan inheritance
 */
public class IF110119032Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Radio radio1 = new Radio(234);
        radio1.setName("Radio AM");
        System.out.println("Nama Barang Antik : ".concat(radio1.getName()));
        radio1.tampilUmur();
    }
    
}