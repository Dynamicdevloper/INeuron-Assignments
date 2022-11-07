package INeuronAssignments;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int[] arr= {1,9,3,6,3,2};
		quickSort(arr,0, arr.length-1);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void quickSort(int[] input,int start,int end){
        if(start<end){
        	int i=partition(input,start,end);
            //System.out.println(i);
        	quickSort(input, start, i-1);
        	quickSort(input, i+1, end);
        }
    }
    public static int partition(int[] input,int start,int end){
        int pivot=input[start];
        int count =0;
        for(int i=start+1; i<=end; i++){
            if(input[i]<pivot)
                count++;
        }
        //System.out.println(count);
        int temp=input[start+count];
        input[start+count]=pivot;
        input[start]=temp;
        int i=start;
        int j=end;
        
        while(i<j){
            if(input[i]<pivot)
                i++;
            else{
                if(input[j]>=pivot)
                    j--;
                else{
                    int temp1=input[i];
                    input[i]=input[j];
                    input[j]=temp1;
                    i++;
                    j--;
                }
            }
        }
        //System.out.println(i+" "+j);
        return start+count;    
    }

}
