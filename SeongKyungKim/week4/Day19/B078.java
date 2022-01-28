class Solution {
    public int getMaximumGenerated(int n) {
		int[] nums = new int[n+1];
		int max = 0;
		nums[0] = 0;
		if(n>0) nums[1] = 1;
		
		for(int i=1; i<=n/2; i++) {
			nums[2*i] = nums[i];
			if(2*i+1 <= n)
				nums[2*i+1] = nums[i] + nums[i+1];
		}
		
		for(int i=0; i<nums.length; i++) {
			if(max < nums[i]) max= nums[i];
		}
		
		return max;
    }
}
