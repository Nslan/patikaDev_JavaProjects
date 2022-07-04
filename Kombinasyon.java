package Giris;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        /** Ödev
         * N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir
         * Java ile kombinasyon hesaplayan program yazınız.
         *
         * Kombinasyon formülü
         * C(n,r) = n! / (r! * (n-r)!)
         *
         * **/

        int valueN , valueR ,factorielN = 1 , factorielR =1 , factorielNR = 1 , temp , result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kombinasyon C(n,r) islemi icin:");

        System.out.print("N degerini gir:");
        valueN = scanner.nextInt();

        System.out.print("R degerini gir:");
        valueR = scanner.nextInt();

        for (int i=1; i<=valueN; i++ ){
            factorielN *= i;
        }

        for (int i=1; i<=valueR; i++ ){
            factorielR *= i;
        }

        temp = valueN - valueR;
        for (int i=1; i<=temp; i++ ){
            factorielNR *= i;
        }


        result = factorielN / ( factorielR *  factorielNR ) ;

        System.out.println("C( "+valueN+","+valueR+" )    : "+result);


    }
}
