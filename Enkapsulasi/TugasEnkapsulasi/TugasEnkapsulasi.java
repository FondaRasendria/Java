/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasenkapsulasi;

/**
 *
 * @author Fonda
 */
public class TugasEnkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola z = new Bola();
        z.setJari(10.2);
        System.out.println("Jari-Jari      : "+ z.getJari());
        System.out.println("Diameter       : "+ z.showDiameter());
        System.out.println("Luas Permukaan : "+ z.showLuasPermukaan());
        System.out.println("Volume         : "+ z.showVolume());
    }
    
}
