import java.util.*;

class SecondLargestNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    if((A>B && A<C) || (A<B && A>C)){
		        System.out.println(A);
		    }
		    else if((B>A && B<C) || (B<A && B>C)){
		        System.out.println(B);
		    }
		    else{
		        System.out.println(C);
		    }
		}
	}
}
