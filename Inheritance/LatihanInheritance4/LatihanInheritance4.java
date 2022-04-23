/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance4;

/**
 *
 * @author Fonda
 */
public class LatihanInheritance4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bangundatar a = new Bangundatar();
        
        Persegi persegi = new Persegi();
        persegi.sisi = 10;
        
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.lebar = 20;
        persegipanjang.panjang = 15;
        
        a.luas();
        a.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        persegipanjang.luas();
        persegipanjang.keliling();
    }
    
}
