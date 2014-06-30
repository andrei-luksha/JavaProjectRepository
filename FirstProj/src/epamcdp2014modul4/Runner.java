package epamcdp2014modul4;

import java.util.Scanner;

/**
 * Created by Andrei_Luksha on 6/30/2014.
 */
public class Runner {

     public static void main(String[] args){

        System.out.println("Please enter count of strings");
         Scanner scanner=new Scanner(System.in);
         int strCount = scanner.nextInt();

         System.out.println("Please enter count of colums");
         int colCount = scanner.nextInt();

         int[][] matrix = new int[strCount][colCount];
         int[][] Tmatrix = new int[colCount][strCount];

         matrix[strCount][colCount]= MatrixUtils.createMatrix(strCount,colCount);
         MatrixUtils.printMatrix(matrix);

         Tmatrix[colCount][strCount]=MatrixUtils.transpotionMatrix(matrix);
         MatrixUtils.printMatrix(Tmatrix);
     }
}
