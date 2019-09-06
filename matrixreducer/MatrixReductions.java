package matrixreducer;

public interface MatrixReductions {
    public double[][] toReducedRowEchelonForm(double[][] matrix);
    public double[][] toRowEchelonForm(double[][] matrix);
    public double[][] toUpperTriangular(double[][] matrix);
    public double[][] toLowerTriangular(double[][] matrix);
    public double[][] swapRows(double[][] matrix);
    public double[][] addMultiple(double[][] matrix);
    public double[][] multiply(double[][] matrix);
}
