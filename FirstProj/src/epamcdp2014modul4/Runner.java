package epamcdp2014modul4;

import java.util.Scanner;

import static epamcdp2014modul4.MatrixUtils.*;

/**
 * Created by Andrei_Luksha on 6/30/2014.
 */
public class Runner {

     public static void main(String[] args){

        System.out.println("Please enter count of strings: ");
         Scanner scanner=new Scanner(System.in);
         int strCount = scanner.nextInt();
         System.out.println("Please enter count of colums: ");
         int colCount = scanner.nextInt();

         int[][] matrix = new int[strCount][colCount];
         int[][] Tmatrix = new int[colCount][strCount];

         matrix= createMatrix(strCount, colCount);

         printMatrix(matrix);

         Tmatrix= transpotionMatrix(matrix);
         printMatrix(Tmatrix);
     }
}
