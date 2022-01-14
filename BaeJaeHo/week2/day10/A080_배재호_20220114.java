package week2;

import java.util.Arrays;

public class A080_πË¿Á»£_20220114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,3};
		System.out.println(majorityElement(nums));
	}
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
