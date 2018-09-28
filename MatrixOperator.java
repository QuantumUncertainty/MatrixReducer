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
        if(this.rows != this.columns){
            if(this.rows > this.columns){
                if(rowToReplace == 1 && row2 == 2){
                    for(int i = 0; i < matrix[0].length; i++){
                        matrix[0][i] += (multiple * matrix[1][i]);
                    }                 
                }        
                else if(rowToReplace == 1 && row2 == 3){
                    for(int i = 0; i < matrix[0].length; i++){
                        matrix[0][i] += (multiple * matrix[2][i]);
                    }
                }
                else if(rowToReplace == 1 && row2 == 4){
                    for(int i = 0; i < matrix[0].length; i++){
                        matrix[0][i] += (multiple * matrix[3][i]);
                    }
                }
                else if(rowToReplace == 2 && row2 == 1){
                    for(int i = 0; i < matrix[0].length; i++){
                        matrix[1][i] += (multiple * matrix[0][i]);
                    }                       
                }        
                else if(rowToReplace == 2 && row2 == 3){
                    for(int i = 0; i < matrix[0].length; i++){
                        matrix[1][i] += (multiple * matrix[2][i]);
                    }
                } 
                else if(rowToReplace == 2 && row2 == 4){
                    for(int i = 0; i < matrix[0].length; i++){
                        matrix[1][i] += (multiple * matrix[3][i]);
                    }
                }
                else if(rowToReplace == 3 && row2 == 1){
                    for(int i = 0; i < matrix[0].length; i++){
                        matrix[2][i] += (multiple * matrix[0][i]);
                    }
                }       
                else if(rowToReplace == 3 && row2 == 2){
                    for(int i = 0; i < matrix[0].length; i++){
                        matrix[2][i] += (multiple * matrix[1][i]);
                    }
                }
                else if(rowToReplace == 3 && row2 == 4){
                    for(int i = 0; i < matrix[0].length; i++){
                        matrix[2][i] += (multiple * matrix[3][i]);
                    }
                }
                else if(rowToReplace == 4 && row2 == 1){
                    for(int i = 0; i < matrix[0].length; i++){
                        matrix[3][i] += (multiple * matrix[0][i]);
                    }
                }
                else if(rowToReplace == 4 && row2 == 2){
                    for(int i = 0; i < matrix[0].length; i++){
                        matrix[3][i] += (multiple * matrix[1][i]);
                    }
                }
                else if(rowToReplace == 4 && row2 == 3){
                    for(int i = 0; i < matrix[0].length; i++){
                        matrix[3][i] += (multiple * matrix[2][i]);
                    }
                }
            }
            else{
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
    
    //do latter changes here
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
