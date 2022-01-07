import java.util.Scanner;

public class A047 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		int idx = 0;
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			idx++;
			if (idx == 10) {
				idx = 0;
				System.out.println();
			}
		}
	}

}
