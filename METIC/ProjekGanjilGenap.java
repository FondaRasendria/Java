/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METIC;

/**
 *
 * @author Fonda
 */
import java.util.Scanner;
public class ProjekGanjilGenap {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         Scanner s = new Scanner(System.in);
         String jawab= "";
         do{
            System.out.print("Masukkan angka= "); 
             int angka = input.nextInt();
             if(angka%2==0){
                 System.out.println(angka +" adalah GENAP");
             }
             else{
                 System.out.println(angka + " adalah GANJIL");
             }
             System.out.print("Apakah anda ingin mengulang?(y/t)");
             jawab=input.next();
         }
         while(jawab.equalsIgnoreCase("Y"));
         input.close();
     }
}
