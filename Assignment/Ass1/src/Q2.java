// Q2. The body mass index (BMI) is commonly used by health and nutrition professionals to estimate
//human body fat in populations. It is computed by taking the individual's weight (mass) in
//kilograms and dividing it by the square of their height in meters. i.e.
//Metric:  BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)
// (𝑯𝒆𝒊𝒈𝒉𝒕)𝟐 (𝒎𝟐
import java.util.Scanner;
public class Q2 {
    public static double calculateBMI(double m, double h) {
        return m / (h * h);
    }
    public static void main(String[] args) {
        System.out.println(" enter value of mass and value height");
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double h = sc.nextDouble();
        if( calculateBMI(m,h)< 18.5){
            System.out.println( " underweight ");
        }else if(calculateBMI(m,h)>18.5 && calculateBMI(m,h) <=24.9 ){
            System.out.println( " Normal weight ");
        }else if( calculateBMI(m,h)>25.5 && calculateBMI(m,h)<=29.9 ){
            System.out.println( " overweight ");
        }else if (calculateBMI(m,h)>30.0){
            System.out.println( " obese ");

        }
        System.out.println();


    }

}
