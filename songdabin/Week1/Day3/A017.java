import java.util.Scanner;

public class A017 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String n = s.next();
		int[] num_cnt = new int[9];
		int set = 0;
		
		n = n.replace('9', '6');
		
		for (int i = 0; i < n.length() ; i++) {
			int num = (int)(n.charAt(i) - 48);
			num_cnt[num]++;
		}
		
		if (num_cnt[6] % 2 == 0) num_cnt[6] /= 2;
		else num_cnt[6] /= 2 + 1;
		
		for (int i = 0; i < num_cnt.length; i++) {
			set = Math.max(num_cnt[i], set);
		}
		System.out.println(set);
	}
}
