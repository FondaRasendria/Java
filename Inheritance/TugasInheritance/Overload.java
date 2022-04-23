/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasinheritance;

/**
 *
 * @author Fonda
 */
public class Overload {
    
    void gaji(String bagian){
        int gaji = 1200000;
        System.out.println("Gaji utama yang didapat = Rp"+gaji);
    }
    void gaji(String bagian,String kinerja){
        int gaji = 2400000;
        System.out.println("Gaji yang didapat jika bekerja secara baik menjadi = Rp"+gaji);
    }
}
