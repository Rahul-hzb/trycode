//Define a class Deposit. The instance variable of the class Deposit is mentioned below.
//Instance Variable
//Principal
//Time
//long
//integer
//Rate
//Total_amt
//double
//double
//Initialize the instance variables Principal, Time, rate through constructors.
//Constructors are overloaded with the following prototypes.
//• Constructor1: Deposit ()
//• Constructor2: Deposit (long, int, double)
//• Constructor3: Deposit (long, int)
//• Constructor4: Deposit (long, double)
//Apart from constructor, the other instance methods are
//• display ( ): To display the value of instance variables
//• calc_amt( ): To calculate the total amount.
//Total_amt = Principal + (Principal×rate×Time)/100;

import java.io.PrintStream;
import java.util.*;
class Deposit {
    long principal;
    int Time;
    double Rate;
    double Total_amt;
    // default constructor:

    Deposit ( ){
        this.principal=0;
        this.Time=0;
        this.Rate=0;
        this.Total_amt=0;
    }
    // Initialize principal,Time and Rate:
    Deposit( long principal, int Time , double Rate){
        this.principal= principal;
        this.Time=Time;
        this.Rate=Rate;
        calc_amt();
    }
    Deposit( long principal,int Time){
        this.principal=principal;
        this.Time=Time;
        this.Rate=0;
        calc_amt();
    }
    Deposit( long principal,double Rate){
        this.principal=principal;
        this.Rate=Rate;
        this.Time=0;
        calc_amt();
    }

     void calc_amt(){
        Total_amt=principal+(principal*Rate*Time)/100;
    }
     void display(){
        System.out.println(" Principal" + principal );
        System.out.println(" Time "+ Time);
        System.out.println(" Rate " + Rate);
        System.out.println(" Total Amount: " + Total_amt);
    }

}
public class Q4 {
    public static void main(String[] args) {
        Deposit d1 = new Deposit();
        Deposit d2 = new Deposit( 10000,5,7.5);
        Deposit d3= new Deposit( 5000,3);
        Deposit d4= new Deposit(20000,6.5);


        System.out.println(" Deposite 1 :");
        d1.display();
        System.out.println("\nDeposite 2 :");
        d2.display();
        System.out.println("\nDeposite 3 :");
        d3.display();
        System.out.println("\nDeposite 4");
        d4.display();

    }
}
