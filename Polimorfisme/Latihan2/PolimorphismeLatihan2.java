/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphisme.latihan.pkg2;

/**
 *
 * @author Fonda
 */
public class PolimorphismeLatihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garis jalan = new Garis(2.5,3,4,5);
        Garis pertama = new Garis(3,4,5,6);
        jalan.getLength();
        
        System.out.println(jalan.isGreater(jalan, pertama));
    }
    
}
