package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class A085_πË¿Á»£_20220119 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rep = Integer.parseInt(br.readLine());
		String[] serial = new String[rep]; 
		for(int i=0;i<rep;i++) {
			serial[i] = br.readLine();	
		}
		
		Arrays.sort(serial, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() > s2.length()) return 1;
				else if(s1.length() == s2.length()) return compare2(s1, s2);
				else return -1;
			}
			public int compare2(String s1, String s2) {
				int c1 = 0;
				int c2 = 0;
				for(char c : s1.toCharArray()) {
					if(Character.isDigit(c)) c1 += Character.getNumericValue(c);
				}
				for(char c : s2.toCharArray()) {
					if(Character.isDigit(c)) c2 += Character.getNumericValue(c);
				}
				if(c1 > c2) return 1;
				else if(c1 == c2) return compare3(s1,s2);
				else return -1;
			}
			public int compare3(String s1, String s2) {
				for(int i=0;i<s1.length();i++) {
					if(s1.charAt(i) != s2.charAt(i))
						return (int)s1.charAt(i)-(int)s2.charAt(i);
				}
				return 0;
			}
		});
	
		for(String s:serial) System.out.println(s);
		br.close();
	}
}
