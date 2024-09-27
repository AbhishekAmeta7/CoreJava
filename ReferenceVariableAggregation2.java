import java.util.*;
public class ReferenceVariableAggregation2 {
    TicketBooking tbook;
        ReferenceVariableAggregation2(TicketBooking tbook){
            this.tbook = tbook;
        }
        void display(){
            System.out.println("--------------x--------------");
            System.out.println("Name: "+tbook.name);
            System.out.println("Address: "+tbook.address);
            System.out.println("Contact: "+tbook.contact);
            System.out.println("Gender: "+tbook.gender);
            System.out.println("No Of Ticket: "+tbook.noOfTicket);
            System.out.println("Movie Name: "+tbook.movieName);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Contact: ");
        long contact = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter No Of Ticket: ");
        int noOfTicket = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();
        TicketBooking ticketeBook = new TicketBooking(name, address, contact, gender, noOfTicket, movieName);
        ReferenceVariableAggregation2 rva = new ReferenceVariableAggregation2(ticketeBook); 
        rva.display();
    }
}
// String name;
//     String address;
//     long contact;
//     String gender;
//     int noOfTicket;
//     String movieName;

// file A
// ticket booking class 
// name
// address
// contact
// gender
// total_number
// movie_name

// file B
// work as data type variable