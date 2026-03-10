package Package1;
import java.util.*;
public class Prefixsum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the array element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int [] temp=new int[n];
		temp[0]=arr[0];
		for(int i=1;i<n;i++) {
			temp[i]=temp[i-1]+arr[i];
		}
		System.out.println(Arrays.toString(temp));
	}
}