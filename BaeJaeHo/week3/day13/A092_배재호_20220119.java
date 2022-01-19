
package week3;

import java.util.ArrayList;

public class A092_πË¿Á»£_20220119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int i : nums) {
        	if(i%2==0) even.add(i);
        	else odd.add(i);
        }
        for(int i=0;i<nums.length;i++) {
        	if(i%2==0) nums[i] = even.get(i/2);
        	else nums[i] = odd.get(i/2);
        }
        return nums;
    }
}
