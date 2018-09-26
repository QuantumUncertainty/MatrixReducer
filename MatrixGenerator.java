/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
        //discovered: bug is being caused by the for loop. Out of bounds exception for columns > rows
        if(matrix.length != matrix[0].length){
            if(choice.equals("R") || choice.equals("r")){
                for(int i = 0; i < matrix.length; i++){
                    for(int j = 0; j < matrix[0].length; j++){
                        matrix[i][j] = (double) generator.nextInt(10) + 1;
                    }
                }
            }
            else if(choice.equals("C") || choice.equals("c")){
                System.out.println("Enter desired entries into matrix: ");
                for(int i = 0; i < matrix.length; i++){
                    for(int j = 0; j < matrix[0].length; j++){
                        matrix[i][j] = reader.nextInt();
                    }          
                }
            }
        }
        else{
            if(choice.equals("R") || choice.equals("r")){
                for(int i = 0; i < matrix.length; i++){
                    for(int j = 0; j < matrix.length; j++){
                        matrix[i][j] = (double) generator.nextInt(10) + 1;
                    }
                }
            }
            else if(choice.equals("C") || choice.equals("c")){
                System.out.println("Enter desired entries into matrix: ");
                for(int i = 0; i < matrix.length; i++){
                    for(int j = 0; j < matrix.length; j++){
                        matrix[i][j] = reader.nextInt();
                    }          
                }
            }    
        }
                    
        System.out.println();
        System.out.println("Complete.");
        
        return matrix;
    }
    
}
