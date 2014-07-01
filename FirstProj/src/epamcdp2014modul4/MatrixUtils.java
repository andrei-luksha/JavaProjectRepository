package epamcdp2014modul4;

import java.util.Scanner;

/**
 * Created by Andrei_Luksha on 6/30/2014.
 */
public class MatrixUtils {
    public static int[][] createMatrix(int m, int n){
        int[][] matrix = new int[m][n];
        for (int i=0; i<m; i++ ){
            for(int j=0; j<n; j++){
                System.out.print("please enter element of matrix: " + "[" + i + ";" + j + "]: ");
                Scanner scanner=new Scanner(System.in);
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
      //  int[][] pr_matrix=matrix;

        int m=matrix.length;
        int n =matrix[1].length;

        for (int i=0; i<m; i++ ){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] transpotionMatrix(int[][] matrix) {
        int m=matrix.length;
        int n =matrix[1].length;
        System.out.println("m= " + m + ", n= " + n);
        System.out.println("Transpotioned matrix is: ");


        for (int i = 0; i<m; i++) {
            for (int j = i+1; j<n; j++) {
                int temp = matrix[i][j];
               // System.out.println("temp= " + temp);
                matrix[i][j] = matrix[j][i];
              //  System.out.println("i= " + i + ";" + "j= " + j);
                matrix[j][i] = temp;
            }
        }
        int [][] trMatrix = matrix;
        return trMatrix;

    }
}
