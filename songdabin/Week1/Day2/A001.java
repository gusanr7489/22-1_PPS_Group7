import java.util.Arrays;

class Solution {
	public int findContentChildren(int[] g, int[] s) {
		int cnt = 0, idx = 0;
		
		Arrays.sort(g);
		Arrays.sort(s);
		
		for (int i = 0; i < s.length; i++) {
			for (int j = idx; j < g.length; j++) {
				if(g[j] <= s[i]){
					cnt++;
					idx = j + 1;
					break;
				}
			}
		}
		
		return cnt;
    }
}
