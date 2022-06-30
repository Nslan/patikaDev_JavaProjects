package Giris;
import java.util.Scanner;

public class GradePointAverageCalculator {

    public static void main(String[] args) {


        int sum , average , math , music , physics , chemistry , turkish , history;

        Scanner input = new Scanner(System.in);

        System.out.print("enter the math grade :");
        math = input.nextInt();

        System.out.print("enter the turkish grade : ");
        turkish = input.nextInt();

        System.out.print("enter the physics  grade :");
        physics = input.nextInt();

        System.out.print("enter the music grade : ");
        music = input.nextInt();

        System.out.print("enter the history grade :");
        history= input.nextInt();

        System.out.print("enter the chemistry grade : ");
        chemistry = input.nextInt();

        sum =  math + music + physics + chemistry + turkish + history;
        average = sum / 6 ;

        System.out.print("Average : " + average);

        boolean bResult = ( average > 60 );

        String str = bResult ? "Sinifi Gecti" : "Sinifta Kaldi" ;

        System.out.println( "\n"+str );
    }

}
