// Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a java program to
//display area of different shapes


import java.util.*;
abstract class Shape {
    abstract double CalculateArea();
}
class Sqr extends Shape{
    double side;
    Sqr(double side){
        this.side=side;
    }
    double CalculateArea(){
        return side*side;
    }

}
class Tri extends Shape{
    double b;
    double h;
    Tri( double b , double h){
        this.b=b;
        this.h=h;
        }
        double CalculateArea(){
        return b*h;
    }
    class Circle extends Shape{
        double r;
        Circle( double r){
           this. r=r;
        }
        double CalculateArea() {
            return 3.14*r;
        }

        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Shape square= new Shape(4);
    }
}
