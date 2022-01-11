import java.util.Arrays;
import java.util.Scanner;

public class A066 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		char[] N = new char[10];
		N = s.nextLine().toCharArray();
		Arrays.sort(N);
		
		for (int i = N.length - 1; i > -1; i--) {
			System.out.print(N[i]);
		}
	}
}
