/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpus;

import java.util.ArrayList;

/**
 *
 * @author Fonda
 */
public class Buku {
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public int size(){
        return this.namaBuku.size();
    }
    
    public Buku(){
        this.namaBuku.add("Vagabond");
        this.stok.add(4);
        this.harga.add(30000);
        
        this.namaBuku.add("Berserk");
        this.stok.add(3);
        this.harga.add(30000);
    }
    
    public String getNama(int id){
        return this.namaBuku.get(id);
    }
    public int getStok(int id){
        return this.stok.get(id);
    }
    public int getHarga(int id){
        return this.harga.get(id);
    }
    public void setNama(String nama){
        this.namaBuku.add(nama);
    }
    public void setStok(int id, int stok){
        this.stok.set(id, stok);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public void tampilkanBuku(){
        int n = this.namaBuku.size();
        for(int i = 0;i<n;i++){
            System.out.println("----------------------");
            System.out.println("Judul = "+getNama(i));
            System.out.println("Stok = "+getStok(i));
            System.out.println("Harga = "+getHarga(i));
        }
    }
}
