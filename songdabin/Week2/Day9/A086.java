import java.util.Arrays;
import java.util.Scanner;

public class A086 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String S = s.next();
		String[] str_arr = new String[S.length()];
		
		for (int i = 0; i < S.length(); i++) {
			str_arr[i] = S.substring(i, str_arr.length);
		}
		
		Arrays.sort(str_arr);
		
		for (int i = 0; i < str_arr.length; i++) {
			System.out.println(str_arr[i]);
		}
	}

}
