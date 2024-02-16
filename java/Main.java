import java.util.*;
//TO RUN THIS CODE YOU HAVE TO STORE PERSON/TICKETS/Main Java files in the same directory
//this main class doesnt consist the whole program,it only includes the part where we create a seats array and implementing object arrays(ticket)
public class Main {
    public static void main(String[] args) {
        //seats array represents the layout of our movie theatre
        int [][] seats=new int[3][];
        seats[0]=new int[12];
        seats[1]=new int[16];
        seats[2]=new int[20];
        //creating a object array,the type of the array is Tickets and it can store tickets data type
        Tickets [] tickets= new Tickets[48];
        //entering dummy data
        //creating two ticket objects and checking if this works
        for(int i=0;i<2;i++){
            String row= null;
            int seat= 0;
            int Price= 0;
            String name= null;
            String surname= null;
            String email= null;
            try {
                System.out.print("Enter Row: ");
                row = new Scanner(System.in).nextLine();
                System.out.print("Enter Seat: ");
                seat = new Scanner(System.in).nextInt();
                System.out.print("Enter Price: ");
                Price = new Scanner(System.in).nextInt();
                System.out.print("Enter Name: ");
                name = new Scanner(System.in).nextLine();
                System.out.print("Enter Surname: ");
                surname = new Scanner(System.in).nextLine();
                System.out.print("Enter Email: ");
                email = new Scanner(System.in).nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Enter valid input\nError code: "+e);;
            }
            //we have to create a person object first since we are passing the person object as a parameter to our Tickets constructor
            Person person=new Person(name,surname,email);
            Tickets ticket=new Tickets(row,seat,Price,person);
            //assigns the created object into the ticket array
            tickets[i]=ticket;


        }
        //sample printing the stored object
        //we can only print the o index and 1 index since we only created 2 objects tho our array size is 54
        Tickets j=tickets[0];
        j.info();
        //info method is in class Tickets

    }
}