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
public class StudiKausArray {
    public static void main(String[] args){
        int[][] no = {{3,5,7},{13,15,17},{33,35,37},{43,45,47},{73,75,77}};
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                System.out.print(no[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
