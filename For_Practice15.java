import java.util.Scanner;
public class For_Practice15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--:Choice:--\nfactorial\nreverse");
        System.out.print("Enter Your Choice: ");
        String ch = sc.next();
        if(ch.equals("factorial")){
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            int fact = 1;
            for(int i = num ;i>=1;i--){
                fact=fact*i;
            }
            System.out.println("Factorial Of "+num+" is: "+fact);
        }
           else if(ch.equals("reverse")){
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            int a = 0,result = 0;
            while(num>0){
                a = num%10;
                result = result*10+a;
                num=num/10;
               }
               System.out.println("Reverse Number: "+result);
        }
        else{
            System.out.println("! Invalid Choice !");
        }
    }
}
/*8) write and make a program user input any number and user input like factorial
 then calculate a factorial of code and user input a string like 
 reverse then calculate a reverse number only.*/