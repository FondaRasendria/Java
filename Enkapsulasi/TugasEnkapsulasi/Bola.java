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
import static java.lang.Math.PI;
public class Bola {
    private double jari;
    
    public double getJari(){
        return jari;
    }
    public void setJari(double a){
        jari = a;
    }
    public double showDiameter(){
        return jari+jari;
    }
    public double showLuasPermukaan(){
        return 4*PI*jari*jari;
    }
    public double showVolume(){
        return 4/3*PI*jari*jari*jari;
    }
}
