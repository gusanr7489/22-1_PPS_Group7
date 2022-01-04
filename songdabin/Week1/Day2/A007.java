import java.util.Scanner;

public class A007 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int asc = 0, des = 0;
		int[] arr = new int[9];
		
		for(int i = 0; i < 8; i++) arr[i] = s.nextInt();
		
		for(int i = 0; i < 8; i++) {
			if (arr[i] + 1 == arr[i+1]) asc ++;
			else if (arr[i] == arr[i+1] + 1) des++;
		}
		
		if (asc == 7) System.out.println("ascending");
		else if (des == 8) System.out.println("descending");
		else System.out.println("mixed");
	}

}
