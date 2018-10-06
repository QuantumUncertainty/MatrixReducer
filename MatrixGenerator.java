package matrixreducer;

import java.util.Random;
import java.util.Scanner;


public class MatrixGenerator { 
    private MatrixGenerator(){}
    
    public static double[][] newMatrix(double[][] matrix){
        Random generator = new Random();
        Scanner reader = new Scanner(System.in);
        String choice = "";
               
        System.out.println("Random or custom matrix? Enter R for random or C for custom: ");
        choice = reader.nextLine();
        
        
        if(choice.equals("R") || choice.equals("r")){
            for (double[] matrix1 : matrix) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix1[j] = (double) generator.nextInt(10) + 1;
                }
            }
        }
        else if(choice.equals("C") || choice.equals("c")){
            System.out.println("Enter choices into matrix by row: ")
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    matrix[i][j] = (double) reader.nextInt();
                }
            }
        }
        
        System.out.println();
        System.out.println("Complete.");
        
        return matrix;                                 
    }
    
}
