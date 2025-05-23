// Q1 Define a class Car with two instance variables: model and year
//Two member methods are:
//• setDetails(): Set the details of the car.
//• displayDetails(): Display the details of the car.
//Now, create two objects of the Car class:
//• Initialize the first object's values directly (by using the dot. operator) with model: "Toyota" and year:
//2020.
//• Accept the model and year through the keyboard input and set them to another object using the
//setDetails() method.
//Now, display the details of both cars using the displayDetails() method.
//Also, check which car is newer.

import java.util.Scanner;

class car{
    String model;
    int year;
    public void  setDetails(String model, int year){
        this.model=model;
        this.year=year;
    }
    public void displayDetails(){
        System.out.println( " model of car " + model);
        System.out.println(" year " + year);

    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car car1=new car();
        car car2=new car();
        car1.setDetails("toyota",2020);
        car2.setDetails(" maruti" , 2023);
        car1.displayDetails();
        car2.displayDetails();
        if( car1.year>car2.year){
            System.out.println(" car1 is newer");
        }else {
            System.out.println(" car2 is newer");
        }


        // make an array to put detail of five car



    }
}
