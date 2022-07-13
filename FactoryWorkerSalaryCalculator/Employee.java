package Giris.FactoryWorkerSalaryCalculator;

public class Employee {

    String name ;
    double salary ;
    int workHours ;
    int hireYear ;

    //constructor
    Employee(String name,double salary, int workHours,int hireYear){
        this.name = name ;
        this.salary = salary ;
        this.workHours = workHours ;
        this.hireYear = hireYear ;
    }

    //vergi
    double tax(){
        double tax = 0;
        if ( salary >= 1000){
            tax = salary * 0.03 ;
        }
        return tax;
    }

    double bonus(){
        double shiftSalary = 0; //mesai ucreti
        if ( workHours > 40 ){
            shiftSalary = ( workHours - 40 ) * 30 ;
        }
        return shiftSalary;
    }

    double raiseSalary(){

        int year = 2021 - hireYear;
        double raise  = 0 ;



        if ( year < 10 ){
            raise = salary * 0.05;
        }
        if ( year >= 10 && year < 20 ) {
            raise = salary * 0.1 ;
        }
        if ( year >= 20  ) {
                raise = salary * 0.15 ;
        }

        return raise;
    }

    public String toString(){
        String s = "Adi : " + name + "\nMaasi : " + salary +"\nCalisma Saati : "+workHours
                + "\nBaslangic Yili : " + hireYear + "\nVergi : " + tax()
                + "\nBonus : " + bonus() + "\nMaas Artisi : " + raiseSalary()
                + "\nVergi ve Bonuslar ile birlikte maas : " + ( salary + bonus() - tax() )
                + "\nToplam Maas : " + ( salary + bonus() - tax() + raiseSalary() ) ;
        return s;
    }

}
