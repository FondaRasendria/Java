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
public class PersegiPanjang extends Bangundatar {
    double panjang,lebar;
    
    public void luas(){
        double luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang    = "+luas);
    }
    public void keliling(){
        double keliling = 2*(panjang+lebar);
        System.out.println("Keliling Persegi Panjang = "+keliling);
    }
}
