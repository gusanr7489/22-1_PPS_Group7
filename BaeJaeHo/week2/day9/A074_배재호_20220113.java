package week2;

import java.util.Scanner;

public class A074_πË¿Á»£_20220113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(isPalindrome(s));
		sc.close();
	}
	public static boolean isPalindrome(String s) {
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		s=s.toLowerCase();
		
		for (int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
		}
		
		return true;
	}
}
