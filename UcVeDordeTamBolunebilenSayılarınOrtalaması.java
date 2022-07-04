package Giris;

import java.util.Scanner;

public class UcVeDordeTamBolunebilenSayılarınOrtalaması {
    public static void main(String[] args) {

        int n , sum = 0 , count =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi girin:");
        n = scanner.nextInt();

        for (int i=0; i<=n; i++){

            // 3 ve 4 e tam bolunmek = 12 ye tam bolunmek

            if ( i % 12 == 0 ){
                sum = sum + i;
                count = count+1;
            }


        }

        System.out.println( "ortalama : " + sum / count );

    }
}
