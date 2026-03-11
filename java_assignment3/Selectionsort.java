package Package1;
import java.util.*;
public class Selectionsort{
	public static void main(String[] args) {
		int[]arr= {30,20,80,60,10,50};
		int n=arr.length;
		int min;
		for(int i=0;i<n-1;i++) {
			min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
			}
		}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
		}
	}
// COMPARISON WITH BUBBLE SORT
// bubble sort swaps many times, while selection sort swaps only once per pass