package Giris;

import java.util.Scanner;

public class PassTheClass {

    public static void main(String[] args) {

        int average , i = 5 , matematik , fizik , turkce , kimya , muzik ;

        Scanner input = new Scanner(System.in);

        System.out.println("matematik notunuz :");
        matematik = input.nextInt();
        System.out.println("Turkce notunuz :");
        turkce = input.nextInt();
        System.out.println("Fizik notunuz :");
        fizik = input.nextInt();
        System.out.println("kimya notunuz :");
        kimya = input.nextInt();
        System.out.println("muzik notunuz :");
        muzik = input.nextInt();



        if( (100 < matematik )  || ( matematik < 0) ){ matematik = 0  ; i--; }
        if ((100 < turkce )  || ( turkce < 0) ){  turkce = 0 ; i--; }
        if ((100 < kimya )  || ( kimya < 0) ){  kimya = 0 ; i--; }
        if((100 < fizik )  || ( fizik < 0) ){ fizik = 0 ; i--; }
        if((100 < muzik )  || ( muzik < 0) ){ muzik =  0 ; i--; }


        average = ( matematik + turkce + fizik + kimya + muzik ) / i ;

        if (average<=55){
            System.out.println("kaldiniz :( seneye gorusuruz ;)");
        }else{
            System.out.println("Gectiniz");
        }

        System.out.println("ortalama : "+average);
    }

}
