package week3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class A090_πË¿Á»£_20220119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int removeDuplicates(int[] nums) {
        TreeSet<Integer> hs = new TreeSet<Integer>();
		for(int i:nums) hs.add(i);
		int cnt=0;
		for(int i: hs) {
			System.out.println(i);
			nums[cnt] = i;
			cnt++;
		}
		return hs.size();
		
    }
}
