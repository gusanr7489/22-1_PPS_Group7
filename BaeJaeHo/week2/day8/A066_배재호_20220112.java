package week2;

import java.util.Arrays;
import java.util.Scanner;

public class A066_¹èÀçÈ£_20220112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char[] c = new char[100];
		c = sc.nextLine().toCharArray();
		Arrays.sort(c);
		
		for(int i=c.length-1;i>=0;i--) System.out.print(c[i]);
	}

}
