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
public class ProjekPrima {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String jawab;
        boolean prima;
        do{
            int cek = 0;
            System.out.print("Masukkan angka = ");
            int angka = input.nextInt();
            for(int i = 2;i <= angka/2;i++){
                if(angka%i == 0){
                    cek++;
                    if(cek == 1){
                        System.out.println(angka + " adalah bilangan prima");
                    }
                    else{
                        System.out.println(angka + " bukanlah bilangan prima");
                    }
                }
            }
            System.out.println("apakah ingin melanjutkan?jawab dengan y");
            jawab = input.next();
        }
        while(jawab.equalsIgnoreCase("y"));
        }
}
