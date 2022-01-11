import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A065 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int test = s.nextInt();
		int[][] xy = new int[test][2];
		
		for (int i = 0; i < test; i++) {
			xy[i][0] = s.nextInt();
			xy[i][1] = s.nextInt();
		}
		
		Arrays.sort(xy, new Comparator<int[]>(){
			public int compare(int[] arr1,int[] arr2) {
				if(arr1[0] > arr2[0]) { //x 좌표
					return 1;
				}
				else if(arr1[0] < arr2[0]){
					return -1;
				}
				else {
					return arr1[1] - arr2[1];
				}
			}
		});
		
		for (int i = 0; i < test; i++) {
			System.out.println(xy[i][0] + " " + xy[i][1]);
		}
	}
}
