/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication35;
import java.util.Scanner;
/**
 *
 * @author Vedika
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner task3= new Scanner (System.in);

        //declare the variables
        int number = 0;
        int quantity = 0;
        double price= 0;
        double total= 0;

        //create the big while loop because al lot of steps are repeated

        //prompt user to enter prodect number
        while(number !=0){
            System.out.print("Enter product number:");
            number= task3.nextInt();

            //if number is 0 then break
            if (number==0){
                break;
            }

            task3. nextLine();
            //prompt user to enter quantity sold
            System.out.print("Enter quantity sold: ");
            quantity= task3.nextInt();
            task3.nextLine();

            //assign the prices to the product numbers
            switch (number){
                case (1):
                    price = 2.98 ;
                    break;
                case(2):
                    price =4.50;
                    break;
                case (3):
                    price = 9.98;
                    break;
                case(4):
                    price = 4.49;
                    break;
                case 5:
                    price = 6.97;
                    break;
                default:
                    price = 0;
                    System.out.println("the product number is invalid");
                    return;
            }
            //calculate the total retail value
            total += price * quantity;
        }
        //display the total retail value of sold product
        System.out.printf("%.2f",total);
    }
}
