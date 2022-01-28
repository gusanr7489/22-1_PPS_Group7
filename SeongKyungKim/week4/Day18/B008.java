class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length-1;
	     int mi=0;
	     
	     while(lo <= hi) {
	    	 mi = (lo+hi)/2;
	    	 if(nums[mi] == target) return mi;
	    	 else if(nums[mi] > target) hi = mi-1;
	    	 else lo = mi+1;
	    	 
	     }
	      
	     if(nums[mi] < target) return mi+1;
	     else return mi;
    }
}
