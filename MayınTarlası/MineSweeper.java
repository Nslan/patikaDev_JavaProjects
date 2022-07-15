package Giris.GAMES.MayınTarlası;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int row ;
    int col ;
    int [][] map;
    int [][] board;

    char[][] convertBoard;
    int size;
    int mayinSayisi;

    boolean game = true;

    Random random;
    Scanner scanner ;

    MineSweeper(int Row , int column){

        this.row = Row;
        this.col = column;

        this.map = new int[ row ][ col ];
        this.board = new int[ row ][ col ];
        this.convertBoard = new char[ row ][ col ];

        this.size = row * col ;
        this.mayinSayisi = ( row * col ) / 4 ;

        random = new Random();
        scanner = new Scanner(System.in);

    }

    public void  run(){
        configureGame();
        print(map);
        convert();
        start();
    }

    public void configureGame(){

        int randRow , randColumn , count=0 ;

        while ( count != (mayinSayisi) ){

            randRow = random.nextInt( row );
            randColumn = random.nextInt( col );

            if ( map[randRow][randColumn] != -1 ){

                map[randRow][randColumn] = -1;
                count++;
            }

        }


    }

    public void start( ){

        int selectRow , selectColumn , success = 0;
        System.out.println("Start GAME!");

        while (game){
            //print(board);
            prints(convertBoard);
            System.out.print("Select row : ");
            selectRow = scanner.nextInt();
            System.out.print("Select column : ");
            selectColumn = scanner.nextInt();

            if ( selectRow < 0 || selectColumn < 0 || selectRow >= row ||selectColumn >= col ){
                System.out.println("Gecersiz Koordinat !");
                continue;
            }


            if ( map[selectRow][selectColumn] != -1 ){
                checkIt(selectRow,selectColumn);
                success++;
                if ( success == (size - mayinSayisi ) ){
                    prints(convertBoard);
                    System.out.println("Kazandiniz!");
                    break;
                }

            }
            else {
                game = false;
                convertBoard[selectRow][selectColumn] = (char) ('#');
                prints(convertBoard);
                System.out.println("GAME OVER!");
            }


        }

    }

    public void checkIt(int selectedRow, int selectedColumn){

        int sayi;
        if ( map[selectedRow][selectedColumn] == 0 ){

            // sag yok
            if ( ( selectedColumn < col - 1 ) && map[selectedRow][selectedColumn+1] == -1 ){
                board[selectedRow][selectedColumn]++;
                sayi = board[selectedRow][selectedColumn];
                convertBoard[selectedRow][selectedColumn] = (char) (sayi + '0');
            }
            if ( ( selectedRow < row -1 ) && map[selectedRow+1][selectedColumn]  == -1 ){
                board[selectedRow][selectedColumn]++;
                sayi = board[selectedRow][selectedColumn];
                convertBoard[selectedRow][selectedColumn] = (char) (sayi + '0');
            }
            // yukarı yok
            if ( ( selectedRow > 0 ) && map[selectedRow-1][selectedColumn] == -1 ){
                board[selectedRow][selectedColumn]++;
                sayi = board[selectedRow][selectedColumn];
                convertBoard[selectedRow][selectedColumn] = (char) (sayi + '0');
            }
            //sol yok
            if ( ( selectedColumn > 0 ) && map[selectedRow][selectedColumn-1] == -1 ){
                board[selectedRow][selectedColumn]++;
                sayi = board[selectedRow][selectedColumn];
                convertBoard[selectedRow][selectedColumn] = (char) (sayi + '0') ;
            }
            //etrafta mayin yoksa
            if ( board[selectedRow][selectedColumn] == 0){
                board[selectedRow][selectedColumn] = -2 ;
                convertBoard[selectedRow][selectedColumn] = (char) ('$');
            }

        }

    }

    public void print(int[][] array){

        for (int[] i : array){

            for (int j: i) {

                if ( j >= 0){//pozitifse
                    System.out.print(" ");
                }
                System.out.print(j+"    ");

            }
            System.out.println();
        }

    }

    public void convert(){

        for (int i=0; i<row; i++){

            for (int j=0; j<col; j++) {
                   convertBoard[i][j] = '-';
            }
        }
        System.out.println();
    }



    void prints(char[][] array ){

        for (char[] i : array){

            for (char j: i) {

                if ( j >= 0){//pozitifse
                    System.out.print(" ");
                }
                System.out.print(j+"    ");

            }
            System.out.println();
        }

    }











}



