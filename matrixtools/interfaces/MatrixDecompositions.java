package matrixtools.interfaces;

public interface MatrixDecompositions {
    public double[] getEigenvalues();
    public double[] getEigenvectors();
    public double[][] eigendecomposition();
    public double[][] luDecomposition();
    public double[][] qrDecomposition();
}
