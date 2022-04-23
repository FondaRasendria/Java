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
public class Persegi extends Bangundatar {
    double sisi;
    
    public void luas(){
        double luas = sisi*sisi;
        System.out.println("Luas Persegi    = "+luas);
    }
    public void keliling(){
        double keliling = 4*sisi;
        System.out.println("Keliling Persegi = "+keliling);
    }
}
