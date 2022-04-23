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
public abstract class Vehicle {
    public void function(){
            System.out.println("Tool transportation");
    }
    public void bengsin(){
        System.out.println("Bengsin");
    }
    public abstract void mengjalan();
}
