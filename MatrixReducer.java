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
        Scanner reader = new Scanner(System.in);      
        int input;
        
        showOptions();
        input = reader.nextInt();
        switch (input) {
            case 1:
                toReducedRowEchelonForm();
                break;
            case 2:
                toRowEchelonForm();
                break;
            default:
                interactiveReducer();
                break;
        }
    }
   
    //handles initial inputs and what not
    public static double[][] matrixDims(){
        Scanner reader = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Enter dimensions of matrix (M x N)");
        System.out.println("Rows: ");
        int rows = reader.nextInt();
        System.out.println("Columns: ");
        int columns = reader.nextInt();
        System.out.println();
        
        double dimensions[][] = new double[rows][columns];
        return dimensions;
    }
    
    //handles to RREF
    public static void toReducedRowEchelonForm(){
        double[][] matrix = MatrixGenerator.newMatrix(matrixDims());
        MatrixOperator operator = new MatrixOperator(matrix, matrix.length, matrix[0].length);
        System.out.println();
        System.out.println("Initial matrix: ");
        printMatrix(matrix);
        
        int row = 0, column = 0;
        double multiple = 0.0;
        //more or less working, final column not getting hit
        while(row < matrix.length){
            if(matrix[row][column] == 0){
                operator.swapRows(matrix, row, row + 1);
            }
            else if(matrix[row][column] != 0 && matrix[row][column] != 1){
                multiple = 1.0/matrix[row][column];
                operator.multiply(matrix, row, multiple);
            }
            
            operator.putZerosInRemainingEntries(matrix, column);
            System.out.println("Matrix after iteration " + row + ": ");
            printMatrix(matrix);
            column++;   
            row++;  
        } 
        
        System.out.println("Result: ");
        printMatrix(matrix);
    }
    
    //handles to REF
    public static void toRowEchelonForm(){
        
    }
    
    //handles interactive matrix selection
    public static void interactiveReducer(){
        double[][] matrix = MatrixGenerator.newMatrix(matrixDims());
        printMatrix(matrix);
        
        Scanner reader = new Scanner(System.in);
        MatrixOperator operator = new MatrixOperator(matrix, matrix.length, matrix[0].length);
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
                    row1 = reader.nextInt() - 1;
                    row2 = reader.nextInt() - 1;
                    operator.swapRows(matrix, row1, row2);
                    System.out.println();
                    printMatrix(matrix);
                    break;
                case 2:
                    System.out.println("Enter the row you want to replace: ");
                    rowToReplace = reader.nextInt() - 1;
                    System.out.println();
                    System.out.println("Enter the number to multiply by and the row to multiply: ");
                    multiple = reader.nextDouble();
                    rowToMultiply = reader.nextInt() - 1;
                    System.out.println();
                    operator.addMultiple(matrix, rowToReplace, multiple, rowToMultiply);
                    System.out.println();
                    printMatrix(matrix);
                    break;
                case 3:
                    System.out.println("Enter the row you want to multiply: ");
                    rowToMultiply = reader.nextInt() - 1;
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
        
    public static void showOperations(){
        System.out.println("Possible row operations: ");
        System.out.println("1) Swap two rows");
        System.out.println("2) Add a multiple of one row to another");
        System.out.println("3) Multiply a row by a nonzero integer/rational");
        System.out.println();
    }
    
    public static void showOptions(){
        System.out.println("Things I can do: (use shown numbers to navigate)");
        System.out.println("1) Go directly to reduced row echelon form");
        System.out.println("2) Go directly to row echelon form");
        System.out.println("3) Interactive operations");
        System.out.println();
    }
    
    public static void printMatrix(double[][] matrix){        
        for (double[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix1[j] + " ");                
            }
            System.out.println();
        }
              
        System.out.println();
    }    
}
