package INeuronAssignments;
import java.util.*;
public class DuplicateInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,2,1,2,3,4};
		List<Integer> list=findDuplicates(arr);
		for(Integer i: list) {
			System.out.print(i+" ");
		}
	}
	
	public static List<Integer> findDuplicates(int[] nums) {
        
        // HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                list.add(nums[i]);
            }
            while(nums[i]==nums[i+1]){
                i++;
                if(i==nums.length-1) break;
            }
        }

        return list;
    }

}
