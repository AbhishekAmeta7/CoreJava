import java.util.Scanner;
public class ReferenceVariableAggregation1 {
    Book book;
    ReferenceVariableAggregation1(Book book){
        this.book=book;
    }
    void show(){
        System.out.println("----------------------X----------------------");
        System.out.println("Title: "+book.title);
        System.out.println("Author: "+book.author);
        System.out.println("Type: "+book.type);
        System.out.println("Name: "+book.name);
        System.out.println("No. Of Page: "+book.page);
        System.out.println("Content: "+book.content);
        System.out.println("Price: "+book.price);
        System.out.println("Date: "+book.date);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter Type: ");
        String type = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Pages: ");
        int page = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Content: ");
        String content = sc.nextLine();
        System.out.print("Enter Price: ");
        int price = sc.nextInt();
        System.out.print("Enter Date: ");
        int date = sc.nextInt();
        Book b = new Book(title, author, type, name, page, content, price, date);
        ReferenceVariableAggregation1 rva = new ReferenceVariableAggregation1(b);
        rva.show();
    }
}
// file A
// book class 

// title 
// author 
// type
// name
// page
// content
// price 
// date

// file B
// work as data type variable 