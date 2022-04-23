/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Fonda
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Overloading a = new Overloading();
        OverridingB b = new OverridingB();
        System.out.println("------------------------OVERLOADING------------------------");
        System.out.println(a.getSiswa());
        System.out.println("------------------------OVERRIDING-------------------------");
        System.out.println(b.getSiswa("123"));
    }
    
}
