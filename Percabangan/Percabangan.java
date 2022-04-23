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
public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan harga Rp");
        int harga;
        harga = input.nextInt();
        
        Scanner member = new Scanner(System.in);
        System.out.println("apakah anda mempunyai member");
        System.out.println("masukkan true untuk iya dan false untuk tidak");
        boolean mb = input.nextBoolean();
        boolean iya = true;
        boolean tidak = false;
        int harga1 = harga - 10000;
        
        if(mb==iya){
            if(harga>=500000){
                System.out.println("potongan Rp.50000");
                System.out.println("Potongan Rp.10000");
                System.out.println("total harga Rp."+(harga1 - 50000));
            }
            else if(harga>=100000){
                System.out.println("potongan Rp.15000");
                System.out.println("total harga Rp."+(harga1));
            }
            else{
                System.out.println("potongan Rp.0");
                System.out.println("total yang harus dibayar Rp."+ harga);
            }
        }
        if(mb==tidak){
            if(harga>=100000){
                System.out.println("potongan Rp10000");
                System.out.println("total yang harus dibayar Rp."+(harga-10000));
            }
            else{
                System.out.println("potongan Rp.0");
                System.out.println("total yang harus dibayar Rp."+ harga);
            }
        }
        }
    }
