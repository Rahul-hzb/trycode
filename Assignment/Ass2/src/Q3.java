// Q3   Define a class named Book with the following member variables:
//• bookId (an integer representing the unique ID of the book)
//• price (a double representing the price of the book)
//• quantity (an integer representing the quantity of books purchased)
//Additionally, include a static variable totalAmount to keep track of the total amount spent on all books.
//The class should have:
//• A parameterized constructor to initialize the bookId, price, and quantity. Note: Use “this”.
//• A displayDetails() method to print the details of the book (i.e., bookId, price, quantity).
//• A method to calculate and return the total cost for that book (price * quantity).
//• Update the static variable totalAmount to include the total cost of the book purchased.
//Now, write a separate Main class to simulate the purchasing of 5 different books. Display the details of each
//book, and finally, display the total amount spent on the purchase o


import java.util.*;
class Book{
    int bID;
    double price;
    int quantity;
    static double tAmount=0;
    Book(int bID, double price,int quantity){
        this.bID=bID;
        this.price=price;
        this.quantity=quantity;
        // update the totalAmount;
        tAmount+=totalCost();
    }
    public void display(){
        System.out.println( "Book ID " + bID);
        System.out.println(" Price of one book " + price);
        System.out.println(" Quantity of book  " + quantity);
        System.out.println(" total cost " + totalCost());
        System.out.println( " -----------------");

    }
    public double totalCost( ){
        return price*quantity;
    }

}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book arr[]=new Book[5];
        for(int i=0;i<arr.length;i++){
            System.out.println(" Entre detail for book " +( i+1)+ " :");
            System.out.println(" Book id ");
            int bID = sc.nextInt();
            System.out.println("Price of Book");
            double price = sc.nextDouble();
        System.out.println("Quantity of book ");
            int quantity= sc.nextInt();
            // creating object
            arr[i]=new Book(bID,price,quantity);
            }
            // display details of all book
            System.out.println( "\n purchase details ");
        for(Book book : arr){
            book.display();
        }
        // display total amount spend on book
        System.out.println(  " total amount of book " +Book.tAmount);

        sc.close();
    }
}
