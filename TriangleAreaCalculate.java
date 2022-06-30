package Giris;
import java.util.Scanner;

public class TriangleAreaCalculate {

    public static void main(String[] args) {


        int  aEdge , bEdge , cEdge , area , perimeter , temp , temp1  ;

        Scanner input = new Scanner(System.in);

        System.out.println("enter side a of triangle");
        aEdge = input.nextInt();

        System.out.println("enter side a of triangle");
        bEdge = input.nextInt();

        System.out.println("enter side a of triangle");
        cEdge = input.nextInt();

        perimeter = aEdge + bEdge + cEdge ;
        System.out.println("perimeter of triangle : " + perimeter );

        temp = perimeter / 2 ;

        temp1 = temp * ( temp - aEdge ) * ( temp - bEdge ) * ( temp - cEdge ) ;

        area = (int) Math.sqrt( temp1 );

        System.out.println("area of triangle : " + area );


    }

}
