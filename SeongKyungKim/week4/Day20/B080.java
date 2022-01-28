class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
	    int count1 =0;
	    
		for(int i=0; i<=n; i++) {
			String binary = Integer.toBinaryString(i);
			char[] binums = binary.toCharArray();
			count1 = 0;
			for(int j=0; j<binums.length; j++) {
				if(binums[j] == '1') count1++;
			}
			ans[i] = count1;
		}
		
		
		return ans;
    }
}
