import java.util.Scanner;

public class A034 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] num = new int[10];
		int[] rem = new int[10];
		int[] rem_cnt = new int[42];
		int cnt = 0;
		
		for (int i = 0; i < 10; i++) {
			num[i] = s.nextInt();
			rem[i] = num[i] % 42;
			rem_cnt[rem[i]]++;
		}
		
		for (int i = 0; i < 42; i++) {
			if (rem_cnt[i] > 0) cnt++;
		}
		
		System.out.println(cnt);
	}

}

