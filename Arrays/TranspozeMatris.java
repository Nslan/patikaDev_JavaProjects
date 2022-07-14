package Giris.Arrays;

import java.util.Scanner;

public class TranspozeMatris {
    static void transpoze(int [][]mtrx , int row , int column){

        int[][] transpozeMtrx = new int[column][row];

        for (int i=0; i<row ; i++){
            
            for (int j=0; j<column ; j++){

                 transpozeMtrx[j][i] = mtrx[i][j];
            }
        }

        for ( int[] m : transpozeMtrx ) {

            for ( int n : m ) {

                System.out.print(" " + n );
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int row , col ;
        int [][] matrix;

        Scanner scan = new Scanner(System.in);

        System.out.print("row : ");
        row = scan.nextInt();
        System.out.print("col : ");
        col = scan.nextInt();

        matrix = new int[row][col];

        for (int i=0; i<row ; i++){

            for (int j=0; j<col ; j++){
                System.out.print("matris "+i+". satir "+j+". eleman");
                matrix[i][j] = scan.nextInt();
            }
            System.out.println();

        }


        for (int[] r:matrix ) {

            for ( int c : r ){
                System.out.print(" " + c );
            }
            System.out.println();
        }

        System.out.println("");

        transpoze( matrix , row , col );


    }

}
