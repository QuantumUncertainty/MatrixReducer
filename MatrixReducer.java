/* Author: Tucker Bullara
 * Description: A program that reduces matrices per your row operation commands. 
 * The result of each operation is printed before another operation is performed.
 * Coming soon: GUI version of program, addition of features that allow the user to
 * go directly to row-echelon and reduced row-echelon form.
*/ 
package matrixreducer;

import java.util.Scanner;

public class MatrixReducer{   
    /*
    TODO:     
    1) make program more robust
    2) add direct row echelon form command
    3) add direct reduced row echelon form command 
    */
    
    public static void main(String[] args) {             
        //randomly filled matrix
        double[][] matrix1 = MatrixGenerator.newMatrix(matrixDims());       
        //not getting correct operation check, probably bc this.columns not correct
        System.out.println();
        printMatrix(matrix1);        
        operate(matrix1);              
    }
    
    public static void operate(double[][] matrix){
        Scanner reader = new Scanner(System.in);
        
        MatrixOperator operator = new MatrixOperator(matrix, matrix.length, matrix[0].length);
        //necessary parameters for operations
        int row1, row2, rowToReplace, rowToMultiply, operation;
        double multiple;
        
        showOperations();
        System.out.println("Enter 4 to show operations");
        System.out.println("Enter the number of the row operation you want me to perform or 0 to quit: ");
        operation = reader.nextInt();
        
        while(operation != 0){
            switch(operation){
                case 1:
                    System.out.println("Enter number of 2 rows to swap: ");
                    row1 = reader.nextInt();
                    row2 = reader.nextInt();
                    operator.swapRows(matrix, row1, row2);
                    printMatrix(matrix);
                    break;
                case 2:
                    System.out.println("Enter the row you want to replace: ");
                    rowToReplace = reader.nextInt();
                    System.out.println("Enter the number to multiply by and the row to multiply: ");
                    multiple = reader.nextDouble();
                    rowToMultiply = reader.nextInt();
                    operator.addMultiple(matrix, rowToReplace, multiple, rowToMultiply);
                    printMatrix(matrix);
                    break;
                case 3:
                    System.out.println("Enter the row you want to multiply: ");
                    rowToMultiply = reader.nextInt();
                    System.out.println("Enter the number you want to multiply by: ");
                    multiple = reader.nextDouble();
                    operator.multiply(matrix, rowToMultiply, multiple);
                    printMatrix(matrix);
                    break;
                case 4:
                    showOperations();
                    break;
                default:
                    break;
            }

            System.out.println("Enter the number of the row operation you want me to perform or 0 to quit: ");
            operation = reader.nextInt();
            System.out.println();
        }              
    }
    
    //handles initial inputs and what not
    public static double[][] matrixDims(){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter dimensions of matrix [0, 4][0, 4]: ");
        System.out.println("Rows: ");
        int rows = reader.nextInt();
        System.out.println("Columns: ");
        int columns = reader.nextInt();
        System.out.println();
        
        double dimensions[][] = new double[rows][columns];
        return dimensions;
    }
        
    public static void showOperations(){
        System.out.println("Possible row operations: ");
        System.out.println("1) Swap two rows");
        System.out.println("2) Add a multiple of one row to another");
        System.out.println("3) Multiply a row by a nonzero integer/rational");
        System.out.println();
    }
    
    public static void printMatrix(double[][] matrix){        
        if(matrix.length != matrix[0].length){
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j <= matrix.length; j++){
                    System.out.print(matrix[i][j] + " ");                
                }
                System.out.println();
            }
        }
        else{
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix.length; j++){
                    System.out.print(matrix[i][j] + " ");                
                }
                System.out.println();
            }
        }
              
        System.out.println();
    }    
}
