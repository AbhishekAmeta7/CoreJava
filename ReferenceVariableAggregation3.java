import java.util.Scanner;

public class ReferenceVariableAggregation3 {
    CollegeStudentDetail csd ;
    ReferenceVariableAggregation3(CollegeStudentDetail csd){
        this.csd=csd;
    }
    void disp(){
        System.out.println("---------------x---------------");
        System.out.println("Name: "+csd.name);
        System.out.println("Father's Name: "+csd.fname);
        System.out.println("Mother's Name: "+csd.mname);
        System.out.println("Graduation: "+csd.graduation);
        System.out.println("Address: "+csd.address);
        System.out.println("Conatct: "+csd.contact);
        System.out.println("Group Name: "+csd.groupName);
        System.out.println("Semester: "+csd.sem);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Father's Name: ");
        String fname = sc.nextLine();
        System.out.print("Enter Mother's Name: ");
        String mname = sc.nextLine();
        System.out.print("Enter Draduation: ");
        String graduation = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Contact: ");
        long contact = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Group Name: ");
        String groupName = sc.nextLine();
        System.out.print("Enter Semester: ");
        int sem = sc.nextInt();
        CollegeStudentDetail c = new CollegeStudentDetail(name, fname, mname, graduation, address, contact, groupName, sem);
        ReferenceVariableAggregation3 rva = new ReferenceVariableAggregation3(c);
        rva.disp();
    }
}
