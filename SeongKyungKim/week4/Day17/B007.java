class Solution {
    public int search(int[] nums, int target) {
         int index = -1;
	        int lo = 0, hi = nums.length-1;
	        int mi;
	        while(lo <= hi) {
	        	mi = (lo+hi)/2;
	        	if(nums[mi] == target) {
	        		return mi;
	        	}
	        	else if(nums[mi] > target) hi = mi-1;
	        	else if(nums[mi] < target) lo = mi+1;
	   
	        }
	        return index;
    }
    
