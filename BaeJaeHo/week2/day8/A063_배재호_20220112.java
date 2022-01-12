package week2;

import java.math.BigInteger;

public class A063_배재호_20220112 {

	public static void main(String[] args) {
		System.out.println(addBinary("11", "1"));
		System.out.println(addBinary2("1001010111011", "100101110101001"));

	}
	public static String addBinary(String a, String b) {
		int n1 = Integer.parseInt(a);
		int n2 = Integer.parseInt(b);
		int n3 = n1+n2;
		String answer="";
		do {
			if(n3%10 >1) n3 +=8; // 2빼고 10더하기
			answer = n3%10 + answer;
			n3/=10;
		}while(n3>0);
		return answer;
	}
	public static String addBinary2(String a, String b) {
		BigInteger n1 = new BigInteger(a, 2);
		BigInteger n2 = new BigInteger(b, 2);
		BigInteger answer = n1.add(n2);
		
		return answer.toString(2);
		
	}
}
