import java.util.Scanner;
class Library{
    private int no_Of_Books;
    private String book_Title;
    private String book_Author;
    private String name;
    private long phNo;
    private String email;
    public void setDetails(String name,long phNo,String email){
        this.name=name;
        this.phNo = phNo;
        this.email = email;
    }
    Library(int no_Of_Books,String book_Title,String book_Author){
        this.no_Of_Books=no_Of_Books;
        this.book_Title=book_Title;
        this.book_Author=book_Author;
    }
    void printDetail(){
        System.out.println("---------------X---------------");
        System.out.println("Name: "+name+"\nEmail: "+email+"\nPhone No: "+phNo);
        System.out.println("---------------X---------------");
    }
    void adding(int n){
        no_Of_Books+=n;
        System.out.println("No. Of .Books: "+no_Of_Books);
    }
    void removing(int n){
        no_Of_Books-=n;
        System.out.println("No. Of .Books: "+no_Of_Books);
    }
    void searching(String bookTI){
        this.book_Title=bookTI;
        if(bookTI.equals("The Adventures of Huckleberr")){
            System.out.println("Yes ! This Book Available 5 Copy: ");
        }
        else{
            System.out.println("Not found");
        }
    }
}
public class LibraryEx {
    public static void main(String[] args) {
        System.out.println("a-->Add Book\nr-->Get Book\ns-->Search Book\ne-->Exit");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone No: ");
        long phno = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        
        Library l = new Library(5,"The Adventures of Huckleberr"," Mark Twain");
        l.setDetails(name,phno,email);
        l.printDetail();
        for(int i=0;i<10;i++){
            System.out.print("Enter Choice: ");
            char ch = sc.next().charAt(0);
            switch(ch){
                case 'a':
                    System.out.print("How many books will you add: ");
                    int n = sc.nextInt();
                    l.adding(n);
                    break; 
                case 'r':
                    System.out.print("How many books would you like to read: ");
                    n = sc.nextInt();
                    l.removing(n);
                    break;
                case 's':
                sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String bookT =sc.nextLine();
                    l.searching(bookT);
                    break;
                case 'e':
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid Choice....");
            }
        }
        l.printDetail();
    }
}
