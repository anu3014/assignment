package Sapthagiri1;
import java.util.Scanner;
public class Multiply{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the multiplication value n");
		int n=sc.nextInt();
		int multi;
		System.out.println("Multiplication table of "+n+ " "+"is");
		for(int i=1;i<=10;i++) {
			multi=n*i;
			System.out.println(multi);
		}
	}
}