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
public class UKL5 {
    public static void main(String[] args){
        int a [][]={{2,5},{3,3}};
        int b [][]={{1,3},{5,4}};
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[i][j]+b[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
