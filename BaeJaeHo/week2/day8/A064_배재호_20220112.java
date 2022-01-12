package week2;

import java.util.Arrays;

public class A064_πË¿Á»£_20220112 {

	public static void main(String[] args) {
		int[] heights = {1,1,4,2,1,3};
		System.out.println(heightChecker(heights));
	}
	 public static int heightChecker(int[] heights) {
	        int[] unsorted = heights.clone();
	        Arrays.sort(heights);
	        int cnt=0;
	        for(int i=0;i<unsorted.length;i++) if(unsorted[i] != heights[i]) cnt++;
	        return cnt;
	    }
}
