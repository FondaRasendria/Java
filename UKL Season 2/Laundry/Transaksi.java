/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaundryFix;

import java.util.ArrayList;

/**
 *
 * @author Fonda
 */
public class Transaksi{
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
    public Client client = new Client();
    public JenisLaundry laundry = new JenisLaundry();
    
    public int size(){
        return this.idClient.size();
    }
    
    public Transaksi(){
        for(int i=0;i<client.size();i++){
            this.idClient.add(i);
        }
        for(int i=0;i<laundry.size();i++){
            this.idJenisLaundry.add(i);
        }
    }
    
    public void setIDClient(int id){
        this.idClient.add(id);
    }
    
    public void setIDJenisLaundry(int id){
        this.idJenisLaundry.add(id);
    }
    
    public void setBanyak(int banyak){
        this.banyak.add(banyak);
    }
    
    public int getIDClient(int id){
        return this.idClient.get(id);
    }
    
    public int getIDJenisLaundry(int id){
        return this.idJenisLaundry.get(id);
    }
    
    public int getBanyak(int id){
        return this.banyak.get(id);
    }
    
}
