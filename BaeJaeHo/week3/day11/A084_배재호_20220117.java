package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A084_πË¿Á»£_20220117 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();

		String[] answer = new String[word.length()];
		for(int i=0;i<word.length();i++){
			answer[i] = word.substring(i, word.length());
		}
		Arrays.sort(answer);
		for(String s: answer) System.out.println(s);
	}
}
