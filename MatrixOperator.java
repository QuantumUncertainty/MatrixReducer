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
        //add more checks for nonsquare matrices, if matrix is square, no need for special checks
        if(this.rows != this.columns){
            double[] temp = new double[matrix.length]; //to preserve matrix
        
            if(row1 == 1 && row2 == 2 || row1 == 2 && row2 == 1){
                for(int i = 0; i <= matrix.length; i++){                
                    temp[i] = matrix[0][i];
                    matrix[0][i] = matrix[1][i];
                    matrix[1][i] = temp[i];
                }
            }        
            else if(row1 == 2 && row2 == 3 || row1 == 3 && row2 == 2){
                for(int i = 0; i <= matrix.length; i++){
                    temp[i] = matrix[1][i];
                    matrix[1][i] = matrix[2][i];
                    matrix[2][i] = temp[i];
                }                       
            }       
            else if(row1 == 1 && row2 == 3 || row1 == 3 && row2 == 1){
                for(int i = 0; i <= matrix.length; i++){
                    temp[i] = matrix[0][i];
                    matrix[0][i] = matrix[2][i];
                    matrix[2][i] = temp[i];
                }            
            }
            else if(row1 == 1 && row2 == 4 || row1 == 4 && row2 == 1){
                for(int i = 0; i <= matrix.length; i++){
                    temp[i] = matrix[0][i];
                    matrix[0][i] = matrix[3][i];
                    matrix[3][i] = temp[i];
                }            
            }
            else if(row1 == 2 && row2 == 4 || row1 == 4 && row2 == 2){
                for(int i = 0; i <= matrix.length; i++){
                    temp[i] = matrix[1][i];
                    matrix[1][i] = matrix[3][i];
                    matrix[3][i] = temp[i];
                }            
            }
            else if(row1 == 3 && row2 == 4 || row1 == 4 && row2 == 3){
                for(int i = 0; i <= matrix.length; i++){
                    temp[i] = matrix[2][i];
                    matrix[2][i] = matrix[3][i];
                    matrix[3][i] = temp[i];
                }            
            }
        }
        else{ //for square matrices
            double[] temp = new double[matrix.length]; //to preserve matrix
        
            if(row1 == 1 && row2 == 2 || row1 == 2 && row2 == 1){
                for(int i = 0; i < matrix.length; i++){                
                    temp[i] = matrix[0][i];
                    matrix[0][i] = matrix[1][i];
                    matrix[1][i] = temp[i];
                }
            }        
            else if(row1 == 2 && row2 == 3 || row1 == 3 && row2 == 2){
                for(int i = 0; i < matrix.length; i++){
                    temp[i] = matrix[1][i];
                    matrix[1][i] = matrix[2][i];
                    matrix[2][i] = temp[i];
                }                       
            }       
            else if(row1 == 1 && row2 == 3 || row1 == 3 && row2 == 1){
                for(int i = 0; i < matrix.length; i++){
                    temp[i] = matrix[0][i];
                    matrix[0][i] = matrix[2][i];
                    matrix[2][i] = temp[i];
                }            
            }
            else if(row1 == 1 && row2 == 4 || row1 == 4 && row2 == 1){
                for(int i = 0; i < matrix.length; i++){
                    temp[i] = matrix[0][i];
                    matrix[0][i] = matrix[3][i];
                    matrix[3][i] = temp[i];
                }            
            }
            else if(row1 == 2 && row2 == 4 || row1 == 4 && row2 == 2){
                for(int i = 0; i < matrix.length; i++){
                    temp[i] = matrix[1][i];
                    matrix[1][i] = matrix[3][i];
                    matrix[3][i] = temp[i];
                }            
            }
            else if(row1 == 3 && row2 == 4 || row1 == 4 && row2 == 3){
                for(int i = 0; i < matrix.length; i++){
                    temp[i] = matrix[2][i];
                    matrix[2][i] = matrix[3][i];
                    matrix[3][i] = temp[i];
                }            
            }    
        }
               
        return matrix;
    }
    
    //capable of handling the case of straight addition, because multiple can = 1
    public double[][] addMultiple(double[][] matrix, int rowToReplace, double multiple, int row2){
        if(this.rows != this.columns){
            if(rowToReplace == 1 && row2 == 2){
                for(int i = 0; i <= matrix.length; i++){
                    matrix[0][i] += (multiple * matrix[1][i]);
                }                 
            }        
            else if(rowToReplace == 1 && row2 == 3){
                for(int i = 0; i <= matrix.length; i++){
                    matrix[0][i] += (multiple * matrix[2][i]);
                }
            }
            else if(rowToReplace == 1 && row2 == 4){
                for(int i = 0; i <= matrix.length; i++){
                    matrix[0][i] += (multiple * matrix[3][i]);
                }
            }
            else if(rowToReplace == 2 && row2 == 1){
                for(int i = 0; i <= matrix.length; i++){
                    matrix[1][i] += (multiple * matrix[0][i]);
                }                       
            }        
            else if(rowToReplace == 2 && row2 == 3){
                for(int i = 0; i <= matrix.length; i++){
                    matrix[1][i] += (multiple * matrix[2][i]);
                }
            } 
            else if(rowToReplace == 2 && row2 == 4){
                for(int i = 0; i <= matrix.length; i++){
                    matrix[1][i] += (multiple * matrix[3][i]);
                }
            }
            else if(rowToReplace == 3 && row2 == 1){
                for(int i = 0; i <= matrix.length; i++){
                    matrix[2][i] += (multiple * matrix[0][i]);
                }
            }       
            else if(rowToReplace == 3 && row2 == 2){
                for(int i = 0; i <= matrix.length; i++){
                    matrix[2][i] += (multiple * matrix[1][i]);
                }
            }
            else if(rowToReplace == 3 && row2 == 4){
                for(int i = 0; i <= matrix.length; i++){
                    matrix[2][i] += (multiple * matrix[3][i]);
                }
            }
            else if(rowToReplace == 4 && row2 == 1){
                for(int i = 0; i <= matrix.length; i++){
                    matrix[3][i] += (multiple * matrix[0][i]);
                }
            }
            else if(rowToReplace == 4 && row2 == 2){
                for(int i = 0; i <= matrix.length; i++){
                    matrix[3][i] += (multiple * matrix[1][i]);
                }
            }
            else if(rowToReplace == 4 && row2 == 3){
                for(int i = 0; i <= matrix.length; i++){
                    matrix[3][i] += (multiple * matrix[2][i]);
                }
            }    
        }
        else{
            if(rowToReplace == 1 && row2 == 2){
                for(int i = 0; i < matrix.length; i++){
                    matrix[0][i] += (multiple * matrix[1][i]);
                }                 
            }        
            else if(rowToReplace == 1 && row2 == 3){
                for(int i = 0; i < matrix.length; i++){
                    matrix[0][i] += (multiple * matrix[2][i]);
                }
            }
            else if(rowToReplace == 1 && row2 == 4){
                for(int i = 0; i < matrix.length; i++){
                    matrix[0][i] += (multiple * matrix[3][i]);
                }
            }
            else if(rowToReplace == 2 && row2 == 1){
                for(int i = 0; i < matrix.length; i++){
                    matrix[1][i] += (multiple * matrix[0][i]);
                }                       
            }        
            else if(rowToReplace == 2 && row2 == 3){
                for(int i = 0; i < matrix.length; i++){
                    matrix[1][i] += (multiple * matrix[2][i]);
                }
            } 
            else if(rowToReplace == 2 && row2 == 4){
                for(int i = 0; i < matrix.length; i++){
                    matrix[1][i] += (multiple * matrix[3][i]);
                }
            }
            else if(rowToReplace == 3 && row2 == 1){
                for(int i = 0; i < matrix.length; i++){
                    matrix[2][i] += (multiple * matrix[0][i]);
                }
            }       
            else if(rowToReplace == 3 && row2 == 2){
                for(int i = 0; i < matrix.length; i++){
                    matrix[2][i] += (multiple * matrix[1][i]);
                }
            }
            else if(rowToReplace == 3 && row2 == 4){
                for(int i = 0; i < matrix.length; i++){
                    matrix[2][i] += (multiple * matrix[3][i]);
                }
            }
            else if(rowToReplace == 4 && row2 == 1){
                for(int i = 0; i < matrix.length; i++){
                    matrix[3][i] += (multiple * matrix[0][i]);
                }
            }
            else if(rowToReplace == 4 && row2 == 2){
                for(int i = 0; i < matrix.length; i++){
                    matrix[3][i] += (multiple * matrix[1][i]);
                }
            }
            else if(rowToReplace == 4 && row2 == 3){
                for(int i = 0; i < matrix.length; i++){
                    matrix[3][i] += (multiple * matrix[2][i]);
                }
            }    
        }
                                    
        return matrix;
    }
      
    public double[][] multiply(double[][] matrix, int row, double multiple){
        switch (row) {
            case 1:
                for(int i = 0; i < matrix.length; i++){
                    matrix[0][i] = (multiple * matrix[0][i]);
                }   break;
            case 2:
                for(int i = 0; i < matrix.length; i++){
                    matrix[1][i] = (multiple * matrix[1][i]);
                }   break;
            case 3:
                for(int i = 0; i < matrix.length; i++){
                    matrix[2][i] = (multiple * matrix[2][i]);
                }   break;
            case 4:
                for(int i = 0; i < matrix.length; i++){
                    matrix[3][i] = (multiple * matrix[3][i]);
                }   break;
            default:
                break;
        }
        
        return matrix;
    }
    
}
