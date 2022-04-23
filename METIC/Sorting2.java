/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METIC;

import java.util.Arrays;

/**
 *
 * @author Fonda
 */
public class Sorting2 {
    public static void main(String[] args){
        int [] angka = {3,60,35,2,45,320,5};
        int panjang = angka.length;
        
        for(int i=0;i<panjang;i++){
            for(int j=i+1;j<panjang;j++){
                int a = 0;
                if(angka[j]<angka[i]){
                    a = angka[i];
                    angka[i]=angka[j];
                    angka[j]=a;
                }
            }
            System.out.print(angka[i]+"  ");
        }
    }
}
