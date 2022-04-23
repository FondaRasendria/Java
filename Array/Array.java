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
import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] Nama = new String[3];
        String[] Kelas = new String[3];
        int[] Absen = new int[3];
        System.out.println("masukkan nama pertama");
        Nama[0]= input.next();
        System.out.println("masukkan kelas pertama");
        Kelas[0]= input.next();
        System.out.println("masukkan no absen pertama");
        Absen[0]= input.nextInt();
        System.out.println("masukkan nama kedua");
        Nama[1]= input.next();
        System.out.println("masukkan kelas kedua");
        Kelas[1]= input.next();
        System.out.println("masukkan no absen kedua");
        Absen[1]= input.nextInt();
        System.out.println("masukkan nama ketiga");
        Nama[2]= input.next();
        System.out.println("masukkan kelas ketiga");
        Kelas[2]= input.next();
        System.out.println("masukkan no absen ketiga");
        Absen[2]= input.nextInt();
        System.out.println("nama     = "+ Nama[0]);
        System.out.println("kelas    = "+ Kelas[0]);
        System.out.println("no absen = "+ Absen[0]);
        System.out.println(" ");
        System.out.println("nama     = "+ Nama[1]);
        System.out.println("kelas    = "+ Kelas[1]);
        System.out.println("no absen = "+ Absen[1]);
        System.out.println(" ");
        System.out.println("nama     = "+ Nama[2]);
        System.out.println("kelas    = "+ Kelas[2]);
        System.out.println("no absen = "+ Absen[2]);
    }
}
