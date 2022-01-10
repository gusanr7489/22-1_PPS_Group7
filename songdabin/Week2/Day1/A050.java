import java.util.Scanner;

public class A050 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String caesar = s.next();
		char[] origin = new char[1000];
		
		for (int i = 0; i < caesar.length(); i++) {
			if (caesar.charAt(i) - 3 < 'A') {
				origin[i] = (char)(caesar.charAt(i) + 23);
			}
			else {
				origin[i] = (char)(caesar.charAt(i) - 3);
			}
		}
		
		for (int i = 0; i < caesar.length(); i++) {
			System.out.print(origin[i]);
		}
	}
}
