package matrixreducer;

public class MatrixAlgorithms {
    private MatrixAlgorithms(){}
    
    public static double[][] toReducedRowEchelonFormTest1(){
        double[][] matrix = {{6, 5, 1, 4},{4, 2, -1, 1},{5, 9, 3, -4},{4, 7, 8, 1}};
        MatrixOperator operator = new MatrixOperator(matrix, matrix.length, matrix[0].length);
               
        int row = 0, column = 0;
        double multiple = 0.0;
        //more or less working, final column doesn't seem to be getting correct values
        while(row < matrix.length){
            if(matrix[row][column] == 0){
                operator.swapRows(matrix, row, row + 1);
            }
            else if(matrix[row][column] != 0 && matrix[row][column] != 1){
                multiple = 1.0/matrix[row][column];
                operator.multiply(matrix, row, multiple);
            }
            
            operator.putZerosInRemainingEntries(matrix, column);                        
            column++;   
            row++;  
        } 
        
        return matrix;
    }
    
    //all tests following this comment need to be implemented
    public static double[][] toReducedRowEchelonFormTest2(){
        double[][] matrix = {{}};
        MatrixOperator operator = new MatrixOperator(matrix, matrix.length, matrix[0].length);
        
        int row = 0, column = 0;
        double multiple = 0.0;
        //more or less working, final column doesn't seem to be getting correct values
        while(row < matrix.length){
            if(matrix[row][column] == 0){
                operator.swapRows(matrix, row, row + 1);
            }
            else if(matrix[row][column] != 0 && matrix[row][column] != 1){
                multiple = 1.0/matrix[row][column];
                operator.multiply(matrix, row, multiple);
            }
            
            operator.putZerosInRemainingEntries(matrix, column);                        
            column++;   
            row++;  
        }
        
        return matrix;
    }
    
    public static double[][] toReducedRowEchelonFormTest3(){
        double[][] matrix = {{}};
        MatrixOperator operator = new MatrixOperator(matrix, matrix.length, matrix[0].length);
        
        int row = 0, column = 0;
        double multiple = 0.0;
        //more or less working, final column doesn't seem to be getting correct values
        while(row < matrix.length){
            if(matrix[row][column] == 0){
                operator.swapRows(matrix, row, row + 1);
            }
            else if(matrix[row][column] != 0 && matrix[row][column] != 1){
                multiple = 1.0/matrix[row][column];
                operator.multiply(matrix, row, multiple);
            }
            
            operator.putZerosInRemainingEntries(matrix, column);                        
            column++;   
            row++;  
        }
        
        return matrix;
    }
    
    public static double[][] toReducedRowEchelonFormTest4(){
        double[][] matrix = {{}};
        MatrixOperator operator = new MatrixOperator(matrix, matrix.length, matrix[0].length);
        
        int row = 0, column = 0;
        double multiple = 0.0;
        //more or less working, final column doesn't seem to be getting correct values
        while(row < matrix.length){
            if(matrix[row][column] == 0){
                operator.swapRows(matrix, row, row + 1);
            }
            else if(matrix[row][column] != 0 && matrix[row][column] != 1){
                multiple = 1.0/matrix[row][column];
                operator.multiply(matrix, row, multiple);
            }
            
            operator.putZerosInRemainingEntries(matrix, column);                        
            column++;   
            row++;  
        }
        
        return matrix;
    }
    
    public static double[][] toReducedRowEchelonFormTest5(){
        double[][] matrix = {{}};
        MatrixOperator operator = new MatrixOperator(matrix, matrix.length, matrix[0].length);
        
        int row = 0, column = 0;
        double multiple = 0.0;
        //more or less working, final column doesn't seem to be getting correct values
        while(row < matrix.length){
            if(matrix[row][column] == 0){
                operator.swapRows(matrix, row, row + 1);
            }
            else if(matrix[row][column] != 0 && matrix[row][column] != 1){
                multiple = 1.0/matrix[row][column];
                operator.multiply(matrix, row, multiple);
            }
            
            operator.putZerosInRemainingEntries(matrix, column);                        
            column++;   
            row++;  
        }
        
        return matrix;
    }
    
    public static double[][] toReducedRowEchelonFormTest6(){
        double[][] matrix = {{}};
        MatrixOperator operator = new MatrixOperator(matrix, matrix.length, matrix[0].length);
        
        int row = 0, column = 0;
        double multiple = 0.0;
        //more or less working, final column doesn't seem to be getting correct values
        while(row < matrix.length){
            if(matrix[row][column] == 0){
                operator.swapRows(matrix, row, row + 1);
            }
            else if(matrix[row][column] != 0 && matrix[row][column] != 1){
                multiple = 1.0/matrix[row][column];
                operator.multiply(matrix, row, multiple);
            }
            
            operator.putZerosInRemainingEntries(matrix, column);                        
            column++;   
            row++;  
        }
        
        return matrix;
    }
}