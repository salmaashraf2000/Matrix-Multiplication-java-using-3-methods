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

public class ParallelGroupMultiplier {
    
    private static final int NO_Threads=10;
    
    
    public static void multiply(int[][] result, int[][] matrix1, int[][] matrix2)
    {
        int repeat=0; 
        int rows_Threads=0;
        int rem=0;
        
        if(matrix1.length<=NO_Threads)
         {
            repeat=matrix1.length;
         }else
        {
            rows_Threads=matrix1.length/NO_Threads;
            rem=matrix1.length%NO_Threads;  
            repeat=NO_Threads;
        }
         int x=0;
         List<Thread> threads = new ArrayList<>();
         for(int i=0;i<repeat;i++)
         {
            GroupMultiplierTask GMT = new GroupMultiplierTask(result,matrix1,matrix2,x,x+rows_Threads+rem);
            Thread T = new Thread(GMT);
            T.start();
            threads.add(T);
            
            
            if(threads.size()==10){
                waitForThreads(threads);
                threads.clear();
            }
            x=x+rows_Threads+rem+1;
            rem=0;
        }
    };
    //stop making new threads if current threads runnig is 10 must wait for threads to finish
    protected static void waitForThreads(List<Thread> threads) 
    {
        
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