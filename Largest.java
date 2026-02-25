package Sapthagiri1;
import java.util.Scanner;
public class Largest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a,b and c value:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a>b)&&(a>c)) {
			System.out.println("The largest value is a:"+a);
		}
		else if((b>a)&&(b>c)) {
			System.out.println("The largest value is b:"+b);
		}
		else {
			System.out.println("The largest value is c:"+c);
		}
	}
}