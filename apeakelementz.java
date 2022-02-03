package practice;
import java.util.*;
class apeakelementz
{
	// Function to find the peak element
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		peakElement(arr,n);
	}
		
	// arr[]: input array
	// n: size of array a[]
	static void peakElement(int[] arr,int n)
    {
        int max=arr[0];
	    	for(int i=0;i<arr.length;i++) {
			    if(arr[i]>max) {
			    	max=arr[i];
			    	max=i;
		    	}
	    	}
	    	System.out.println(max);
    	}
     }

