/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matrix_multiplication_java_using_3_method;


public class RowMultiplierTask extends MultiplierTask{

    private int row;

    public RowMultiplierTask(int[][] result,int[][] matrix1,int[][] matrix2,int row) 
    {
       super(result, matrix1,matrix2); 
       this.row=row;
    }
    
    @Override
    public void run()
    {
        //matrix multiplication
        for(int i=0;i<this.matrix1[0].length;i++)
        {
            for(int j=0;j<this.matrix2.length;j++)
            {
                this.result[row][i]+=(this.matrix1[row][j]*this.matrix2[j][i]);
            }
           
        }
         System.out.printf("Index ["+row+" 0] "+this.result[row][0]+"  \n"+"Index ["+row+" 1] "+this.result[row][1]+" \n");
         
    }
}