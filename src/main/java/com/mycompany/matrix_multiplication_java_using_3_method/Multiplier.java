/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matrix_multiplication_java_using_3_method;

  

import java.util.List;

public abstract class Multiplier {
    
    public abstract void multiply(int[][] matrix1, int[][] matrix2, int[][] result);
    protected abstract void waitForThreads(List<Thread> threads);
}
