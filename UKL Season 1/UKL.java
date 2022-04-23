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
public class UKL {
    public static void main(String[] args){
        String nama [] = {"Ali","Budi","Dani","Edi","Umar"};
        Scanner input = new Scanner(System.in);
        Scanner pilihan = new Scanner(System.in);
        Scanner gkendaraan = new Scanner(System.in);
        Scanner golongan = new Scanner(System.in);
        
        System.out.print("Masukkan id = ");
        int id = input.nextInt();
        System.out.print("Masukkan tipe cottage = ");
        String cottage = pilihan.nextLine();
        System.out.print("Masukkan golongan hari = ");
        String ghari = golongan.nextLine();
        System.out.print("Berapa hari anda akan menginap = ");
        int hari = input.nextInt();
        System.out.print("Masukkan golongan kendaraan = ");
        String kendaraan = gkendaraan.nextLine();
        
        if(cottage.equalsIgnoreCase("duku") || cottage.equalsIgnoreCase("jeruk")){
            if(ghari.equalsIgnoreCase("weekday")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*915000));
            }
            if(ghari.equalsIgnoreCase("weekend")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*1025000));
            }
            if(ghari.equalsIgnoreCase("holiday")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*1225000));
            }

        }
        if(cottage.equalsIgnoreCase("alpukat") || cottage.equalsIgnoreCase("jambu air")){
            if(ghari.equalsIgnoreCase("weekday")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*575000));
            }
            if(ghari.equalsIgnoreCase("weekend")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*695000));
            }
            if(ghari.equalsIgnoreCase("holiday")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*895000));
            }
        }
        if(cottage.equalsIgnoreCase("durian") || cottage.equalsIgnoreCase("melon")){
            if(ghari.equalsIgnoreCase("weekday")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*595000));
            }
            if(ghari.equalsIgnoreCase("weekend")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*715000));
            }
            if(ghari.equalsIgnoreCase("holiday")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*915000));
            }
        }
        if(cottage.equalsIgnoreCase("belimbing") || cottage.equalsIgnoreCase("mangga") || cottage.equalsIgnoreCase("kedondong")){
            if(ghari.equalsIgnoreCase("weekday")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*495000));
            }
            if(ghari.equalsIgnoreCase("weekend")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*575000));
            }
            if(ghari.equalsIgnoreCase("holiday")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*755000));
            }
        }
        if(cottage.equalsIgnoreCase("barrack")){
            if(ghari.equalsIgnoreCase("weekday")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*25000));
            }
            if(ghari.equalsIgnoreCase("weekend")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*25000));
            }
            if(ghari.equalsIgnoreCase("holiday")){
                System.out.println("id = "+id);
                System.out.println("nama = "+nama[id-1]);
                System.out.println("Tipe Cottage = "+cottage);
                System.out.println("Jumlah hari = "+hari);
                System.out.println("Biaya = Rp"+(hari*35000));
            }
        }
    }
}
