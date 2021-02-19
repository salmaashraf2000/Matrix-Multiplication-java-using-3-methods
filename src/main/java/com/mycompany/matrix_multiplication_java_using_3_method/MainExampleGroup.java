/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matrix_multiplication_java_using_3_method;


import java.util.Date;

public class MainExampleGroup {

   
    public static void main(String[] args) 
    {
        
        int matrix1[][] = {{1,2},{3,4}};
        int matrix2[][] = {{5,6},{8,10}};
        int result[][] = new int[matrix1.length][matrix2[0].length];
      
        ParallelGroupMultiplier.multiply(result,matrix1, matrix2);
       
    }
    
}
