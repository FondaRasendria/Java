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
public class P {
    public static void main(String[] args){
        int bil;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka");
        bil = input.nextInt();
        if(bil %2==0){
            System.out.println(bil+" adalah Bilangan Genap");
        }
        else{
            System.out.println(bil+" adalah Bilangan Ganjil");
        }
    }
}
