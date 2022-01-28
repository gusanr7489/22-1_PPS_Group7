class Solution {
    public int tribonacci(int n) {
        int prev0 = 0, prev1 = 1, curr=1;
		int temp;
		if(n==0 || n==1) return n;
		else if(n==2) return 1;
		else {
			for(int i=3; i<=n; i++) {
				temp = curr;
				curr = prev0 + prev1 + curr;
				prev0 = prev1;
				prev1 = temp;
			}
		}
		return curr;
        
    }
    
    
}
