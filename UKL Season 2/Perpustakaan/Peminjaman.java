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
public class Peminjaman {
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
    public Buku buku = new Buku();
    public Siswa siswa = new Siswa();
    
    public Peminjaman(){
        for(int i=0;i<buku.size();i++){
            this.idBuku.add(i);
        }
        this.idSiswa.add(12345);
        this.idSiswa.add(54321);
    }
    
    public void setSiswa(int id){
        this.idSiswa.add(id);
    }
    public int getIDSiswa(int id){
        return this.idSiswa.indexOf(id);
    }
    
    public void setBuku(int id){
        this.idBuku.add(id);
    }

    public int getBuku(int id){
        return this.idBuku.indexOf(id);
    }
    public void setBanyak(int banyak){
        this.banyak.add(banyak);
    }
    
    public int getIDBanyak(int banyak){
        return this.banyak.indexOf(banyak);
    }
    
    public int getBanyak(int id){
        return this.banyak.get(id);
    }
}
