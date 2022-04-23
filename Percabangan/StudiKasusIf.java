/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produktif;

/**
 *
 * @author Fonda
 */
import java.util.Scanner;
public class StudiKasusIf {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai");
        int nilai;
        nilai = input.nextInt();
        
        if(nilai >75){
            System.out.println("HEBAT");
        }else{
            System.out.println("Anda Remidi");
        }
    }
}
