import java.util.Arrays;

public class LevelB_30 {
	public static void main(String args[]) {
		int[] nums = {3,-1,0,2};
		int k = 3;
		int result = largestSumAfterKNegations(nums, k);
		System.out.println(result);
		
	}
	
	
	 public static int largestSumAfterKNegations(int[] nums, int k) {
        int max_sum=0;
        for(int i=0; i<k; i++) {
        	Arrays.sort(nums);
        	nums[0] = -nums[0];
        }
        for(int i=0; i<nums.length; i++) {
        	max_sum += nums[i];
        }
        return max_sum;
    }

}
