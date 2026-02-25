package Sapthagiri1;
import java.util.Scanner;
public class Check{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		if(n>0) {
			System.out.println("The entered number is positive:"+n);
		}
		else if(n<0) {
			System.out.println("The entered number is negative:"+n);
		}
		else {
			System.out.println("The enterd number is zero");
		}
	}
	
}