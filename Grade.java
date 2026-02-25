package Sapthagiri1;
import java.util.Scanner;
public class Grade{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of student:");
		int marks=sc.nextInt();
		int grade=marks/10;
		switch(grade) {
		case 10:
		case 9:
			System.out.println("Grade A");
			break;
		case 8:
			System.out.println("Grade B");
			break;
		case 7:
			System.out.println("Grade C");
			break;
		case 6:
			System.out.println("Grade D");
		default:
			System.out.println("Grade F");
		}
	}
}