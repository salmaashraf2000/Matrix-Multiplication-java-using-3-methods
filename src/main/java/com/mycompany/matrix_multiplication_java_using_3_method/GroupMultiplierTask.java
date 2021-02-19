/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matrix_multiplication_java_using_3_method;

public class GroupMultiplierTask extends MultiplierTask{

    private int Start_row;
    private int end_row;

    public GroupMultiplierTask(int[][] result,int[][] matrix1,int[][] matrix2,int Start_row,int end_row) 
    {
     
       super(result, matrix1,matrix2); 
       this.Start_row=Start_row;
       this.end_row=end_row;
    }
    
    @Override
    public void run()
    {
        //matrix multiplication
        for (int i = this.Start_row; i <= this.end_row; i++) 
        { 
            for (int j = 0; j < this.matrix2[0].length; j++) 
            { 
                for (int k = 0; k < this.matrix1[0].length; k++)
                { 
                    this.result[i][j] += (this.matrix1[i][k] * this.matrix2[k][j]); 
                }    
            } 
            System.out.printf("Index ["+i+" 0] "+this.result[i][0]+"\n"+"Index ["+i+" 1] "+this.result[i][1]+" \n");
        } 
    }
}