package Giris;

import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {

        int taban , kuvvet ,  result = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ussu alinacak sayi:");
        taban = scanner.nextInt();

        System.out.println("Kuvveti olacak sayi(Us):");
        kuvvet = scanner.nextInt();

        for (int i=1; i<=kuvvet;i++){
            result *= taban ;
        }

        System.out.println(taban+"^"+kuvvet+"   :  "+result);
    }
}
