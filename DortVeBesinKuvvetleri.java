package Giris;


import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {

        int value;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number:");
        value = scanner.nextInt();

        System.out.println("4'un kuvvetleri :");
        for (int i=1; i <= value ; i*=4 ){

                System.out.println(i);


        }

        System.out.println("\n5'in katlari :");
        for (int j=1; j <= value ; j*=5 ){

                System.out.println(j);


        }

    }

}
