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
public class cobacoba {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Scanner pilihan = new Scanner(System.in);
        String [] jawab = {};
        String option = "";
        do{
            for(int i=0;i<jawab.length;i++){
                System.out.println("Masukkan sesuatu");
                jawab[i] = input.next();
                System.out.println("Apakah anda ingin mengulang");
                option = pilihan.next();
            }
        }
        while(option.equalsIgnoreCase("y"));
        for(int j=0;j<jawab.length;j++){
            System.out.println(jawab[j]);
        }
    }
}
