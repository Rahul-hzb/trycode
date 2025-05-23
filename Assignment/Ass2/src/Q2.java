//  Define a class called Complex with instance variables real, imag and instance methods
//• void setData ()
//• void display ()
//• public Complex add (Complex, Complex)
//Write the main method in a separate class to implement the addition of two complex number with the given
//method signature as above

import java.util.Scanner;
import java.util.concurrent.Callable;

class Complex{
    int real;
    int imag;
    public void setData(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    public void display(){
        System.out.println( " real " + real);
        System.out.println( " imag " + "!" + imag);
    }

    public Complex add(Complex com1, Complex com2) {
        Complex com3 = new Complex();
        com3.real=com1.real+com2.real;
        com3.imag=com1.imag+com2.imag;
        return com3;

    }

}
public class Q2 {
    public static void main(String[] args) {
        Complex com1=new Complex();
        Complex com2=new Complex();
        com1.setData(3,2);
        com1.display();
        com2.setData(2,5);
        com2.display();
        Complex com3=new Complex();
        com3= com3.add(com1,com2);
        System.out.println(" first complex no ");
        com1.display();
        System.out.println(" second complex no ");
        com2.display();
        System.out.println(" add c1 and c2");
        com3.display();

    }
}
