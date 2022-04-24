/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelang;

import java.util.ArrayList;
/**
 *
 * @author Fonda
 */
public class Barang extends Lelang {
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    public ArrayList<Integer> hargaTertinggi = new ArrayList<Integer>();
    public int jumlahBarang = namaBarang.size();
    
    public int getHargaTertinggi(int id){
        return this.hargaTertinggi.get(id);
    }
    
    public Barang(){
        this.namaBarang.add("Gundam Unicorn PG 1/72");
        this.hargaAwal.add(900000);
        this.status.add(true);
        
        this.namaBarang.add("Gundam Sazabi MG 1/100 Ver.Ka");
        this.hargaAwal.add(400000);
        this.status.add(true);
        for(int i = 0;i<jumlahBarang;i++){
            hargaTertinggi.add(hargaAwal.get(i));
        }
    }
    public void gantiHargaAwal(int id,int harga){
        this.hargaAwal.set(id,harga);
    }
    public void setIdMasyarakat(int idMasyarakat){
        this.idMasyarakat.add(idMasyarakat);
    }
    public int getIdMasyarakat(int id){
        return idMasyarakat.get(id);
    }
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    public String getNamaBarang(int id){
        return this.namaBarang.get(id);
    }
    public void setHargaAwal(int hargaAwal){
        this.hargaAwal.add(hargaAwal);
    }
    public int getHargaAwal(int id){
        return this.hargaAwal.get(id);
    }
    public void setStatus(boolean status){
        this.status.add(status);
    }
    public boolean getStatus(int id){
        return this.status.get(id);
    }
    public void tampilBarang(){
        int n = namaBarang.size();
        for(int i = 0;i < n;i++){
            System.out.println("---------------------------");
            System.out.println("ID = "+namaBarang.indexOf(getNamaBarang(i)));
            System.out.println("Nama Barang = "+getNamaBarang(i));
            System.out.println("Harga Awal = "+getHargaAwal(i));
            System.out.println("Dapat Dilelang = "+getStatus(i));
            System.out.println("----------------------------");
            System.out.println("");
        }
    }
}
