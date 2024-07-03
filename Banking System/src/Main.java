/*File Handling Exercise
* The Banking System has 4 options
*   1.Enter Customer details
*   2.Save customer Details to a text file
*   3.Retrieve Customer Details from a text file
*   4.Display Customer details with the Account Balance in Ascending Order
*/

/*TASK
1. IMPLEMENT STORING THE CUSTOMER DATA TO A TEXT FILE
2. IMPLEMENT RETRIEVING THE CUSTOMER DATA PREVIOUS STORED IN THE TEXT FILE AND RESUME THE APPLICATION
3. IMPLEMENT BUBBLE SORTING ALGORITHM BEFORE DISPLAYING THE ACCOUNT BALANCES
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    static int customerCount=0;
    static Person [] person=new Person[50];
    static Scanner sc = new Scanner(System.in);


    public static void menu(){
        System.out.print("""
                \n
                ***************** Welcome to Banking System ******************
                    1.Enter Customer details
                    2.Save customer Details to a text file
                    3.Retrieve Customer Details from a text file
                    4.Display Customer details with the Account Balance in Ascending Order
                    
                Select a option(0 to exit) :""");


    }

    public static void register(){
        if(customerCount<100) {
            System.out.print("Enter your Name :");
            String name = sc.next();
            System.out.print("Enter your Account Balance :");
            int balance = sc.nextInt();
            Person Customer = new Person(name, balance);
            person[customerCount]=Customer;
            customerCount++;
        }
        else {
            System.out.println("Maximum Number of users Registered");
        }


    }

    public static void saveDetails(){
        try {
            FileWriter myWriter = new FileWriter("CustomerData.txt");
            /*WRITE YOUR CODE HERE*/

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");

        }
    }

    public static void retrieveDetails(){

        try {
            File myObj = new File("CustomerData.txt");
            Scanner myReader = new Scanner(myObj);
            /*WRITE YOUR CODE HERE*/

            myReader.close();
            System.out.println("Successfully loaded the file.");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");

        }

    }

    public static void displayDetails(){
        if(customerCount>0) {
            System.out.println("\nCustomer Details:\n");

            for(int i=0; i<customerCount; i++) {
                System.out.println("Person "+(i+1)+" details:");
                System.out.println("Customer Name: "+person[i].getName());
                System.out.println("Account Balance :"+person[i].getBalance()+"\n");

            }
        }
    }



    public static void main(String[] args) {

        int choice=99;

        while (choice!=0){
            menu();
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    register();
                    System.out.println();
                    break;
                case 2:
                    saveDetails();
                    System.out.println();
                    break;
                case 3:
                    retrieveDetails();
                    System.out.println();
                    break;
                case 4:
                    displayDetails();
                    System.out.println();
                    break;
                case 0:
                    System.out.println("\nThank you for using our Banking System!");
                    break;
                default:
                    System.out.println("Please enter a valid option!\n");
            }
        }

    }
}