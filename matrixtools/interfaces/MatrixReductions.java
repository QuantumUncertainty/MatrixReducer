package matrixtools.interfaces;

public interface MatrixReductions {
    public double[][] toReducedRowEchelonForm(double[][] matrix);
    public double[][] toRowEchelonForm(double[][] matrix);
    public double[][] toUpperTriangular(double[][] matrix);
    public double[][] toLowerTriangular(double[][] matrix);
    public double[][] swapRows(double[][] matrix, int row1, int row2);
    public double[][] addMultiple(double[][] matrix, int rowToReplace, double multiple, int row2);
    public double[][] multiply(double[][] matrix, int row, double multiple);
}
