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
    public int determinant() {
        return 0;
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

    @Override
    public int norm() {
        return 0;
    }

    @Override
    public int trace() {
        return 0;
    }
}
