import java.util.Arrays;

public class A064 {
	public int heightChecker(int[] heights) {
		int cnt = 0;
		int[] cpy = new int[heights.length];
		
		for (int i = 0; i < heights.length; i++) {
			cpy[i] = heights[i];
		}
		
		Arrays.sort(cpy);
		
		for (int i = 0; i < heights.length; i++) {
			if (cpy[i] != heights[i])
				cnt++;
		}
		
		return cnt;
	}
}
