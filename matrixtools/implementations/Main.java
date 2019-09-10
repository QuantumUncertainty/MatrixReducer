/* Author: Tucker Bullara
 * Description: A program that reduces matrices per your row operation commands. 
 * The result of each operation is printed before another operation is performed.
 * Coming soon: GUI version of program, addition of features that allow the user to
 * go directly to row-echelon form.
*/ 
package matrixtools.implementations;

import java.util.Scanner;

//provides a basic user interface to demonstrate the library
public class Main {
    /*
    TODO:     
    1) make program more robust
    2) add direct row echelon form command
    */    
    public static void main(String[] args) {showOptions();}

    //handles interactive matrix selection
    public static void interactiveReducer(){
        /*
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

         */
    }

    public static void showOperations(){
        System.out.println("Possible row operations: ");
        System.out.println("1) Swap two rows");
        System.out.println("2) Add a multiple of one row to another");
        System.out.println("3) Multiply a row by a nonzero integer/rational");
        System.out.println();
    }
    
    public static void showOptions(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Things I can do: (use shown numbers to navigate)");
        System.out.println("1) Matrix reductions");
        System.out.println("2) Matrix decompositions");
        System.out.println("3) Matrix operations");
        int input = reader.nextInt();
        switch(input){
            case 1:
                System.out.println("1) Reduced row echelon form");
                System.out.println("2) Row echelon form");
                System.out.println("3) Interactive reductions");
                input = reader.nextInt();
                switch(input){
                    case 1:
                        toReducedRowEchelonForm();
                        break;
                    case 2:
                        toRowEchelonForm();
                        break;
                    case 3:
                        interactiveReducer();
                        break;
                    default: break;
                }
                break;
            case 2:
                System.out.println("1) Eigendecomposition");
                System.out.println("2) LU Decomposition");
                System.out.println("3) Cholesky Decomposition");
                input = reader.nextInt();
                switch(input){
                    case 1:
                        eigendecomposition();
                        break;
                    case 2:
                        luDecomposition();
                        break;
                    case 3:
                        choleskyDecomposition();
                        break;
                    default: break;
                }
                break;
            case 3:
                System.out.println("1) Determinant");
                System.out.println("2) Norm");
                System.out.println("3) Trace");
                input = reader.nextInt();
                switch(input){
                    case 1:
                        determinant();
                        break;
                    case 2:
                        norm();
                        break;
                    case 3:
                        trace();
                        break;
                    default: break;
                }
                break;
            default:
                System.out.println("Please try again")  ;
                break;
        }

        System.out.println();
    }

    //DISCOVERED: non square matrices aren't getting completely reduced to RREF
    public static void toReducedRowEchelonForm(){
        double[][] matrix = MatrixGenerator.newMatrix(matrixDims());
        printMatrix(matrix);
        MatrixReducer reducer = new MatrixReducer(matrix, matrix.length, matrix[0].length);
        reducer.toReducedRowEchelonForm();
        printMatrix(matrix);
    }

    //handles to REF
    public static void toRowEchelonForm(){

    }
    //TODO
    public static void eigendecomposition(){}
    public static void luDecomposition(){}
    public static void choleskyDecomposition(){}
    public static void determinant(){}
    public static void trace(){}
    public static void norm(){}

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

    public static void printMatrix(double[][] matrix){     
        //to get rid of - sign in front of 0's
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == -0.0){
                    matrix[i][j] = 0.0;
                }
            }
        }

        for (double[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix1[j] + " ");                
            }
            System.out.println();
        }
              
        System.out.println();
    }    
}
