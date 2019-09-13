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

    @Override
    public double lpNorm(int p){
        double sum = 0.0;

        if(columns > 1){
            throw new NumberFormatException("This function only operates on vectors (n x 1 matrices)");
        }
        if(p < 0){
            throw new NumberFormatException("p needs to be 0 or greater");
        }

        for(int i = 0; i < rows; i++){
            sum += Math.pow(Math.abs(matrix[i][0]),p);
        }

        return pthRoot(sum, p);
    }

    @Override
    public double trace() {
        double trace = 0.0;
        for(int i = 0; i < rows; i++){
            trace += matrix[i][i];
        }
        return trace;
    }

    private double pthRoot(double base, int p){
        return Math.pow(Math.E, Math.log(base) / p);
    }
}
