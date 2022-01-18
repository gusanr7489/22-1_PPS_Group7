import java.util.Scanner;
import java.util.Arrays;

public class LevelA_77 {
	public static void main(String args[]) {
		int sum=0;
		int[] nums = new int[8];
		int[] temp = new int[8];
		int[] index = new int [5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<8; i++) {
			nums[i] = sc.nextInt();
		  temp[i] = nums[i];
		}
		
		Arrays.sort(temp);
		
		for(int i=3; i<8; i++) {
			sum += temp[i];
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<8; j++) {
				if(temp[3+i] == nums[j]) {
					index[i] = j+1;
					break;
				}
			}
		}
		Arrays.sort(index);
		
		System.out.println(sum);
		
		for(int i=0; i<5; i++) {
			System.out.print(index[i]+" ");
		}
		
		sc.close();
	}
}


