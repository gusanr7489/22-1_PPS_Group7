import java.util.Arrays;
import java.util.Scanner;

public class A082 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] num = new int[10];
		int[] res = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 10; j++) num[j] = s.nextInt();
			Arrays.sort(num);
			res[i] = num[7];
		}

		for (int i = 0; i < n; i++) System.out.println(res[i]);
	}
	
}
