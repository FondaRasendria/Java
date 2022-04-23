/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METIC;

/**
 *
 * @author Fonda
 */
public class Array {
        public static int max(int[]numbers){
            int highest = numbers[0];
            for (int num:numbers){
                if (num > highest){
                    highest = num;
                }
            }
            return highest;
        }
        public static void main(String[] args) {
            int[]nilai = {1,2,3,4,5,6,7,8,9,10};
            int nilaimantap = max(nilai);
            System.out.println("nilai tertinggi adalah"+nilaimantap);
        }
        
    }

