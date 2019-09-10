package matrixtools.interfaces;

public interface MatrixReductions {
    public double[][] toReducedRowEchelonForm();
    public double[][] toRowEchelonForm();
    public double[][] toUpperTriangular();
    public double[][] toLowerTriangular();
    public double[][] swapRows(int row1, int row2);
    public double[][] addMultiple(int rowToReplace, double multiple, int row2);
    public double[][] multiply(int row, double multiple);
}
