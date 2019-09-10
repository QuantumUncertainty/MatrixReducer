package matrixtools;
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

    public double[][] toReducedRowEchelonForm(double[][] matrix){
        int row = 0, column = 0, pivotRow = 0;
        double multiple;

        while(row < matrix.length){
            if(matrix[row][column] == 0){
                swapRows(matrix, row, row + 1);
            }
            else if(matrix[row][column] != 0 && matrix[row][column] != 1){
                multiple = 1.0/matrix[row][column];
                multiply(matrix, row, multiple);
                pivotRow = row;
            }

            putZerosInRemainingEntries(matrix, pivotRow);
            column++;
            row++;
        }

        return matrix;
    }

    public double[][] toRowEchelonForm(double[][] matrix){
        throw new NotImplementedException();
    }

    public double[][] toUpperTriangular(double[][] matrix){
        throw new NotImplementedException();
    }

    public double[][] toLowerTriangular(double[][] matrix){
        throw new NotImplementedException();
    }

    public double[][] swapRows(double[][] matrix, int row1, int row2){
        double[] temp = new double[this.columns];

        for(int i = 0; i < this.columns; i++){
            temp[i] = matrix[row1][i];
            matrix[row1][i] = matrix[row2][i];
            matrix[row2][i] = temp[i];
        }

        return matrix;
    }

    //capable of handling the case of straight addition, because multiple can = 1
    public double[][] addMultiple(double[][] matrix, int rowToReplace, double multiple, int row2){
        for(int i = 0; i < this.columns; i++){
            matrix[rowToReplace][i] += (multiple * matrix[row2][i]);
        }

        return matrix;
    }

    public double[][] multiply(double[][] matrix, int row, double multiple){
        for(int i = 0; i < this.columns; i++){
            matrix[row][i] = (multiple * matrix[row][i]);
        }

        return matrix;
    }

    //does row operation II to get 0's beneath pivot entries
    public double[][] putZerosInRemainingEntries(double[][] matrix, int pivotRow){
        double multiple;
        for(int i = 0; i < this.rows; i++){
            if(i != pivotRow){
                multiple = -(matrix[i][pivotRow]);
                for(int j = 0; j < this.columns; j++){
                    matrix[i][j] += (multiple * matrix[pivotRow][j]);
                }
            }
        }

        return matrix;
    }
}
