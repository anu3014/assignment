package Sapthagiri1;
import java.util.Scanner;
public class Sum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;
		int sum=0;
		while(i<=100) {
			if(i%2==0) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println("sum of the even numbers between 1 to 100 is:"+sum);
	}
}