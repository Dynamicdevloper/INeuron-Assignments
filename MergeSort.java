package INeuronAssignments;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,3,4,8,1,9};
		mergeSort(arr);
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
	}
	
	public static void mergeSort(int[] arr) {
		
		if(arr.length<=1) {
			return;
		}
		
		int[] b= new int[arr.length/2];
		int[] c=new int[arr.length-b.length];
		
		for(int i=0; i<arr.length/2; i++) {
			b[i]=arr[i];
		}
		
		for(int i=arr.length/2; i<arr.length; i++) {
			c[i-arr.length/2]=arr[i];
		}
		
		mergeSort(b);
		mergeSort(c);
		merge(b,c,arr);
	}
	
	public static void merge(int[] b, int[] c, int[] arr) {
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<b.length && j<c.length) {
			
			if(b[i]<c[j]) {
				arr[k]=b[i];
				i++;
				k++;
			}else {
				arr[k]=c[j];
				j++;
				k++;
			}
		}
		
		while(i<b.length) {
			arr[k]=b[i];
			i++;
			k++;
		}
		
		while(j<c.length) {
			arr[k]=c[j];
			j++;
			k++;
		}
	}

}
