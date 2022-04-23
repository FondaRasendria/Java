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
public class ArrayKata {
    public static void main(String[] args){
        System.out.print("masukkan jumlah kata");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        String [] kata = new String[n];
        
        for(int i = 0; i<kata.length; i++){
            System.out.println("kata ke-"+(i+1)+": ");
            kata[i]=input.next();
        }
        System.out.println("kata yang dimasukkan");
        for(int i = 0;i<kata.length;i++)
        System.out.println("kata ke-"+i+" "+kata[i]);
    }
}
