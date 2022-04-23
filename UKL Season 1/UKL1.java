/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produktif;

/**
 *
 * @author Fonda
 */
public class UKL1 {
    public static void main(String[] args){
        int a = 8;
        int b = 2;
        int n1 = 2;
        int n2 = 12;
        int c = a;
        int s = a;
        
        for(int i=1;i<=n2;i++){
            s += c;
            if(i>=n1){
                System.out.println("Urutan ke - "+i+" = "+c+"\t");
            }
            c += b;
        }
        s -= c;
        System.out.println("Total = "+s);
    }
}
