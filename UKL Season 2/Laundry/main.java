/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaundryFix;

/**
 *
 * @author Fonda
 */
import java.util.Scanner;
public class main {
    static Client client = new Client();
    static Petugas petugas = new Petugas();
    static Transaksi transaksi = new Transaksi();
    static JenisLaundry jenislaundry = new JenisLaundry();
    static Scanner input = new Scanner(System.in);
    static boolean tetap = true;
    static String key;
    
    public static void main(String[] args){
        System.out.println("Apakah anda sudah memiliki akun?(y/n)");
        String jawab = input.next();
        if(jawab.equalsIgnoreCase("y")){
            System.out.println("Masukkan ID Anda");
            int id = input.nextInt();
            System.out.println("Selamat Datang "+client.getNama(id));
            menu(id);
        }
        else{
            System.out.println("Masukkan Nama");
            String nama = input.next();
            client.setNama(nama);
            System.out.println("Masukkan Alamat");
            String alamat = input.next();
            client.setAlamat(alamat);
            System.out.println("Masukkan Nomor Telepon");
            String telepon = input.next();
            client.setTelepon(telepon);
            System.out.println("Masukkan saldo yang ingin anda tambahkan");
            int saldo = input.nextInt();
            client.addSaldo(saldo);
            System.out.println("Terimakasih telah mendaftar "+nama);
            int i = client.getId(nama);
            menu(i);
        }
    }
    
    public static void menu(int id){
        while(tetap){
            System.out.println("-- Laundry --");
            System.out.println("1. List Laundry");
            System.out.println("2. List Petugas");
            System.out.println("3. List Client");
            System.out.println("4. Laundry");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            if(menu==1){
                jenislaundry.tampilLaundry();
                System.out.println("Ketik apapun dan enter untuk keluar");
                key = input.next();
            }
            else if(menu==2){
                petugas.tampilPetugas();
                System.out.println("Ketik apapun dan enter untuk keluar");
                key = input.next();
            }
            else if(menu==3){
                client.tampilClient();
                System.out.println("Ketik apapun dan enter untuk keluar");
                key = input.next();
            }
            else if(menu==4){
                jenislaundry.tampilLaundry();
                System.out.println("Masukkan Id laundry yang diinginkan");
                int laundry = input.nextInt();
                int harga = jenislaundry.getHarga(laundry-1);
                if(client.getSaldo(id)>=harga){
                    System.out.println("----------Total----------");
                    System.out.println("Jenis Laundry = "+jenislaundry.getLaundry(laundry-1));
                    System.out.println("Total Harga   = "+jenislaundry.getHarga(laundry-1));
                    System.out.println("Durasi        = "+jenislaundry.getDurasi(laundry-1)+" menit");
                    client.setSaldo(id, client.getSaldo(id)-harga);
                    System.out.println("Terimakasih telah menggunkaan jasa kami");
                    System.out.println("Ketik apapun dan enter untuk kembali");
                    key = input.next();
                }
                else{
                    System.out.println("Saldo anda tidak cukup");
                    System.out.println("Ketik apapun dan enter untuk kembali");
                    key = input.next();
                }
            }
            else if(menu==5){
                System.out.println("Sampai Jumpa Lagi");
                tetap = false;
            }
            else{
                System.out.println("Input yang anda masukkan tidak sesuai");
                System.out.println("Ketik apapun dan enter untuk kembali");
                key = input.next();
            }
        }
    }
}
