/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matrix_multiplication_java_using_3_method;

public class IndividualMultiplierTask  extends MultiplierTask
{

    private int row;
    private int column;

    public IndividualMultiplierTask(int[][] result,int[][] matrix1,int[][] matrix2,int row,int column) 
    {
       super(result, matrix1,matrix2); 
       this.row=row;
       this.column=column;
    }
    
    @Override
    public void run()
    {
        //matrix multiplication
        for(int i=0;i<this.matrix1[0].length;i++)
        {
            this.result[row][column]+=(this.matrix1[row][i]*this.matrix2[i][column]);
        }
         System.out.printf(" index ["+row+" "+column+"] "+this.result[row][column]+" \n");
    }
}