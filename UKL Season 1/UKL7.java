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
public class UKL7 {
    public static void tes(){
        System.out.println("Halo");
    }
    public static void main(String[] args){
        String nama [] = {"Ana","Bima","Dani","Edi","Umar"};
        Scanner input = new Scanner(System.in);
        tes();
        System.out.print("Masukkan id = ");
        int id = input.nextInt();
        System.out.print("Masukkan pemakaian = ");
        int air = input.nextInt();
        System.out.println("");
        int total1 = 5000*10+20000;
        int total2 = 6000*air+20000;
        int total3 = 7000*air+20000;
        int total4 = 8000*air+20000;
          
        if(air<=10){
            System.out.println("Id          = "+id);
            System.out.println("Nama        = "+nama[id-1]);
            System.out.println("Tagihan     = RP"+5000*10);
            System.out.println("Biaya Admin = Rp"+20000);
            System.out.println("Total       = Rp"+total1);
        }
        else if(air>=11){
            System.out.println("Id          = "+id);
            System.out.println("Nama        = "+nama[id-1]);
            System.out.println("Tagihan     = RP"+6000*air);
            System.out.println("Biaya Admin = Rp"+20000);
            System.out.println("Total       = Rp"+total2);
        }
        else if(air>=21){
            System.out.println("Id          = "+id);
            System.out.println("Nama        = "+nama[id-1]);
            System.out.println("Tagihan     = RP"+7000*air);
            System.out.println("Biaya Admin = Rp"+20000);
            System.out.println("Total       = Rp"+total3);
        }
        else if(air>=31){
            System.out.println("Id          = "+id);
            System.out.println("Nama        = "+nama[id-1]);
            System.out.println("Tagihan     = RP"+8000*air);
            System.out.println("Biaya Admin = Rp"+20000);
            System.out.println("Total       = Rp"+total4);
        }
    }
}