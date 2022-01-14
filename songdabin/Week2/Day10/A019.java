import java.util.Scanner;

public class A019 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int mul = 1;
		String str_mul = "";
		int cnt = 0;
		
		for (int i = 0; i < 3; i++) {
			mul *= s.nextInt();
		}
		
		str_mul = Integer.toString(mul);
		
		for (int i = 0; i < 10; i++) {
			cnt = 0;
			for (int j = 0; j < str_mul.length(); j++) {
				if (str_mul.charAt(j) - '0' == i) cnt++;
			}
			System.out.println(cnt);
		}
	}

}
