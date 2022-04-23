/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphisme.latihan.pkg1;

/**
 *
 * @author Fonda
 */
public class Airplane extends Vehicle {

    /**
     * @param args the command line arguments
     */
    @Override
    public void mengjalan(){
        System.out.println("Pesawat Terbang");
    }
    public static void main(String[] args) {
        Airplane pesawat = new Airplane();
        pesawat.function();
        pesawat.bengsin();
        pesawat.mengjalan();
    }
    
}
