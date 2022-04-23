/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasinheritance;

/**
 *
 * @author Fonda
 */
public class Admin{
    private String nama;
    private String jeniskelamin;
    private String id;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getJenisKelamin(){
        return jeniskelamin;
    }
    public void setJenisKelamin(String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
}