package week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A073_πË¿Á»£_20220113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> answer = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) answer.add("FizzBuzz");
			else if(i%3==0) answer.add("Fizz");
			else if(i%5==0) answer.add("Buzz");
			else answer.add(Integer.toString(i));
		}
		for(String s:answer) System.out.print(s+" ");
		sc.close();
	}

}
