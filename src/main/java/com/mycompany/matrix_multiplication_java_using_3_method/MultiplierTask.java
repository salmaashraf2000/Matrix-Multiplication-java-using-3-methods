/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matrix_multiplication_java_using_3_method;

import java.util.List;

public abstract class MultiplierTask implements Runnable {

    protected final int[][] result;
    protected final int[][] matrix1;
    protected final int[][] matrix2;

    public MultiplierTask(
            int[][] result,
            int[][] matrix1,
            int[][] matrix2
    ) {
        
        this.result = result;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }
   
}