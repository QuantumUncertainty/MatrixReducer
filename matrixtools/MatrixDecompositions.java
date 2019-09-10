package matrixtools;

public interface MatrixDecompositions {
    public double[] getEigenvalues(double[][] matrix);
    public double[] getEigenvectors(double[][] matrix);
    public double[][] eigendecomposition(double[][] matrix);
    public double[][] luDecomposition(double[][] matrix);
    public double[][] qrDecomposition(double[][] matrix);
}
