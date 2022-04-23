/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produktif;

import java.util.Scanner;

/**
 *
 * @author Fonda
 */
public class TugasPraktikum2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner p = new Scanner(System.in);
        double fahrenheit, celcius, reamur,kelvin;
        
        System.out.print("Masukkan Celcius = ");
        celcius = input.nextDouble();
        System.out.println("\nPilih Konversi\n1.Reamur\n2.Fahrenheit\n3.Kelvin");
        int pilihan = p.nextInt();
        
        switch(pilihan){
            case 1:
                reamur = celcius*4/5;
                System.out.println("Reamur = "+reamur);
                break;
            case 2:
                fahrenheit = ((celcius*9/5)+32);
                System.out.println("Fahrenheit = "+fahrenheit);
                break;
            case 3:
                kelvin = celcius+273.15;
                System.out.println("Kelvin = "+kelvin);
                break;
        }
    }
}
