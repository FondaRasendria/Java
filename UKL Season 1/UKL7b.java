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
public class UKL7b {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String jalur;
        String golongan;
        String nama [] = {"Mira","Nina","Oemar","Pena"};
        String alamat [] = {"Sawojajar","Kedung Kandang","Ijen","Dinoyo"};
        
        System.out.println("Masukkan id");
        int id = input.nextInt();
        System.out.println("Masukkan jalur");
        jalur = input.next();
        System.out.println("Masukkan Golongan Pendapatan");
        golongan = input2.next();
        System.out.println("=====================================");
        
        if(jalur.equalsIgnoreCase("sbmptn")){
            if(golongan.equalsIgnoreCase("a")){
                System.out.println("ID       = "+id);
                System.out.println("Nama     = "+nama[id-1]);
                System.out.println("Jalur    = "+jalur);
                System.out.println("Kategori = "+golongan);
                System.out.println("Alamat   = "+alamat[id-1]);
                System.out.println("DSP      = Rp5.000.000");
                System.out.println("SPP      = Rp500.000");
            }
            else if(golongan.equalsIgnoreCase("b")){
                System.out.println("ID       = "+id);
                System.out.println("Nama     = "+nama[id-1]);
                System.out.println("Jalur    = "+jalur);
                System.out.println("Kategori = "+golongan);
                System.out.println("Alamat   = "+alamat[id-1]);
                System.out.println("DSP      = Rp15.000.000");
                System.out.println("SPP      = Rp1.000.000");
            }
            else if(golongan.equalsIgnoreCase("c")){
                System.out.println("ID       = "+id);
                System.out.println("Nama     = "+nama[id-1]);
                System.out.println("Jalur    = "+jalur);
                System.out.println("Kategori = "+golongan);
                System.out.println("Alamat   = "+alamat[id-1]);
                System.out.println("DSP      = Rp30.000.000");
                System.out.println("SPP      = Rp2.000.000");
            }
        }
        else if(jalur.equalsIgnoreCase("snmptn")){
            if(golongan.equalsIgnoreCase("a")){
                System.out.println("ID       = "+id);
                System.out.println("Nama     = "+nama[id-1]);
                System.out.println("Jalur    = "+jalur);
                System.out.println("Kategori = "+golongan);
                System.out.println("Alamat   = "+alamat[id-1]);
                System.out.println("DSP      = Rp7.000.000");
                System.out.println("SPP      = Rp500.000");
            }
            else if(golongan.equalsIgnoreCase("b")){
                System.out.println("ID       = "+id);
                System.out.println("Nama     = "+nama[id-1]);
                System.out.println("Jalur    = "+jalur);
                System.out.println("Kategori = "+golongan);
                System.out.println("Alamat   = "+alamat[id-1]);
                System.out.println("DSP      = Rp17.000.000");
                System.out.println("SPP      = Rp1.000.000");
            }
            else if(golongan.equalsIgnoreCase("c")){
                System.out.println("ID       = "+id);
                System.out.println("Nama     = "+nama[id-1]);
                System.out.println("Jalur    = "+jalur);
                System.out.println("Kategori = "+golongan);
                System.out.println("Alamat   = "+alamat[id-1]);
                System.out.println("DSP      = Rp35.000.000");
                System.out.println("SPP      = Rp2.000.000");
            }
        }
        if(jalur.equalsIgnoreCase("mandiri")){
            if(golongan.equalsIgnoreCase("a")){
                System.out.println("ID       = "+id);
                System.out.println("Nama     = "+nama[id-1]);
                System.out.println("Jalur    = "+jalur);
                System.out.println("Kategori = "+golongan);
                System.out.println("Alamat   = "+alamat[id-1]);
                System.out.println("DSP      = Rp10.000.000");
                System.out.println("SPP      = Rp1.000.000");
            }
            else if(golongan.equalsIgnoreCase("b")){
                System.out.println("ID       = "+id);
                System.out.println("Nama     = "+nama[id-1]);
                System.out.println("Jalur    = "+jalur);
                System.out.println("Kategori = "+golongan);
                System.out.println("Alamat   = "+alamat[id-1]);
                System.out.println("DSP      = Rp25.000.000");
                System.out.println("SPP      = Rp2.000.000");
            }
            else if(golongan.equalsIgnoreCase("c")){
                System.out.println("ID       = "+id);
                System.out.println("Nama     = "+nama[id-1]);
                System.out.println("Jalur    = "+jalur);
                System.out.println("Kategori = "+golongan);
                System.out.println("Alamat   = "+alamat[id-1]);
                System.out.println("DSP      = Rp50.000.000");
                System.out.println("SPP      = Rp3.000.000");
            }
        }
    }
}
