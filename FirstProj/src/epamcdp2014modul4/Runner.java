package epamcdp2014modul4;

import java.util.Scanner;

/**
 * Created by Andrei_Luksha on 6/30/2014.
 */
public class Runner {

     public static void main(String[] args){
        System.out.println("Please enter count of strings");
         Scanner scanner=new Scanner(System.in);
         int stringsCount = scanner.nextInt();
         System.out.println("Please enter count of colums");
         int columsCount = scanner.nextInt();

         int[][] matrix = new int[stringsCount][columsCount];
         int[][] TransMatrix1 = new int[columsCount][stringsCount];

         matrix = MatrixUtils.createMatrix(stringsCount,columsCount);
         MatrixUtils.printMatrix(matrix);

         TransMatrix1=MatrixUtils.transpotionMatrix(matrix);
         MatrixUtils.printMatrix(TransMatrix1);
     }
}
