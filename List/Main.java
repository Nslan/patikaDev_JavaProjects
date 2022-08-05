package List;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> list1 = new MyList<Integer>();
        System.out.println("Dizideki Eleman Sayısı : " + list1.size());
        System.out.println("Dizinin Kapasitesi : " + list1.getCapacity());
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + list1.size());
        System.out.println("Dizinin Kapasitesi : " + list1.getCapacity());
        list1.add(50);
        list1.add(60);
        list1.add(70);
        list1.add(80);
        list1.add(90);
        list1.add(100);
        list1.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + list1.size());
        System.out.println("Dizinin Kapasitesi : " + list1.getCapacity());

        System.out.println("");

        MyList<Integer> lists = new MyList<Integer>();
        lists.add(10);
        lists.add(20);
        lists.add(30);
        System.out.println("2. indisteki değer : " + lists.get(2));
        lists.remove(2);
        lists.add(40);
        lists.set(0, 100);
        System.out.println("2. indisteki değer : " + lists.get(2));
        System.out.println(lists.toString());

        System.out.println("");

        MyList<Integer> liste = new MyList<Integer>();
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(20);
        liste.add(50);
        liste.add(60);
        liste.add(70);
        System.out.println(liste.toString());
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + liste.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + liste.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + liste.lastIndexOf(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizzi = liste.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizzi[0]);

        // Liste veri türünde alt bir liste oluşturdu
        MyList<Integer> altListe = liste.subList(0, 3);
        System.out.println(altListe.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste.clear();
        System.out.println(liste.toString());


    }

}
