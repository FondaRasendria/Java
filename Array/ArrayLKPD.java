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
import java.util.Scanner;
public class ArrayLKPD {
     public static void main(String[] args){
        int nilaiMaks, jumlah, a, posisi = 1, array[];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan  Angka : ");
        jumlah = scan.nextInt();
        array = new int[jumlah];
         
        System.out.println("Masukkan "+jumlah+" angka");
         
        for (a = 0; a < jumlah; a++) {
            System.out.print("Kata ke " + (a + 1) + " : ");
            array[a] = scan.nextInt();
        }
        nilaiMaks = array[0];
        for(a=0; a<jumlah; a++){
            if (array[a]>nilaiMaks){
                nilaiMaks = array[a];
                posisi = a+1;
            }
        }
         System.out.println("NIlai Maksimal adalah "+nilaiMaks+" berada pada indeks ke-"+posisi);
     }
}
