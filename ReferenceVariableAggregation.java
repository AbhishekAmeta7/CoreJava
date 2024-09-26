import java.util.Scanner;
public class ReferenceVariableAggregation {
    Employee emp;
       int num;
       ReferenceVariableAggregation(Employee emp , int num){
        this.emp=emp;
        this.num=num;
       } 
       void show(){
        System.out.println("--------------------X--------------------");
        System.out.println("ID: "+emp.id);
        System.out.println("Name: "+emp.name);
        System.out.println("Company Name: "+emp.companyName);
        System.out.println("Department: "+emp.department);
        System.out.println("Contact: "+emp.contact);
        System.out.println("Address: "+emp.address);
        System.out.println("Email: "+emp.email);
        System.out.println("Password: "+emp.password);
        System.out.println("Salary: "+emp.salary);
        System.out.println("Num: "+num);
       }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Id: ");
       int id = sc.nextInt();
       sc.nextLine();
       System.out.print("Enter Name: ");
       String name = sc.nextLine();
       System.out.print("Enter Company Name: ");
       String companyName = sc.nextLine();
       System.out.print("Enter Department: ");
       String department = sc.nextLine();
       System.out.print("Enter Contact: ");
       long contact = sc.nextLong();
       sc.nextLine();
       System.out.print("Enter Address: ");
       String address = sc.nextLine();
       System.out.print("Enter Email: ");
       String email = sc.nextLine();
       System.out.print("Enter Password: ");
       String password = sc.nextLine();
       System.out.print("Enter Salary: ");
       int salary = sc.nextInt();
       System.out.print("Enter Number: ");
       int num = sc.nextInt();

       Employee empl = new Employee(id, name, companyName, department, contact, address, email, password, salary);
       ReferenceVariableAggregation rva = new ReferenceVariableAggregation(empl, num);
       rva.show();
    }
}
// file A 
// employe 
// id
// name
// companyname
// department
// contact
// address 
// email
// password 
// salary 
// file B 
// aggregation and class data type variable used .
// work as data type variable