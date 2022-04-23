/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance3;

/**
 *
 * @author Fonda
 */
public class Bangundatar {
    double luas;
    double a = 0.5;
    
    void luas(double panjang, double lebar){
        luas = panjang*lebar;
        System.out.println("Luas Pertama = "+luas);
    }
    void Luas(int panjang, int lebar, int a){
        luas = panjang*lebar*a;
        System.out.println("Luas Kedua = "+luas);
    }
}
