/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matrix_multiplication_java_using_3_method;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParallelRowMultiplier {
    
    public static void multiply(int[][] result, int[][] matrix1,int[][] matrix2)
    {
        
        List<Thread> threads = new ArrayList<>();
         for(int i=0;i<matrix1.length;i++)
         {
            RowMultiplierTask RMT = new RowMultiplierTask(result,matrix1,matrix2,i);
            Thread T = new Thread(RMT);
            T.start();
            threads.add(T);
            
            if(threads.size()==10)
            {
                waitForThreads(threads);
                threads.clear();
            }
            
        }
    };
    //stop making new threads if current threads runnig is 10 must wait for threads to finish
    protected static void waitForThreads(List<Thread> threads) {
        for(int i = 0; i < threads.size(); i++) 
        { 
            try {
                threads.get(i).join();
            } catch (InterruptedException ex)
            {
                Logger.getLogger(ParallelGroupMultiplier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}