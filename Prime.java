package Sapthagiri1;
import java.util.Scanner;
public class Prime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=sc.nextInt();
		boolean isprime=true;
		if(n<=1) {
			isprime=false;
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					isprime=false;
				}
			}
		}
		if(isprime) {
			System.out.println("Its a prime number");
		}
		else {
			System.out.println("Its not a prime number");
		}
	}
}