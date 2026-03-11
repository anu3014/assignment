package Package1;
import java.util.*;
public class Insertionsort{
	public static void main(String[] args) {
		int[]arr= {20,80,40,10,40};
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	}
}
//ADAVNTAGE
//insertion sort works very fast for nearly sorted array because it moves only a few elements 