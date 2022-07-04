package Giris;

public class WhileIleIkıSayınınOrtasındakiSayıyıBulma {

    public static void main(String[] args) {

        int left = 100 , right = 300;

        while ( ++left < --right ) ; // eger while içine birsey yazmayacaksan boylede yazabilirsin

        System.out.println("Orta nokta :" + left );
        System.out.println("Orta nokta :" + right );

    }

}
