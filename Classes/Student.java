package Giris.Classes;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat , int matSozlu , int fizik , int fizikSozlu  , int kimya , int kimyaSozlu  ) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }


        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if ( matSozlu >= 0 && matSozlu <= 100) {
            this.mat.sozluNote = matSozlu;
        }


        if (fizikSozlu >= 0 && fizikSozlu <= 100) {
            this.fizik.sozluNote = fizikSozlu;
        }

        if (kimyaSozlu >= 0 && kimyaSozlu <= 100) {
            this.kimya.sozluNote = kimyaSozlu;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.sozluNote == 0
                || this.fizik.sozluNote == 0 || this.kimya.sozluNote == 0) {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sinifi Gecti. ");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ( ( this.fizik.note * 0.8 + this.fizik.sozluNote * 0.2 ) + ( this.kimya.note * 0.8 + this.kimya.sozluNote * 0.2 )
                + ( this.mat.note * 0.8 + this.mat.sozluNote * 0.2 ) ) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik SozluNotu : " + this.mat.sozluNote);
        System.out.println("Fizik Notu: " + this.fizik.note);
        System.out.println("Fizik SozluNotu : " + this.fizik.sozluNote);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sozlu Notu : " + this.kimya.sozluNote);
    }

}