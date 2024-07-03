/*File Handling Exercise
* The Banking System has 4 options
*   1.Enter Customer details
*   2.Save customer Details to a text file
*   3.Retrieve Customer Details from a text file
*   4.Display Customer details with the Account Balance in Ascending Order
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
            for(int i=0; i<customerCount; i++){
                if (person[i]!=null){
                    myWriter.write(person[i].getName()+" ");
                    myWriter.write(person[i].getBalance()+"\n");
                }

            }
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
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String [] dataarray=data.split(" ");
                person[customerCount]=new Person(dataarray[0],Integer.parseInt(dataarray[1]));
                customerCount++;
            }
            myReader.close();
            System.out.println("Successfully loaded the file.");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");

        }

    }

    public static void displayDetails(){
        if(customerCount>0) {
            System.out.println("\nCustomer Details:\n");
/*
            Method 1
            Retreiving account balance from all the customer and entering it inside a new "bankbalance" array
            int [] bankbalance=new int[customerCount];
            for(int i=0; i<customerCount; i++) {
                bankbalance[i]=person[i].getBalance();
            }

            Bubble Sorting and entering the balances

            int temp=0;
            for(int i=0; i<customerCount; i++) {
                for(int j=0; j<customerCount-i-1; j++) {
                    if(bankbalance[j]>bankbalance[j+1]) {
                        temp=bankbalance[j];
                        bankbalance[j]=bankbalance[j+1];
                        bankbalance[j+1]=temp;
                    }
                }
            }
*/


           /* *//*Printing Customer details*//*
            for(int i=0; i<customerCount; i++) {
                for(int j=0; j<customerCount; j++) {
                    if(bankbalance[i]==person[j].getBalance()) {
                        System.out.println("Customer Name: "+person[j].getName());
                        System.out.println("Account Balance :"+person[j].getBalance()+"\n");
                    }
                }

            }*/


/*           /* Method 2*/
            Person temp;

            for(int i=0; i<customerCount; i++) {
                for (int j=0; j<customerCount-i-1; j++) {
                    if (person[j].getBalance()>person[j+1].getBalance()) {
                        temp = person[j];
                        person[j] = person[j+1];
                        person[j+1] = temp;
                    }
                }
            }



            /*Printing details the same order*/
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