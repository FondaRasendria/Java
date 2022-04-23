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
public class Vaksin {
     public static void main(String[] args){
         int umur = 51;
         if(umur >= 50){
             System.out.println("Boleh vaksin tapi aman dari penyakit umur");
         }
         else if(umur >= 12){
             System.out.println("Boleh Vaksin");
         }
         else{
             System.out.println("Maaf anda masih bocil");
         }
     }
}
