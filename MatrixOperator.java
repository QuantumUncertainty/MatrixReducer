/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixreducer;

public class MatrixOperator{   
    private final double[][] matrix;
    private final int rows;
    private final int columns;
    
    public MatrixOperator(double[][] matrix, int rows, int columns){
        this.matrix = matrix;
        this.rows = rows;
        this.columns = columns;
    }  
    
    public double[][] swapRows(double[][] matrix, int row1, int row2){
        double[] temp = new double[matrix.length + 1]; //to preserve matrix (+1 may or may not be necessary)
        row1--;
        row2--;
        for(int i = 0; i < matrix.length; i++){ 
            temp[i] = matrix[row1][i];
            matrix[row1][i] = matrix[row2][i];
            matrix[row2][i] = temp[i];                         
        }
                                     
        return matrix;
    }
    
    //capable of handling the case of straight addition, because multiple can = 1
    public double[][] addMultiple(double[][] matrix, int rowToReplace, double multiple, int row2){
        rowToReplace--;
        row2--;
        for(int i = 0; i < matrix.length; i++){
            matrix[rowToReplace][i] += (multiple * matrix[row2][i]);
        }        
                                                                   
        return matrix;
    }
    
    public double[][] multiply(double[][] matrix, int row, double multiple){
        for(int i = 0; i < matrix.length; i++){
            matrix[row][i] = (multiple * matrix[row][i]);
        }
        
        return matrix;
    }
    
}
