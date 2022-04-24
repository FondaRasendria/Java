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
public class Lelang {
    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    
    public void setPenawar(int id){
        this.idPenawar.add(id);
    }
    public void setBarang(int id){
        this.idBarang.add(id);
    }
    public void setHargaTawar(int harga){
        this.hargaTawar.add(harga);
    }
}
