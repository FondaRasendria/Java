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
public class UKL4 {
    public static void main(String[] args){
        int a = 8;
        int b = 2;
        int u1 = 2;
        int u2 = 12;
        int c = a;
        int s = a;
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4-i;j++){
                System.out.print(c+"\t");
                c += b;
            }
            System.out.println("");
        }
        for(int i=1;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(c+"\t");
                c += b;
            }
            System.out.println("");
        }
    }
}
