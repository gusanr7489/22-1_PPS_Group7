
public class A056 {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] rtn = new int[nums1.length];
		
		for (int i = 0; i < nums1.length; i++) {
			boolean chk = false;
			
			for (int j = 0; j < nums2.length; j++) {
				if (j + 1 == nums2.length) rtn[i] = -1;
				
				if (nums1[i] == nums2[j]) chk = true;
				
				if (chk && nums1[i] < nums2[j]) {
					rtn[i] = nums2[j];
					break;
				}
			}
			
			if (!chk) rtn[i] = -1;
		}
		return rtn;
	}
}
