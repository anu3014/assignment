package Package1;
import java.util.*;
public class Findingmajority{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the array element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ccount=arr[0];
		int count=1;
		for(int i=0;i<n;i++) {
			if(arr[i]==ccount) {
				count++;
			}
			else {
				count--;
			}
			if(count==0) {
				ccount=arr[i];
				count=1;
			}
		}
		System.out.println("Majority element is "+ccount);
	}
}