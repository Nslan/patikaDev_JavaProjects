package Giris;

import java.util.Scanner;

public class GirilenSayılardanDordunKatlarınıYakalaVeToplamlarınıDondur {

    public static void main(String[] args) {

        int value , sum = 0;
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        do {
            System.out.println("Enter number : ");
            value = scanner.nextInt();
            i++;

            if (value % 4 == 0 ){
                sum+=value;
            }

        }while ( value % 2 == 0);


        System.out.println(sum);

    }

}
