package Giris;


import java.util.Scanner;

public class DongulerinFarkları {

    public static void main(String[] args) {

        /* Ama genellikle, kaç kere döneceği belli olmayan, koşulun bir girdiye göre denetlendiği durumlarda
        While ya da do-while döngüsü kullanılırken,
        diziler gibi, tekrar sayısı belirli olan durumlarda ise for döngüsü kullanılması tercih edilir. Ama yine bu yazılımcının kendisine bağlıdır.
        */

        int say ;
        Scanner input = new Scanner(System.in);

        for ( boolean run = true; run;){

            System.out.println("sayi gir :");
            say = input.nextInt();
            if ( say < 0 ) {
                run = false;
            }
        }

        // **-------> for la yapılandan while daha kısa


        System.out.println("sayi gir :");
        say = input.nextInt();
        while ( say > 0 ) {
            System.out.println("sayi gir :");
        }



        // **-------> while la yapılanda do while daha kısa

        do {
            System.out.println("sayi gir :");
            say = input.nextInt();
        }while ( say > 0 )  ;


    }
}
