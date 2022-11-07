package INeuronAssignments;

import java.util.Arrays;

public class IsSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,9};
		int arr1[]= {1,2,3,4,9};
		
		System.out.println(isSubsetCheck(arr, arr1));
		
	}
	
	public static boolean isSubsetCheck(int[] arr, int[] arr1) {
		
		Arrays.sort(arr);
		for(int i=0; i<arr1.length; i++) {
			if(!binarySearch(arr, 0, arr.length-1,arr1[i])) return false;
		}
		return true;
	}
	
	public static boolean binarySearch(int[] arr, int start, int end, int num) {
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(arr[mid]==num) return true;
			
			else if(arr[mid]<num) {
				start=mid+1;
			}
			
			else {
				end=mid-1;
			}
		}
		return false;
	}

}
