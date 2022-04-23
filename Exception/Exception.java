/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Fonda
 */
import java.util.Scanner;
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = 50;
        System.out.println("Masukkan Nilai B");
        int b = input.nextInt();
        System.out.println("Masukkan Nilai C");
        
        try{
            int c = input.nextInt();
            int res = c/(b-c);
            System.out.println("Hasilnya adalah = "+res);
        }
        catch(ArithmeticException e){
            System.out.println("adalah = "+ e);
        }
    }
    
}
