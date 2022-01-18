package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class A049_πË¿Á»£_20220118 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> text = new ArrayList<>();
		while(sc.hasNextLine()) {
			String txt = sc.nextLine();
			if(!txt.equals("end")) text.add(txt);
			else break;
//			System.out.println(text+" "+txt);
		}
		for(String txt : text) {
			System.out.print("<"+txt+"> is ");
			if(test1(txt) && test2(txt) && test3(txt)) System.out.println("acceptable.");
			else System.out.println("not acceptable.");
		}
	}
	
	public static boolean test1(String text) {
		String[] vowels= {"a", "e", "i", "o", "u"};
		for(String v:vowels) if(text.contains(v)) return true;
		return false;
	}
//	public static boolean test2(String text) {
//		char[] txt = text.toCharArray();
//		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//		for(int i=0;i<txt.length;i++) {
//			for(char v : vowels) {
//				if(txt[i]==v) {
//					txt[i]='1';
//					break;
//				}
//				else txt[i]='0';
//			}
//		}
//		System.out.println(String.valueOf(txt));
//		if(String.valueOf(txt).contains("000") || String.valueOf(txt).contains("111"))
//			return false;
//		return true;
//	}
	public static boolean test2(String text) {
		char[] txt = text.toCharArray();
		for(int i=0;i<txt.length;i++) {
			if(txt[i]=='a' || txt[i] =='e' || txt[i]=='i' || txt[i]=='o' || txt[i]=='u') {
				txt[i]='1';
			}
			else txt[i]='0';
		}
//		System.out.println(String.valueOf(txt));
		if(String.valueOf(txt).contains("000") || String.valueOf(txt).contains("111"))
			return false;
		return true;
	}
	public static boolean test3(String text) {
		char[] txt = text.toCharArray();
		for(int i=1;i<txt.length;i++){
			if(txt[i] == txt[i-1] && txt[i] != 'e' && txt[i] !='o') return false;
		}
		return true;
	}
}
