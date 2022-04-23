/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaninheritance;

/**
 *
 * @author Fonda
 */
public class Anak extends Bapak{
    String nama = "Fonda";
    int umur = 15;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void cetak(){
        System.out.println("Anak ini bersifat "+super.sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+umur+" tahun");
        System.out.println("tinggi badan "+super.TB);
        super.hobi();
    }
}
