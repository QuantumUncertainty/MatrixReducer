package matrixtools.implementations;
import matrixtools.interfaces.MatrixReductions;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MatrixReducer implements MatrixReductions {
    private final double[][] matrix;
    private final int rows;
    private final int columns;

    public MatrixReducer(double[][] matrix, int rows, int columns){
        this.matrix = matrix;
        this.rows = rows;
        this.columns = columns;
    }

    public double[][] toReducedRowEchelonForm(){
        int row = 0, column = 0, pivotRow = 0;
        double multiple;

        while(row < rows){
            if(matrix[row][column] == 0){
                swapRows(row, row + 1);
            }
            else if(matrix[row][column] != 0 && matrix[row][column] != 1){
                multiple = 1.0/matrix[row][column];
                multiply(row, multiple);
                pivotRow = row;
            }

            putZerosInRemainingEntries(pivotRow);
            column++;
            row++;
        }

        return matrix;
    }

    public double[][] toRowEchelonForm(){
        throw new NotImplementedException();
    }

    public double[][] toUpperTriangular(){
        throw new NotImplementedException();
    }

    public double[][] toLowerTriangular(){
        throw new NotImplementedException();
    }

    //this method is giving an error for custom matrices
    public double[][] swapRows(int row1, int row2){
        double[] temp = new double[columns];

        for(int i = 0; i < columns; i++){
            temp[i] = matrix[row1][i];
            matrix[row1][i] = matrix[row2][i];
            matrix[row2][i] = temp[i];
        }

        return matrix;
    }

    //capable of handling the case of straight addition, because multiple can = 1
    public double[][] addMultiple(int rowToReplace, double multiple, int row2){
        for(int i = 0; i < columns; i++){
            matrix[rowToReplace][i] += (multiple * matrix[row2][i]);
        }

        return matrix;
    }

    public double[][] multiply(int row, double multiple){
        for(int i = 0; i < columns; i++){
            matrix[row][i] = (multiple * matrix[row][i]);
        }

        return matrix;
    }

    //does row operation II to get 0's beneath pivot entries
    public double[][] putZerosInRemainingEntries(int pivotRow){
        double multiple;
        for(int i = 0; i < rows; i++){
            if(i != pivotRow){
                multiple = -(matrix[i][pivotRow]);
                for(int j = 0; j < columns; j++){
                    matrix[i][j] += (multiple * matrix[pivotRow][j]);
                }
            }
        }

        return matrix;
    }
}
