import java.util.Arrays;

public class LevelB_29 {
	public static void main(String args[]) {
		int[] nums = {6,2,6,5,1,2};
		int result = arrayPairSum(nums);
		System.out.println(result);
	}  
	
	
    public static int arrayPairSum(int[] nums) {
    	int max_sum=0;
    	Arrays.sort(nums);
    	for(int i=0; i<nums.length/2; i++) {
    		max_sum += nums[2*i];
    	}
        return max_sum;
    }

}
