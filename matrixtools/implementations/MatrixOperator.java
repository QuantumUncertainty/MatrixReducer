package matrixtools.implementations;
import matrixtools.interfaces.MatrixOperations;

public class MatrixOperator implements MatrixOperations {
    private final double[][] matrix;
    private final int rows;
    private final int columns;

    public MatrixOperator(double[][] matrix, int rows, int columns){
        this.matrix = matrix;
        this.rows = rows;
        this.columns = columns;
    }
    @Override
    public double determinant() {
        return 0.0;
    }

    @Override
    public double[][] transpose() {
        double[][] transposed = new double[columns][rows];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    @Override
    public double[][] inverse() {
        return null;
    }

    //need to test and add precision
    @Override
    public double matrixNorm() {
        double sum = 0.0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                sum += Math.pow(matrix[i][j], 2.0);
            }
        }

        return Math.sqrt(sum);
    }

    public double lpNorm(){
        return 0.0;
    }

    @Override
    public double trace() {
        return 0;
    }
}
