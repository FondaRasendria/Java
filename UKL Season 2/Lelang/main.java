/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelang;

/**
 *
 * @author Fonda
 */

import java.util.Scanner;
public class main {
    static Masyarakat masyarakat = new Masyarakat();
    static Petugas petugas = new Petugas();
    static Lelang lelang = new Lelang();
    static Barang barang = new Barang();
    static Scanner input = new Scanner(System.in);
    
    
    public static void main(String[] args){
        boolean tetap = true;
        String key;
        String yakin;
        System.out.println("Apakah anda punya akun?(y/n)");
        yakin = input.next();
        if(yakin.equalsIgnoreCase("y")){
            loginkan();
        }
        else if(yakin.equalsIgnoreCase("n")){
            mengdaftar();
        }
        while(tetap == true){
            System.out.println("-- Pelelangan --");
            System.out.println("1. List Barang yang Dilelang");
            System.out.println("2. List Petugas");
            System.out.println("3. List User");
            System.out.println("4. Bid");
            System.out.println("5. Jual Barang");
            System.out.println("6. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            if(menu==1){
                barang.tampilBarang();
                System.out.println("Masukkan apapun dan tekan enter");
                key = input.next();
            }
            else if(menu==2){
                petugas.tampilkanPetugas();
                System.out.println("Masukkan apapun dan tekan enter");
                key = input.next();
            }
            else if(menu==3){
                masyarakat.tampilkanUser();
                System.out.println("Masukkan apapun dan tekan enter");
                key = input.next();
            }
            else if(menu==4){
                menglelang();
                System.out.println("Masukkan apapun dan tekan enter");
                key = input.next();
            }
            else if(menu==5){
                mengjual();
                System.out.println("Masukkan apapun dan tekan enter");
                key = input.next();
            }
            else if(menu==6){
                tetap = false;
            }
        }
        
    }
    public static void loginkan(){
        System.out.println("Menglogin");
        System.out.print("ID = ");
        int id = input.nextInt();
        System.out.println("Selamat Datang "+masyarakat.getNama(id));
    }
    public static void mengdaftar(){
        String nama;
        String alamat;
        String nomor;
        Scanner masuk = new Scanner(System.in);
        System.out.println("Mengdaftar");
        System.out.println("Masukkan Nama luwh");
        nama = masuk.next();
        masyarakat.setNama(nama);
        System.out.println("Masukkan Alamat");
        alamat = masuk.next();
        masyarakat.setAlamat(alamat);
        System.out.println("Masukkan Nomor Telepon");
        nomor = masuk.next();
        masyarakat.setTelepon(nomor);
    }
    public static void menglelang(){
        System.out.println("Masukkan id barang yang ingin anda lelang");
        int nomorbarang = input.nextInt();
        
        if(barang.getStatus(nomorbarang) == true){
            System.out.println("Masukkan Harga Tawar");
            int tawaran = input.nextInt();
            if(tawaran > barang.getHargaAwal(nomorbarang)){
            barang.gantiHargaAwal(nomorbarang, tawaran);
            System.out.println("Harga "+barang.getNamaBarang(nomorbarang)+" = "+barang.getHargaAwal(nomorbarang));
            }
            else{
            System.out.println("Maaf anda memasukkan harga yang kurang dari harga awal");
            }
        }else{
            System.out.println("Maaf barang ini sudah terjual");
        }
        
    }
    public static void mengjual(){
        String nama;
        int harga;
        boolean status = true;
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan Nama Barang");
        nama = masukan.next();
        barang.setNamaBarang(nama);
        System.out.println("Masukkan Harga Awal");
        harga = masukan.nextInt();
        barang.setHargaAwal(harga);
        barang.setStatus(status);
        System.out.println("Barang Berhasil Diupload");
    }
}
