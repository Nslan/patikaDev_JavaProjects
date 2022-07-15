package Giris.GAMES.MayınTarlası;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int row , col ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\t\tMayin Tarlasi Oyununa Hosgeldiniz!");
        System.out.println();
        System.out.println("Oyun Kurallari!");
        System.out.println("\n- --> Secilmemis nokta"
                +"\n# --> Mayin"
                +"\n$ --> etraf bos"
                +"\nnumber -> etrafindaki mayin sayisi"
                +"\n\ngosterir.");
        System.out.println();
        System.out.println("Satir sayisi gir : ");
        row = scanner.nextInt();
        System.out.println("Sutun sayisi gir : ");
        col = scanner.nextInt();


        MineSweeper game = new MineSweeper(row,col);

        game.run();

    }

}
