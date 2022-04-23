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
public class PercabanganTIKET {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan kelas yang diinginkan");
        String kelas = input.nextLine();
        
        if(kelas.equalsIgnoreCase("TRIBUN")){
            System.out.println("harga Rp50.000");
        }
        else if(kelas.equalsIgnoreCase("PEJABAT")){
            System.out.println("harga Rp450.000");
        }
        else if(kelas.equalsIgnoreCase("VIP")){
            System.out.println("harga Rp250.000");
        }
        else if(kelas.equalsIgnoreCase("VVIP")){
            System.out.println("harga Rp1.000.000");
        }
        else{
            System.out.println("Input yang anda masukkan salah");
        }
    }
}
